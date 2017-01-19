package qiye.accountbook.domain;

import java.math.BigDecimal;

public class Item {
	private Integer id;
	private Integer categoryId;
	private String name;
	private BigDecimal amount;
	private String remark;
	
	public Item(Integer id, BigDecimal amount,Integer categoryId, String name,  String remark) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.amount = amount;
		this.remark = remark;
	}
	public Item(BigDecimal amount,Integer categoryId, String name,  String remark) {
		super();
		this.categoryId = categoryId;
		this.name = name;
		this.amount = amount;
		this.remark = remark;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
