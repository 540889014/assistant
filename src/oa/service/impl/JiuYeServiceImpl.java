package oa.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oa.baseDao.BaseDaoImpl;
import oa.bean.JiuYe;
import oa.service.JiuYeService;
@Service
@Transactional
public class JiuYeServiceImpl extends BaseDaoImpl<JiuYe> implements JiuYeService{

}
