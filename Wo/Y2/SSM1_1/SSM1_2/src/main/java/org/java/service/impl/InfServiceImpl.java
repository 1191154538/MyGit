package org.java.service.impl;

import org.java.dao.InfMapper;
import org.java.service.InfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class InfServiceImpl implements InfService {
    @Autowired
    private InfMapper infMapper;
    @Override
    public List<Map<String, Object>> findInf() {
        return infMapper.findInf();
    }
}
