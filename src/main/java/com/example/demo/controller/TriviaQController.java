package com.example.demo.controller;

/**
 * Created by xjw on 9/17/18.
 */
import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.repository.TriviaQRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.TriviaQ;

/**
 * Created by xjw on 9/16/18.
 */
@RestController
public class TriviaQController {

    @Autowired
    private TriviaQRepository triviaQRepository;

    @Autowired
    private QsetController qsetController;

    @Autowired
    private UserController userController;

    @GetMapping(value = "/triviaQs")
    public List<TriviaQ> triviaQList() {
        return (List<TriviaQ>) triviaQRepository.findAll();
    }

    @PostMapping(value = "/triviaQs")
    public TriviaQ triviaQAdd(@RequestParam("description") String description,
                                  @RequestParam("option1") String option1,
                                  @RequestParam("option2") String option2,
                                  @RequestParam("option3") String option3,
                                  @RequestParam("option4") String option4,
                                  @RequestParam("answer") String answer)
    {
        TriviaQ triviaQ = new TriviaQ();
        triviaQ.setDescription(description);
        triviaQ.setOption1(option1);
        triviaQ.setOption2(option2);
        triviaQ.setOption3(option3);
        triviaQ.setOption4(option4);
        triviaQ.setAnswer(answer);

        TriviaQ triviaQ1 = triviaQRepository.save(triviaQ);

        //Add questions for users
        List<User> users = userController.userList();
        for (User u : users) {
            qsetController.qsetAddTwo(u.getUid(), triviaQ1.getTid());
        }
        return triviaQ1;
    }

    @GetMapping(value = "/triviaQs/{id}")
    public TriviaQ triviaQsFindOne(@PathVariable("id") Integer id) {return triviaQRepository.findById(id).get();}


    @PostMapping(value = "/triviaQs/{id}")
    public TriviaQ triviaQsUpdate(@PathVariable("id") Integer id,
                                  @RequestParam("description") String description,
                                  @RequestParam("option1") String option1,
                                  @RequestParam("option2") String option2,
                                  @RequestParam("option3") String option3,
                                  @RequestParam("option4") String option4,
                                  @RequestParam("answer") String answer)
    {
        TriviaQ triviaQ = triviaQRepository.findById(id).get();
        triviaQ.setDescription(description);
        triviaQ.setOption1(option1);
        triviaQ.setOption2(option2);
        triviaQ.setOption3(option3);
        triviaQ.setOption4(option4);
        triviaQ.setAnswer(answer);

        TriviaQ triviaQ1 = triviaQRepository.save(triviaQ);

        //Add questions for users
        List<User> users = userController.userList();
        for (User u : users) {
            qsetController.qsetAddTwo(u.getUid(), triviaQ1.getTid());
        }
        return triviaQ1;
    }

    @DeleteMapping(value = "/triviaQs/{id}")
    public void triviaQsDelete(@PathVariable("id") Integer id) {
        triviaQRepository.deleteById(id);
    }

}