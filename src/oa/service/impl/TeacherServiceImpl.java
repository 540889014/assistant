package oa.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oa.baseDao.BaseDaoImpl;
import oa.bean.Teacher;
import oa.service.TeacherService;
@Service
@Transactional
public class TeacherServiceImpl extends BaseDaoImpl<Teacher> implements TeacherService{

}
