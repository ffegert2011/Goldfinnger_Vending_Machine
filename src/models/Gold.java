package models;

public class Gold {

	String description = "Unknown";
	Type type = Type.UNKNOWN;
	int karat = 21;
	Price price;
	double weight;

	public Gold(int karat, Type type) {
		this.type = type;
	}

	public enum Type {
		WHITE, YELLOW, BLUE, UNKNOWN
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String toString() {
		return "Description: " + description + "\n" + "Type: "
				+ type.toString() + "\n" + "Karat: " + karat + "\n" + "Price: "
				+ price.toString() + "\n" + "Weight: " + weight + "\n";

	}

}
