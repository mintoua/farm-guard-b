package tn.esprit.pfe.nodeData;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pfe.nodeData.NodeData;
import tn.esprit.pfe.nodeData.NodeDataService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/data")
@AllArgsConstructor
@CrossOrigin("*")
public class NodeDataController {

    final NodeDataService nodeDataService;

    @GetMapping("/")
    public List<NodeData> getAllData(){
        return nodeDataService.getAllData();
    }

    @PostMapping
            (value = "/add",
                    consumes = MediaType.APPLICATION_JSON_VALUE)
    public NodeData addData
            (@RequestBody NodeData data) {
        return nodeDataService.addData(data);
    }

}
