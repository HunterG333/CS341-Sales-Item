package greer;

import java.util.ArrayList;

public class SalesList {
	
	private ArrayList<SalesItem> allItems;
	
	
	/**
	 * Initializes a SalesList item
	 */
	public SalesList() {
		allItems = new ArrayList<SalesItem>();
	}
	
	
	/**
	 * adds an item to the sales list
	 * @param salesItem takes in a salesItem
	 */
	public void addNewItem(SalesItem salesItem) {
		allItems.add(salesItem);
	}
	
	
	/**
	 * @return the list of sales
	 */
	public String getSalesList() {
		String str = "";
		for(int i = 0; i < allItems.size(); i++) {
			str += allItems.get(i).toString() + "\n";
		}
		return str;
	}
	
	/**
	 * 
	 * @return the total amount of all of the items summed up
	 */
	public Double computeTotalAmount() {
		double totalAmount = 0;
		for(int i = 0; i < allItems.size(); i++) {
			totalAmount += allItems.get(i).getTotal();
			}
		return totalAmount;
	}
}
