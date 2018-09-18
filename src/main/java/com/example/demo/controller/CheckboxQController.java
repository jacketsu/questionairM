package com.example.demo.controller;

/**
 * Created by xjw on 9/17/18.
 */
import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.repository.CheckboxQRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.CheckboxQ;
import com.example.demo.controller.QsetController;

/**
 * Created by xjw on 9/16/18.
 */
@RestController
public class CheckboxQController {

    @Autowired
    private CheckboxQRepository checkboxQRepository;

    @Autowired
    private QsetController qsetController;

    @Autowired
    private UserController userController;

    @GetMapping(value = "/checkboxQs")
    public List<CheckboxQ> checkboxQList() {
        return (List<CheckboxQ>) checkboxQRepository.findAll();
    }

    @PostMapping(value = "/checkboxQs")
    public CheckboxQ checkboxQAdd(@RequestParam("description") String description,
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
        CheckboxQ checkboxQ = new CheckboxQ();
        checkboxQ.setDescription(description);
        checkboxQ.setOption1(option1);
        checkboxQ.setOption2(option2);
        checkboxQ.setOption3(option3);
        checkboxQ.setOption4(option4);
        checkboxQ.setOption5(option5);
        checkboxQ.setOption6(option6);
        checkboxQ.setOption7(option7);
        checkboxQ.setOption8(option8);
        checkboxQ.setOption9(option9);
        checkboxQ.setOption10(option10);

        CheckboxQ checkboxQ1 = checkboxQRepository.save(checkboxQ);
        //Add questions for users
        List<User> users = userController.userList();
        for (User u : users) {
            qsetController.qsetAddTwo(u.getUid(), checkboxQ1.getCid());
        }
        return checkboxQ1;
    }

    @GetMapping(value = "/checkboxQs/{id}")
    public CheckboxQ checkboxQsFindOne(@PathVariable("id") Integer id) {return checkboxQRepository.findById(id).get();}


    @PostMapping(value = "/checkboxQs/{id}")
    public CheckboxQ checkboxQsUpdate(@PathVariable("id") Integer id,
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
        CheckboxQ checkboxQ = checkboxQRepository.findById(id).get();
        checkboxQ.setDescription(description);
        checkboxQ.setOption1(option1);
        checkboxQ.setOption2(option2);
        checkboxQ.setOption3(option3);
        checkboxQ.setOption4(option4);
        checkboxQ.setOption5(option5);
        checkboxQ.setOption6(option6);
        checkboxQ.setOption7(option7);
        checkboxQ.setOption8(option8);
        checkboxQ.setOption9(option9);
        checkboxQ.setOption10(option10);

        CheckboxQ checkboxQ1 = checkboxQRepository.save(checkboxQ);
        //Add questions for users
        List<User> users = userController.userList();
        for (User u : users) {
            qsetController.qsetAddTwo(u.getUid(), checkboxQ1.getCid());
        }
        return checkboxQ1;
    }

    @DeleteMapping(value = "/checkboxQs/{id}")
    public void checkboxQsDelete(@PathVariable("id") Integer id) {
        checkboxQRepository.deleteById(id);
    }

}