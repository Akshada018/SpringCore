package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {

	private String name;
	private Set<String> Phones;
	private List<String> addresses;
	private Map<String, String> courses;
	private Properties props;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, Set<String> phones, List<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		Phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", Phones=" + Phones + ", addresses=" + addresses + ", courses=" + courses + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getPhones() {
		return Phones;
	}

	public void setPhones(Set<String> phones) {
		Phones = phones;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}
	

}
