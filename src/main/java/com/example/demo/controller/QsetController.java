package com.example.demo.controller;

import java.util.List;

import com.example.demo.repository.QsetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Qset;

/**
 * Created by xjw on 9/16/18.
 */
@RestController
public class QsetController {

    @Autowired
    private QsetRepository qsetRepository;

    @GetMapping(value = "/questions")
    public List<Qset> qsetList() {
        return (List<Qset>) qsetRepository.findAll();
    }

    @PostMapping(value = "/questions")
    public Qset qsetAdd(@RequestParam("uid") int uid,
                        @RequestParam("qid") int qid) {
        Qset qset = new Qset();
        qset.setUid(uid);
        qset.setQid(qid);
        return qsetRepository.save(qset);
    }

    @GetMapping(value = "/questions/{id}")
    public Qset qsetFindOne(@PathVariable("id") Integer id) {
        return qsetRepository.findById(id).get();
    }

    @GetMapping(value = "/questions/users/{uid}")
    public List<Qset> qsetFindQbyU (@PathVariable("uid") Integer uid) {
        return qsetRepository.findByAllByUid(uid);
    }

    @PostMapping(value = "/questions/{id}")
    public Qset qsetsUpdate( @PathVariable("id") Integer id,
                             @RequestParam("uid") int uid,
                             @RequestParam("qid") int qid) {
        Qset qset = qsetRepository.findById(id).get();
        qset.setUid(uid);
        qset.setQid(qid);
        return qsetRepository.save(qset);
    }

    @DeleteMapping(value = "/questions/{id}")
    public void qsetsDelete(@PathVariable("id") Integer id) {
        qsetRepository.deleteById(id);
    }

    public void qsetsDeleteByUidAndQid(Integer uid, Integer qid) {
        Qset qset = qsetRepository.findByUidAndQid(uid, qid);
        qsetRepository.deleteById(qset.getSid());
    }

    public Qset qsetAddTwo(Integer uid, Integer qid) {
        Qset qset = new Qset();
        qset.setUid(uid);
        qset.setQid(qid);
        return qsetRepository.save(qset);
    }
}
