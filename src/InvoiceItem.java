//Assignment 3
//Q.N. 4
public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    public InvoiceItem(String id,String desc,int qty,double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public int getQty() {
        return qty;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public double getTotal(){
        return qty*unitPrice;
    }
    public String toString(){
        return "InvoiceItem[id= "+id+",desc= "+desc+",qty= "+qty+",unitprice= "+unitPrice+"]";
    }
}
