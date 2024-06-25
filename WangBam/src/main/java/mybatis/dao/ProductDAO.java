package mybatis.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import mybatis.service.FactoryService;
import mybatis.vo.ProductVO;

public class ProductDAO {

	//상품상세페이지 조회
	public static ProductVO findByid(String pd_idx) {
		SqlSession ss = FactoryService.getFactory().openSession();
		ProductVO vo = ss.selectOne("product.findByid",pd_idx);
		return vo;
		
	}
	//상품 리스트 조회
	public static ProductVO[] allProduct() {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ProductVO> list = ss.selectList("product.all");
		ss.close();
		ProductVO[] arr = new ProductVO[list.size()];
        if(list.size()>0&&list!=null) {
            arr = list.toArray(arr);
        }
        return arr;
		
	}
	//상품 등록
	public static int addProduct(Map<String, String> map) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int cnt = ss.insert("product.add",map);
		if(cnt>0) {
			ss.commit();
		}else{
			ss.rollback();
		}
		ss.close();
		return cnt;
	}

	//상품 수정
	public static int updateProduct(Map<String, String> map) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int cnt = ss.update("product.update",map);
		if(cnt>0) {
			ss.commit();
		}else{
			ss.rollback();
		}
		ss.close();
		return cnt;
	}
	//상품 리스트 삭제
	public static int deleteProducts(Map<String, Object> map) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int cnt = ss.update("product.deleteProducts",map);
		if(cnt>0) {
			ss.commit();
		}else{
			ss.rollback();
		}
		ss.close();
		return cnt;
	}

	//상품 삭제
	public static int deleteProduct(Map<String, String>map) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int cnt = ss.update("product.delete",map);
		if(cnt>0) {
			ss.commit();
		}else{
			ss.rollback();
		}
		ss.close();
		return cnt;
	}
	// 검색조건에 맞는 목록카운트
	public static int allCount(String searchValue) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int cnt = ss.selectOne("product.allCount", searchValue);
		ss.close();
		return cnt;
	}

	// 모든 상품 리스트 조회해서 페이지네이션 하기
	public static ProductVO[] findProductByName(HashMap<String, String> map) {
		SqlSession ss = FactoryService.getFactory().openSession();
		ProductVO[] ar = null;
		List<ProductVO> list = ss.selectList("product.findProductByName", map);
		if(list != null) {
			ar = new ProductVO[list.size()];
			list.toArray(ar);
		}
		ss.close();
		return ar;
	}

}
