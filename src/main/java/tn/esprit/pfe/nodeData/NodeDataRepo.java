package tn.esprit.pfe.nodeData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeDataRepo extends JpaRepository<NodeData,Long> {
}
