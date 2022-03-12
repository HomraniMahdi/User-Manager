package Stage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Stage.model.model;

@Repository
public interface repository extends JpaRepository<model, Long> {

}
