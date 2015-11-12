package oa.action;

import oa.baseDao.BaseAction;
import oa.bean.Assistant;

//辅导员：包含登录、退出  
public class AssistantAction extends BaseAction<Assistant>{

	public String loginUI() {
		
		return "loginUI";
		
	}
}
