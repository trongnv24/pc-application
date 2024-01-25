package TranningJavaSpring.Boot.pc.service.Impl;

import TranningJavaSpring.Boot.pc.dto.request.PcRequest;
import TranningJavaSpring.Boot.pc.dto.response.PcResponse;
import TranningJavaSpring.Boot.pc.entity.PcEntity;
import TranningJavaSpring.Boot.pc.repository.PcRepository;
import TranningJavaSpring.Boot.pc.service.PcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static TranningJavaSpring.Boot.pc.service.mapping.PcMapping.convertDtoToPcEntity;
import static TranningJavaSpring.Boot.pc.service.mapping.PcMapping.convertEntityToPcRespoNse;

@Service
@Slf4j
public class PcServiceImpl implements PcService {
    private final PcRepository pcRepository;

    public PcServiceImpl(PcRepository pcRepository) {
        this.pcRepository = pcRepository;
    }

    @Override
    public PcResponse create(PcRequest request) {
        log.info(" === Start api create new pc === ");
        log.info(" === Request Body : {}", request);
        PcEntity pcentity = convertDtoToPcEntity(request);
        pcentity = pcRepository.save(pcentity);
        PcResponse response = convertEntityToPcRespoNse(pcentity);
        log.info(" === Finish api create new pc, Pc id {} : === ", response.getId());
        return response;
    }

}
