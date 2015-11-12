package oa.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oa.baseDao.BaseDaoImpl;
import oa.bean.ZhuXueJin;
import oa.service.ZhuXueJinService;
@Service
@Transactional
public class ZhuXueJinServiceImpl extends BaseDaoImpl<ZhuXueJin> implements ZhuXueJinService{

}
