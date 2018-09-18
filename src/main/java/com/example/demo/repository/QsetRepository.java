package com.example.demo.repository;

import com.example.demo.entity.Qset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xjw on 9/16/18.
 */
@Repository
public interface QsetRepository extends JpaRepository<Qset, Integer> {
    @Query("select q from Qset q where q.uid = :uid and q.qid = :qid")
    Qset findByUidAndQid(@Param(value = "uid") Integer uid, @Param(value = "qid") Integer qid);

    @Query("select q from Qset q where q.uid = :uid")
    List<Qset> findByAllByUid(@Param(value = "uid") Integer uid);
}
