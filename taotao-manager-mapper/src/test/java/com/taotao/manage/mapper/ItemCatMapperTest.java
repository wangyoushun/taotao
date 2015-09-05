package com.taotao.manage.mapper;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

public class ItemCatMapperTest {

	private ItemCatMapper itemCatMapper;

	@Before
	public void setUp() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);
		itemCatMapper = sqlSessionFactory.openSession(true).getMapper(
				ItemCatMapper.class);
	}

	@Test
	public void testQueryList() {
		List<Map<String, Object>> queryList = itemCatMapper.queryList();
		for (Map<String, Object> map : queryList) {
			System.out.println(map);
		}
	}

}
