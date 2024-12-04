package com.learning.learning.repository;

import com.learning.learning.entity.LoginDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryLayer extends JpaRepository<LoginDetail,Integer > {

}


