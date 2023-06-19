package tn.esprit.pfe.nodeData;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NodeDataService {

    final NodeDataRepo nodeDataRepo;

    public List<NodeData> getAllData(){
        return nodeDataRepo.findAll();
    }

    public NodeData addData(NodeData data){
        return nodeDataRepo.save(data);
    }

}
