package it.gfrate.agent.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import it.gfrate.agent.model.Url;

@Repository
public interface AgentRepository extends JpaRepository<Url, Long> {
}
