package com.insurance.Insuree.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Module {

	private @Id @GeneratedValue Long moduleId;
	private String moduleName;

	public Module() {
	}

	public Module(String moduleName) {
		this.moduleName = moduleName;
	}

	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	@Override
	public String toString() {
		return "Module [moduleId=" + moduleId + ", moduleName=" + moduleName + "]";
	}

}
