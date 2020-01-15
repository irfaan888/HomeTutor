package com.app.pojos;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="time_slot")
public class TimeSlot {

	
	private Integer id;
	private Months month;
	private TimeOfDay time;
	private Teacher teacher;
	
	public TimeSlot() {
		System.out.println("in ctor of timeslot");
	}

	public TimeSlot(Months month, TimeOfDay time, Teacher teacher) {
		super();
		this.month = month;
		this.time = time;
		this.teacher = teacher;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="slot_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Enumerated(EnumType.STRING)
	@Column(length=20,name="month")
	public Months getMonth() {
		return month;
	}

	public void setMonth(Months month) {
		this.month = month;
	}
	@Enumerated(EnumType.STRING)
	@Column(length=20,name="time_of_day")
	public TimeOfDay getTime() {
		return time;
	}

	public void setTime(TimeOfDay time) {
		this.time = time;
	}
	@ManyToOne
	@JoinColumn(name="teacher_id")
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "TimeSlot [id=" + id + ", month=" + month + ", time=" + time + ", teacher=" + teacher + "]";
	}
	
	
	
	
	
}
