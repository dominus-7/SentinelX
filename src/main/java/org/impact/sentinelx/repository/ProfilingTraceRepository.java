// src/main/java/com/giteck/academy/sentinelx/repository/ProfilingTraceRepository.java
package org.impact.sentinelx.repository;

import org.impact.sentinelx.entity.ProfilingTrace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilingTraceRepository extends JpaRepository<ProfilingTrace, String>, JpaSpecificationExecutor<ProfilingTrace> {}