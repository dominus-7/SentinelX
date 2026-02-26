package org.impact.sentinelx.repository;

import org.impact.sentinelx.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TransferRepository  extends JpaRepository<Notification, Long>, JpaSpecificationExecutor<Notification> {
}
