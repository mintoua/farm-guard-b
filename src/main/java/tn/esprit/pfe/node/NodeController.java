package tn.esprit.pfe.node;


import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/nodes")
@AllArgsConstructor
@CrossOrigin("*")
public class NodeController {

    final NodeService nodeService;

    @GetMapping("/")
    public List<Node> getAllNodes()
    {
        return nodeService.getAllNodes();
    }

    @PostMapping(value = "/add",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Node addNode
            (@RequestBody Node node)
    {
        return nodeService.addNode(node);
    }

    @PutMapping(value = "/edit",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Node editNode
            (@RequestBody Node node)
    {
        return nodeService.updateNode(node);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteNode(@PathVariable Long id){
        nodeService.deleteNode(id);
    }
}
