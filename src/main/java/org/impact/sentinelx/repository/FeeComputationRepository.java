package org.impact.sentinelx.repository;

import org.impact.sentinelx.entity.FeeComputation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface FeeComputationRepository extends JpaRepository<FeeComputation, Long>, JpaSpecificationExecutor<FeeComputation> {}