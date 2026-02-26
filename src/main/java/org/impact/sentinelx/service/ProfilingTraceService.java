// src/main/java/com/giteck/academy/sentinelx/service/ProfilingTraceService.java
package org.impact.sentinelx.service;

import org.impact.sentinelx.dto.ProfilingTraceDTO;
import java.util.List;

public interface ProfilingTraceService {
   ProfilingTraceDTO save(ProfilingTraceDTO dto);
    ProfilingTraceDTO update(ProfilingTraceDTO dto);
    ProfilingTraceDTO findById(String traceId);
    void deleteById(String traceId);
    List<ProfilingTraceDTO> findAll();
}