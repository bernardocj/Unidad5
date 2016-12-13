package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Computer;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long>{

	@Query("select compu from Computer compu")
	public List<Computer> findAll();
	
}
