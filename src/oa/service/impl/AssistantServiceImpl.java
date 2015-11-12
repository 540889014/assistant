package oa.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oa.baseDao.BaseDaoImpl;
import oa.bean.Assistant;
import oa.service.AssistantService;
@Service
@Transactional
public class AssistantServiceImpl extends BaseDaoImpl<Assistant> implements AssistantService{

}
