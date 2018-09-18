package com.example.demo.repository;

import com.example.demo.entity.Answer;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by xjw on 9/16/18.
 */
public interface AnswerRepository extends CrudRepository<Answer, Integer>{
    @Query("select a from Answer a where a.uid = :uid")
    List<Answer> findAllByUid(@Param(value = "uid") Integer uid);
}
