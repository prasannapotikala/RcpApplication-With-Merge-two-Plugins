package dogshowentry;


import java.io.Serializable;
import java.util.Arrays;

public class DogShowEntryModel implements Serializable{
	
	String dogName;
	String breed;
	String ownerName;
	String phone;
	String[] categories;
	
	public DogShowEntryModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DogShowEntryModel(String dogName, String breed, String ownerName, String phone, String[] categories) {
		super();
		this.dogName = dogName;
		this.breed = breed;
		this.ownerName = ownerName;
		this.phone = phone;
		this.categories = categories;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String[] getCategories() {
		return categories;
	}

	public void setCategories(String[] categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "DogShowEntryModel [dogName=" + dogName + ", breed=" + breed + ", ownerName=" + ownerName + ", phone="
				+ phone + ", categories=" + Arrays.toString(categories) + "]";
	}
	
	
	

}
