package oa.service.impl;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oa.baseDao.BaseDaoImpl;
import oa.bean.Student;
import oa.service.StudentService;
@Service
@Transactional
public class StudentServiceImpl extends BaseDaoImpl<Student> implements StudentService{


	
}
