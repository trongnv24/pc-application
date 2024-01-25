package TranningJavaSpring.Boot.pc.dto.response;

import TranningJavaSpring.Boot.pc.dto.request.PcRequest;

public class PcResponse extends PcRequest {

    private String id;

    public PcResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PcResponse{" +
                "id='" + id + '\'' +
                ", name='" + getName() + '\'' +
                ", operatingSystem='" + getOperatingSystem() + '\'' +
                ", processor='" + getProcessor() + '\'' +
                ", ramSize='" + getRamSize() + '\'' +
                '}';
    }
}
