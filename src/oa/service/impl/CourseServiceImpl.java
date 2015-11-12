package oa.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oa.baseDao.BaseDaoImpl;
import oa.bean.Course;
import oa.service.CourseService;
@Service
@Transactional
public class CourseServiceImpl extends BaseDaoImpl<Course> implements CourseService{

}
