package StudentsRecords;

public class StudentsRecordsNo {

	private int id;
	private String name;
	private String grade;
	private String pickUpLocation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPickUpLocation() {
		return pickUpLocation;
	}

	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}

	@Override
	public String toString() {
		return "StudentsRecordsNo [id=" + id + ", name=" + name + ", grade=" + grade + ", pickUpLocation="
				+ pickUpLocation + "]";
	}
	
	

}
