package TranningJavaSpring.Boot.pc.service.mapping;

import TranningJavaSpring.Boot.pc.dto.request.PcRequest;
import TranningJavaSpring.Boot.pc.dto.response.PcResponse;
import TranningJavaSpring.Boot.pc.entity.PcEntity;

public class PcMapping {

    public static PcEntity convertDtoToPcEntity(PcRequest dto){
        PcEntity entity = new PcEntity();
        entity.setName(dto.getName());
        entity.setOperatingSystem(dto.getOperatingSystem());
        entity.setProcessor(dto.getProcessor());
        entity.setRamSize(dto.getRamSize());
        return entity;
    }
    public static PcResponse convertEntityToPcRespoNse(PcEntity entity){
        PcResponse dto = new PcResponse();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setOperatingSystem(entity.getOperatingSystem());
        dto.setProcessor(entity.getProcessor());
        dto.setRamSize(entity.getRamSize());
        return dto;
    }
}
