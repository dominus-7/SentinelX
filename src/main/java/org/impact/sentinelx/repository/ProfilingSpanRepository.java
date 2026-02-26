// src/main/java/com/giteck/academy/sentinelx/repository/ProfilingSpanRepository.java
package org.impact.sentinelx.repository;

import org.impact.sentinelx.entity.ProfilingSpan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilingSpanRepository extends JpaRepository<ProfilingSpan, String>, JpaSpecificationExecutor<ProfilingSpan> {}