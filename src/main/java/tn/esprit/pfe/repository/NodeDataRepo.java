package tn.esprit.pfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pfe.entity.NodeData;

@Repository
public interface NodeDataRepo extends JpaRepository<NodeData,Long> {
}
