public class Pet {
	private String nama, type;
	private Integer train, hunger,happy;

	public Pet(String nama, String type, Integer train, Integer hunger, Integer happy) {
		super();
		this.nama = nama;
		this.type = type;
		this.train = train;
		this.hunger = hunger;
		this.happy = happy;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getTrain() {
		return train;
	}

	public void setTrain(Integer train) {
		this.train = train;
	}

	public Integer getHunger() {
		return hunger;
	}

	public void setHunger(Integer hunger) {
		this.hunger = hunger;
	}
	
	public void addHunger(Integer hunger) {
		this.hunger += hunger;
	}
	
	public void addHappy(Integer happy) {
		this.happy += happy;
	}
	
	public void addTrain(Integer train) {
		this.train += train;
	}

	public Integer getHappy() {
		return happy;
	}

	public void setHappy(Integer happy) {
		this.happy = happy;
	}
	
	
}
