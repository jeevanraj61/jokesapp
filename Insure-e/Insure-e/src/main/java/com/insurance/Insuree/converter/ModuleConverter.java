package com.insurance.Insuree.converter;

import com.insurance.Insuree.dto.ModuleDto;
import com.insurance.Insuree.entity.Module;

public class ModuleConverter {

	 public static ModuleDto entityToDto(Module module) {

		 ModuleDto moduleDto = new ModuleDto(module.getModuleId(),module.getModuleName());

    	 return moduleDto;

		 }

}
