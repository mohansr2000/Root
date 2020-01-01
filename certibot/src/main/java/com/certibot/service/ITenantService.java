package com.certibot.service;

import com.certibot.vo.TenantVo;

import java.util.List;

public interface ITenantService {
    public List<TenantVo> getAllTenants();
}