package oa.baseDao;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import oa.service.AssistantService;
import oa.service.ClassesService;
import oa.service.CourseService;
import oa.service.JiuYeService;
import oa.service.PinKunStudentService;
import oa.service.ScoreService;
import oa.service.StudentService;
import oa.service.TeacherService;
import oa.service.XueyuanService;
import oa.service.ZhuXueJinService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T>{

	@Resource
	protected StudentService studentService;
	@Resource
	protected AssistantService assistantService;
	@Resource
	protected ClassesService classesService;
	@Resource
	protected CourseService courseService;
	@Resource
	protected JiuYeService jiuYeService;
	@Resource
	protected PinKunStudentService pinKunStudentService;
	@Resource
	protected ScoreService scoreService;
	@Resource
	protected TeacherService teacherService;
	@Resource
	protected XueyuanService xueyuanService;
	@Resource
	protected ZhuXueJinService zhuXueJinService;

	protected T model;

	public BaseAction() {
		try {
			ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
			Class clazz = (Class) pt.getActualTypeArguments()[0];

			model = (T) clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public T getModel() {
		return model;
	}
}
