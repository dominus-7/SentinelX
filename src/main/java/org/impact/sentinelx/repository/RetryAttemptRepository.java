// src/main/java/com/giteck/academy/sentinelx/repository/RetryAttemptRepository.java
package org.impact.sentinelx.repository;

import org.impact.sentinelx.entity.RetryAttempt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RetryAttemptRepository extends JpaRepository<RetryAttempt, Long>, JpaSpecificationExecutor<RetryAttempt> {}