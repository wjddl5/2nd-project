package mybatis.vo;

import java.util.List;

public class OrderDetailVO {
	private String od_idx,
	or_idx,
	pd_idx,
	od_cnt,
	od_price;
	private OrderVO ovo;
	private ProductVO pvo;
	private List<ProductVO> p_list;
	
	public String getOd_idx() {
		return od_idx;
	}
	public void setOd_idx(String od_idx) {
		this.od_idx = od_idx;
	}
	public String getOr_idx() {
		return or_idx;
	}
	public void setOr_idx(String or_idx) {
		this.or_idx = or_idx;
	}
	public String getPd_idx() {
		return pd_idx;
	}
	public void setPd_idx(String pd_idx) {
		this.pd_idx = pd_idx;
	}
	public String getOd_cnt() {
		return od_cnt;
	}
	public void setOd_cnt(String od_cnt) {
		this.od_cnt = od_cnt;
	}
	public String getOd_price() {
		return od_price;
	}
	public void setOd_price(String od_price) {
		this.od_price = od_price;
	}
	public OrderVO getOvo() {
		return ovo;
	}
	public void setOvo(OrderVO ovo) {
		this.ovo = ovo;
	}
	public ProductVO getPvo() {
		return pvo;
	}
	public void setPvo(ProductVO pvo) {
		this.pvo = pvo;
	}
	public List<ProductVO> getP_list() {
		return p_list;
	}
	public void setP_list(List<ProductVO> p_list) {
		this.p_list = p_list;
	}
	
}