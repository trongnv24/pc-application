package TranningJavaSpring.Boot.pc.Controller;

import TranningJavaSpring.Boot.pc.dto.request.PcRequest;
import TranningJavaSpring.Boot.pc.dto.response.PcResponse;
import TranningJavaSpring.Boot.pc.service.PcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.net.CacheRequest;

@RestController
@RequestMapping("api/v1/pc")
@Slf4j
public class PcController {
    private final PcService service;

    public PcController(PcService service) {
        this.service = service;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PcResponse create(@RequestBody PcRequest request) {
        log.info(" === Start api create new pc === ");
        log.info(" === Request Body :{}", request);
        PcResponse response = service.create(request);
        log.info(" === Finish api create new pc, Pc id {} : === ",response.getId());
        return response;
    }
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public PcResponse getById(@PathVariable("id") String id){
        log.info(" === Start api getById pc === ");
        log.info(" === String id {} :", id);
        PcResponse response = service.getById(id);
        log.info(" === Finish api getById pc, Pc id {} :", response.getId());
        return response;
    }
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public PcResponse update(@RequestBody PcRequest request, @PathVariable("id") String id){
        log.info(" === Start api update new pc === ");
        log.info(" === Request Body {} :, String id {} : === ", request ,id );
        PcResponse response = service.update(request,id);
        log.info(" === Finish api update pc, Pc id {} : === ", response.getId());
        return response;
    }
}