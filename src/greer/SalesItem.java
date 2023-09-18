package greer;

public class SalesItem {
	private String item;
	private double price;
	private int quantity;
	
	/**
	 * Constructor initializes new SalesItem
	 * 
	 * @param itemName The name of the item
	 * @param quantity The amount of the item
	 * @param price The price of the item
	 */
	public SalesItem(String itemName, int quantity, double price) {
		item = itemName;
		this.quantity = quantity;
		this.price = price;
	}
	
	/**
	 * @return The total price of the items summed up
	 */
	public double getTotal() {
		return quantity * price;
	}
	
	/**
	 * toString method for the SalesItem class
	 */
	public String toString() {
		return item + "\t$" + String.format("%.2f", price) + "\t" + quantity;
	}
}
