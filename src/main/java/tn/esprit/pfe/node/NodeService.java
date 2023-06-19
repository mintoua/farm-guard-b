package tn.esprit.pfe.node;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NodeService {

    final NodeRepo nodeRepo;

    public List<Node> getAllNodes(){
        return nodeRepo.findAll();
    }

    public Node addNode(Node node){
        return nodeRepo.save(node);
    }

    public Node updateNode(Node node){
        return nodeRepo.save(node);
    }

    public void deleteNode(Long id){
        nodeRepo.deleteById(id);
    }

}
