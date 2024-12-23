package com.SBIExample.project.Repositories;

import com.SBIExample.project.Entity.SBIEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SBIRepo extends  JpaRepository<SBIEntity, Long>{
}