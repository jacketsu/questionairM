package com.example.demo.controller;

/**
 * Created by xjw on 9/17/18.
 */
import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.repository.MatricsQRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.MatricsQ;

/**
 * Created by xjw on 9/16/18.
 */
@RestController
public class MatricsQController {

    @Autowired
    private MatricsQRepository matricsQRepository;

    @Autowired
    private QsetController qsetController;

    @Autowired
    private UserController userController;

    @GetMapping(value = "/matricsQs")
    public List<MatricsQ> matricsQList() {
        return (List<MatricsQ>) matricsQRepository.findAll();
    }

    @PostMapping(value = "/matricsQs")
    public MatricsQ matricsQAdd(@RequestParam("description") String description,
                                @RequestParam("rowOption1") String rowOption1,
                                @RequestParam("rowOption2") String rowOption2,
                                @RequestParam("rowOption3") String rowOption3,
                                @RequestParam("rowOption4") String rowOption4,
                                @RequestParam("rowOption5") String rowOption5,
                                @RequestParam("rowOption6") String rowOption6,
                                @RequestParam("rowOption7") String rowOption7,
                                @RequestParam("rowOption8") String rowOption8,
                                @RequestParam("rowOption9") String rowOption9,
                                @RequestParam("rowOption10") String rowOption10,
                                @RequestParam("colOption1") String colOption1,
                                @RequestParam("colOption2") String colOption2,
                                @RequestParam("colOption3") String colOption3,
                                @RequestParam("colOption4") String colOption4,
                                @RequestParam("colOption5") String colOption5,
                                @RequestParam("colOption6") String colOption6,
                                @RequestParam("colOption7") String colOption7,
                                @RequestParam("colOption8") String colOption8,
                                @RequestParam("colOption9") String colOption9,
                                @RequestParam("colOption10") String colOption10)
    {
        MatricsQ matricsQ = new MatricsQ();
        matricsQ.setDescription(description);
        matricsQ.setRowOption1(rowOption1);
        matricsQ.setRowOption2(rowOption2);
        matricsQ.setRowOption3(rowOption3);
        matricsQ.setRowOption4(rowOption4);
        matricsQ.setRowOption5(rowOption5);
        matricsQ.setRowOption6(rowOption6);
        matricsQ.setRowOption7(rowOption7);
        matricsQ.setRowOption8(rowOption8);
        matricsQ.setRowOption9(rowOption9);
        matricsQ.setRowOption10(rowOption10);
        matricsQ.setColOption1(colOption1);
        matricsQ.setColOption2(colOption2);
        matricsQ.setColOption3(colOption3);
        matricsQ.setColOption4(colOption4);
        matricsQ.setColOption5(colOption5);
        matricsQ.setColOption6(colOption6);
        matricsQ.setColOption7(colOption7);
        matricsQ.setColOption8(colOption8);
        matricsQ.setColOption9(colOption9);
        matricsQ.setColOption10(colOption10);

        MatricsQ matricsQ1 = matricsQRepository.save(matricsQ);
        //Add questions for users
        List<User> users = userController.userList();
        for (User u : users) {
            qsetController.qsetAddTwo(u.getUid(), matricsQ1.getMid());
        }
        return matricsQ1;
    }

    @GetMapping(value = "/matricsQs/{id}")
    public MatricsQ matricsQsFindOne(@PathVariable("id") Integer id) {return matricsQRepository.findById(id).get();}


    @PostMapping(value = "/matricsQs/{id}")
    public MatricsQ matricsQsUpdate(@PathVariable("id") Integer id,
                                    @RequestParam("description") String description,
                                    @RequestParam("rowOption1") String rowOption1,
                                    @RequestParam("rowOption2") String rowOption2,
                                    @RequestParam("rowOption3") String rowOption3,
                                    @RequestParam("rowOption4") String rowOption4,
                                    @RequestParam("rowOption5") String rowOption5,
                                    @RequestParam("rowOption6") String rowOption6,
                                    @RequestParam("rowOption7") String rowOption7,
                                    @RequestParam("rowOption8") String rowOption8,
                                    @RequestParam("rowOption9") String rowOption9,
                                    @RequestParam("rowOption10") String rowOption10,
                                    @RequestParam("colOption1") String colOption1,
                                    @RequestParam("colOption2") String colOption2,
                                    @RequestParam("colOption3") String colOption3,
                                    @RequestParam("colOption4") String colOption4,
                                    @RequestParam("colOption5") String colOption5,
                                    @RequestParam("colOption6") String colOption6,
                                    @RequestParam("colOption7") String colOption7,
                                    @RequestParam("colOption8") String colOption8,
                                    @RequestParam("colOption9") String colOption9,
                                    @RequestParam("colOption10") String colOption10)
    {
        MatricsQ matricsQ = matricsQRepository.findById(id).get();
        matricsQ.setDescription(description);
        matricsQ.setRowOption1(rowOption1);
        matricsQ.setRowOption2(rowOption2);
        matricsQ.setRowOption3(rowOption3);
        matricsQ.setRowOption4(rowOption4);
        matricsQ.setRowOption5(rowOption5);
        matricsQ.setRowOption6(rowOption6);
        matricsQ.setRowOption7(rowOption7);
        matricsQ.setRowOption8(rowOption8);
        matricsQ.setRowOption9(rowOption9);
        matricsQ.setRowOption10(rowOption10);
        matricsQ.setColOption1(colOption1);
        matricsQ.setColOption2(colOption2);
        matricsQ.setColOption3(colOption3);
        matricsQ.setColOption4(colOption4);
        matricsQ.setColOption5(colOption5);
        matricsQ.setColOption6(colOption6);
        matricsQ.setColOption7(colOption7);
        matricsQ.setColOption8(colOption8);
        matricsQ.setColOption9(colOption9);
        matricsQ.setColOption10(colOption10);

        MatricsQ matricsQ1 = matricsQRepository.save(matricsQ);
        //Add questions for users
        List<User> users = userController.userList();
        for (User u : users) {
            qsetController.qsetAddTwo(u.getUid(), matricsQ1.getMid());
        }
        return matricsQ1;
    }

    @DeleteMapping(value = "/matricsQs/{id}")
    public void matricsQsDelete(@PathVariable("id") Integer id) {
        matricsQRepository.deleteById(id);
    }

}