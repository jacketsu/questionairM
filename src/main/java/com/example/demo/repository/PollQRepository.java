package com.example.demo.repository;

import com.example.demo.entity.PollQ;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by xjw on 9/16/18.
 */
public interface PollQRepository extends CrudRepository<PollQ, Integer>{

}
