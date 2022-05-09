package week10;

public class InvoiceItem {
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	public InvoiceItem(String newId, String newDesc, int newQty, double newUnitPrice) {
		this.id = newId;
		this.desc = newDesc;
		this.qty = newQty;
		this.unitPrice = newUnitPrice;
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public int getQty() {
		return this.qty;
	}
	
	public double getUnitPrice() {
		return this.unitPrice;
	}
	
	public void setQty(int newQty) {
		this.qty = newQty;
	}
	
	public void setUnitPrice(double newUnitPrice) {
		this.unitPrice = newUnitPrice;
	}
	
	public double getTotal() {
		return this.qty * this.unitPrice;
	}
	
	public String toString() {
		String s = String.format("InvoiceItem[id=%s,desc=%s,qty=%d,unitPrice=%s]", id, desc, qty, unitPrice);
		return s;
	}
}
