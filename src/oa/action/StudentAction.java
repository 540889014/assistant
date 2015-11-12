package oa.action;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oa.baseDao.BaseAction;
import oa.bean.Student;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


import com.opensymphony.xwork2.ActionContext;

//学生：学生信息的查看、添加、修改、删除；
@Controller
@Scope("prototype")
public class StudentAction extends BaseAction<Student> {




}
