package TranningJavaSpring.Boot.pc.service;

import TranningJavaSpring.Boot.pc.dto.request.PcRequest;
import TranningJavaSpring.Boot.pc.dto.response.PcResponse;

public interface PcService {
    PcResponse create(PcRequest request);
}
