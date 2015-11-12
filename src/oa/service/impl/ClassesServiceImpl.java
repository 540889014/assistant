package oa.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oa.baseDao.BaseDaoImpl;
import oa.bean.Classes;
import oa.service.ClassesService;
@Service
@Transactional
public class ClassesServiceImpl extends BaseDaoImpl<Classes> implements ClassesService{

}
