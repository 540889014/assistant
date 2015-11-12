package oa.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oa.baseDao.BaseDaoImpl;
import oa.bean.PinKunStudent;
import oa.service.PinKunStudentService;
@Service
@Transactional
public class PinKunStudentServiceImpl extends BaseDaoImpl<PinKunStudent> implements PinKunStudentService{

}
