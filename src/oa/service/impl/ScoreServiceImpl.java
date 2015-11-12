package oa.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oa.baseDao.BaseDaoImpl;
import oa.bean.Score;
import oa.service.ScoreService;
@Service
@Transactional
public class ScoreServiceImpl extends BaseDaoImpl<Score> implements ScoreService{

}
