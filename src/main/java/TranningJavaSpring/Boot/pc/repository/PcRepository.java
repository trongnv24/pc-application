package TranningJavaSpring.Boot.pc.repository;

import TranningJavaSpring.Boot.pc.entity.PcEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PcRepository extends JpaRepository<PcEntity, String> {
}
