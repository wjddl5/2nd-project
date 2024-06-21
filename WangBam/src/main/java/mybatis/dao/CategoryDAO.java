package mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mybatis.service.FactoryService;
import mybatis.vo.BoardsVO;
import mybatis.vo.CategoryVO;

public class CategoryDAO {
	//카테고리 전체 조회
			public static CategoryVO[] allCategory() {
				SqlSession ss = FactoryService.getFactory().openSession();
				CategoryVO[] ar = null;
				List<CategoryVO> list = ss.selectList("category.allCategory");
				if(list != null) {
					ar = new CategoryVO[list.size()];
					list.toArray(ar);
				}
				ss.close();
				
				return ar;
			}
}	