package action.user;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import mybatis.dao.BoardsDAO;
import mybatis.vo.BoardsVO;

public class IndexAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		StringBuffer viewPath = new StringBuffer();
		HashMap<String, String> map = new HashMap<>();
		map.put("bo_type", "0");
		map.put("begin", "1");
		map.put("end", "4");
		
		BoardsVO[] b_ar = BoardsDAO.find(map);
		if(b_ar != null) {
			request.setAttribute("b_ar", b_ar);
			viewPath.append("/jsp/user/main.jsp");
		}

		
		return viewPath.toString();
	}

}
