package com.teamjm.remade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RemadeRepository extends JpaRepository<Post, Long> {

}


