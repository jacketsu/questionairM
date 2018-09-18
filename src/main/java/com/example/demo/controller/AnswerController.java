package com.example.demo.controller;

import java.util.List;

import com.example.demo.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Answer;
import com.example.demo.controller.QsetController;

/**
 * Created by xjw on 9/16/18.
 */
@RestController
public class AnswerController {

    @Autowired
    private AnswerRepository answerRepository;

    //Qset controller
    @Autowired
    private QsetController qsetController;

    @GetMapping(value = "/answers")
    public List<Answer> answerList() {
        return (List<Answer>) answerRepository.findAll();
    }

    @PostMapping(value = "/answers")
    public Answer answerAdd(@RequestParam("uid") int uid,
                        @RequestParam("qid") int qid,
                        @RequestParam("type") String type,
                        @RequestParam("content") String content) {
        Answer answer = new Answer();
        answer.setUid(uid);
        answer.setQid(qid);
        answer.setqType(type);
        answer.setContent(content);
        // Delete question from Qset
        qsetController.qsetsDeleteByUidAndQid(uid, qid);
        return answerRepository.save(answer);
    }

    @GetMapping(value = "/answers/{id}")
    public Answer answersFindOne(@PathVariable("id") Integer id) {
        return answerRepository.findById(id).get();
    }

    @GetMapping(value = "/answers/users/{uid}")
    public List<Answer> answersFindByUid(@PathVariable("uid") Integer uid) {
        return answerRepository.findAllByUid(uid);
    }

    @PostMapping(value = "/answers/{id}")
    public Answer answersUpdate(@PathVariable("id") int id,
                                @RequestParam("uid") int uid,
                                @RequestParam("qid") int qid,
                                @RequestParam("type") String type,
                                @RequestParam("content") String content) {
        Answer answer = answerRepository.findById(id).get();
        answer.setUid(uid);
        answer.setQid(qid);
        answer.setqType(type);
        answer.setContent(content);
        return answerRepository.save(answer);
    }

    @DeleteMapping(value = "/answers/{id}")
    public void answersDelete(@PathVariable("id") Integer id) {
        answerRepository.deleteById(id);
    }

}
