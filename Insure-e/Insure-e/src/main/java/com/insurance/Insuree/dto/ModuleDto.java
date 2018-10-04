package com.insurance.Insuree.dto;

public class ModuleDto {

	private Long moduleId;
	private String moduleName;

	public ModuleDto(Long moduleId, String moduleName) {
		super();
		this.moduleId = moduleId;
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

}
