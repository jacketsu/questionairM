package com.example.demo.controller;

/**
 * Created by xjw on 9/17/18.
 */
import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.repository.PollQRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.PollQ;

/**
 * Created by xjw on 9/16/18.
 */
@RestController
public class PollQController {

    @Autowired
    private PollQRepository pollQRepository;

    @Autowired
    private QsetController qsetController;

    @Autowired
    private UserController userController;

    @GetMapping(value = "/pollQs")
    public List<PollQ> pollQList() {
        return (List<PollQ>) pollQRepository.findAll();
    }

    @PostMapping(value = "/pollQs")
    public PollQ pollQAdd(@RequestParam("description") String description,
                                  @RequestParam("option1") String option1,
                                  @RequestParam("option2") String option2,
                                  @RequestParam("option3") String option3,
                                  @RequestParam("option4") String option4,
                                  @RequestParam("option5") String option5,
                                  @RequestParam("option6") String option6,
                                  @RequestParam("option7") String option7,
                                  @RequestParam("option8") String option8,
                                  @RequestParam("option9") String option9,
                                  @RequestParam("option10") String option10)
    {
        PollQ pollQ = new PollQ();
        pollQ.setDescription(description);
        pollQ.setOption1(option1);
        pollQ.setOption2(option2);
        pollQ.setOption3(option3);
        pollQ.setOption4(option4);
        pollQ.setOption5(option5);
        pollQ.setOption6(option6);
        pollQ.setOption7(option7);
        pollQ.setOption8(option8);
        pollQ.setOption9(option9);
        pollQ.setOption10(option10);

        PollQ pollQ1 = pollQRepository.save(pollQ);
        //Add questions for users
        List<User> users = userController.userList();
        for (User u : users) {
            qsetController.qsetAddTwo(u.getUid(), pollQ1.getPid());
        }

        return pollQ1;
    }

    @GetMapping(value = "/pollQs/{id}")
    public PollQ pollQsFindOne(@PathVariable("id") Integer id) {return pollQRepository.findById(id).get();}


    @PostMapping(value = "/pollQs/{id}")
    public PollQ pollQsUpdate(        @PathVariable("id") Integer id,
                                      @RequestParam("description") String description,
                                      @RequestParam("option1") String option1,
                                      @RequestParam("option2") String option2,
                                      @RequestParam("option3") String option3,
                                      @RequestParam("option4") String option4,
                                      @RequestParam("option5") String option5,
                                      @RequestParam("option6") String option6,
                                      @RequestParam("option7") String option7,
                                      @RequestParam("option8") String option8,
                                      @RequestParam("option9") String option9,
                                      @RequestParam("option10") String option10)
    {
        PollQ pollQ = pollQRepository.findById(id).get();
        pollQ.setDescription(description);
        pollQ.setOption1(option1);
        pollQ.setOption2(option2);
        pollQ.setOption3(option3);
        pollQ.setOption4(option4);
        pollQ.setOption5(option5);
        pollQ.setOption6(option6);
        pollQ.setOption7(option7);
        pollQ.setOption8(option8);
        pollQ.setOption9(option9);
        pollQ.setOption10(option10);

        PollQ pollQ1 = pollQRepository.save(pollQ);
        //Add questions for users
        List<User> users = userController.userList();
        for (User u : users) {
            qsetController.qsetAddTwo(u.getUid(), pollQ1.getPid());
        }

        return pollQ1;
    }

    @DeleteMapping(value = "/pollQs/{id}")
    public void pollQsDelete(@PathVariable("id") Integer id) {
        pollQRepository.deleteById(id);
    }

}