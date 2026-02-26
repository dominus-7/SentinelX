package org.impact.sentinelx.service;

import org.impact.sentinelx.dto.ProfilingSpanDTO;
import java.util.List;

public interface ProfilingSpanService {
    ProfilingSpanDTO save(ProfilingSpanDTO dto);
    ProfilingSpanDTO update(ProfilingSpanDTO dto);
    ProfilingSpanDTO findById(String spanId);
    void deleteById(String spanId);
    List<ProfilingSpanDTO> findAll();
}