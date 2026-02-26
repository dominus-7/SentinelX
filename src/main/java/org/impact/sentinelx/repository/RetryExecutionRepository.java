// src/main/java/com/giteck/academy/sentinelx/repository/RetryExecutionRepository.java
package org.impact.sentinelx.repository;

import org.impact.sentinelx.entity.RetryExecution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RetryExecutionRepository extends JpaRepository<RetryExecution, Long>, JpaSpecificationExecutor<RetryExecution> {}