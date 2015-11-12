package oa.bean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Classes {

	private Integer id;
	private Xueyuan xueyuan;//ѧԺ
	public Xueyuan getXueyuan() {
		return xueyuan;
	}
	public void setXueyuan(Xueyuan xueyuan) {
		this.xueyuan = xueyuan;
	}
	private String className;
	private Set<Student> students=new HashSet<Student>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
}
