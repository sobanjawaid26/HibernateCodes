import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


// Entity tells the hibernate to this call is the
// class which has to be saved in db
@Entity                        //1st rule
public class ClassRoom implements Serializable {
	
	//2nd rule
	@Id    // tells that
	private int id;
	
	private int noOfStudent;
	
	private String roomName;
	
	public ClassRoom(int id, int noOfStudent, String roomName, int floorName) {
		super();
		this.id = id;
		this.noOfStudent = noOfStudent;
		this.roomName = roomName;
		this.floorName = floorName;
	}
	
	public ClassRoom() {
		
	}
	
	
	private int floorName;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNoOfStudent() {
		return noOfStudent;
	}
	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public int getFloorName() {
		return floorName;
	}
	public void setFloorName(int floorName) {
		this.floorName = floorName;
	}

	@Override
	public String toString() {
		return "ClassRoom [id=" + id + ", noOfStudent=" + noOfStudent + ", roomName=" + roomName + ", floorName="
				+ floorName + "]";
	}
	
	
	
	
}
