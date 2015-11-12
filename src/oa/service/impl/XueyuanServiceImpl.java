package oa.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oa.baseDao.BaseDaoImpl;
import oa.bean.Xueyuan;
import oa.service.XueyuanService;
@Service
@Transactional
public class XueyuanServiceImpl extends BaseDaoImpl<Xueyuan> implements XueyuanService{

}
