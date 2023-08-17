package com.gudi.biteBooks.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
    Logger logger = LoggerFactory.getLogger(MemberDao.class);
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate = null;

    public List<Map<String, Object>> memberList(Map<String, Object> pMap) {
        List<Map<String, Object>> mList = null;
        mList = sqlSessionTemplate.selectList("memberList", pMap);
        return mList;
    }

}
