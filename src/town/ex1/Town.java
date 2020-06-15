package town.ex1;

public class Town implements Comparable<Town> {
	private String nameTown;
	private int distance;
	
	public Town (String nameTown, int distance) {
		this.nameTown = nameTown;
		this.distance = distance;
	}
	
	//get and set method
	
	public String getNameTown () {
		return this.nameTown;
	}
	
	public void setNameTown (String nameTown) {
		this.nameTown = nameTown;
	}
	
	public int getDistance() {
		return this.distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}

	//method of hashcode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + distance;
		result = prime * result + ((nameTown == null) ? 0 : nameTown.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Town other = (Town) obj;
		if (this.distance != other.distance) {
			return false;
		}
		if (this.nameTown == null) {
			if (other.nameTown != null) {
				return false;
			}
		} else if (!this.nameTown.equals(other.nameTown)) {
			return false;
		}
		return true;
	}

	//method of toString
	@Override
	public String toString() {
		return "Town [nameTown=" + nameTown + ", distance=" + distance + "]";
	}

	@Override
	public int compareTo (Town city) {
		return this.distance - city.distance;
	}
	
	
}
