package com.app;

public class Student0 {
	public int stdId;
	public String stdName;
	public double stdSal;

	public Student0() {
	}

	public Student0(int stdId) {
		super();
		this.stdId = stdId;
	}

	public Student0(int stdId, String stdName, double stdSal) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdSal = stdSal;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public double getStdSal() {
		return stdSal;
	}

	public void setStdSal(double stdSal) {
		this.stdSal = stdSal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stdId;
		result = prime * result + ((stdName == null) ? 0 : stdName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(stdSal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student0 other = (Student0) obj;
		if (stdId != other.stdId)
			return false;
		if (stdName == null) {
			if (other.stdName != null)
				return false;
		} else if (!stdName.equals(other.stdName))
			return false;
		if (Double.doubleToLongBits(stdSal) != Double
				.doubleToLongBits(other.stdSal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student0 [stdId=" + stdId + ", stdName=" + stdName
				+ ", stdSal=" + stdSal + "]";
	}

}// class

