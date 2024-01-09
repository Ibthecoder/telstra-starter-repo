package au.com.telstra.simcardactivator.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SimRepository extends CrudRepository<SimDdRecord,Long> {
}
