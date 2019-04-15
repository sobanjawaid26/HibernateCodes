package jspiders;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_heart")
public class Heart implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name = "heart_id")
	private int id;
	
	@Column(name = "heart_beatsPerMinute")
	private int beatsPerMinute;
	
	@Column(name = "heart_hasDisease")
	private boolean hasDisease;
	
	@Column(name = "heart_hadPreviousAttacks")
	private boolean hadPreviousAttacks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBeatsPerMinute() {
		return beatsPerMinute;
	}

	public void setBeatsPerMinute(int beatsPerMinute) {
		this.beatsPerMinute = beatsPerMinute;
	}

	public boolean isHasDisease() {
		return hasDisease;
	}

	public void setHasDisease(boolean hasDisease) {
		this.hasDisease = hasDisease;
	}
	
	

	public boolean isHadPreviousAttacks() {
		return hadPreviousAttacks;
	}

	public void setHadPreviousAttacks(boolean hadPreviousAttacks) {
		this.hadPreviousAttacks = hadPreviousAttacks;
	}

	public Heart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
