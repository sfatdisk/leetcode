// http://www.cnblogs.com/springfor/p/3874591.html
public class Solution {
    public UndirectedGraphNode cloneGraph( UndirectedGraphNode node ) {
        // hashmap to recorder the original and copy node : hashMap< node, node >
        // use DFS to browse the  undriected grahp
        if(node== null ){ return null; }
        
        HashMap<UndirectedGraphNode ,UndirectedGraphNode > map
            = new HashMap<UndirectedGraphNode ,UndirectedGraphNode >();
            
        UndirectedGraphNode copy= new UndirectedGraphNode( node.label ); // copy is root
        map.put( node, copy );
        dfsHelper( node, map);
        return copy;
    }
    
    private void dfsHelper( UndirectedGraphNode node, HashMap<UndirectedGraphNode ,UndirectedGraphNode > map ){
        
        // in this funcion my target is to visited all neighbors of this node and copy its neighbors
        for( int i=0; i< node.neighbors.size() ;++i ){
            UndirectedGraphNode neighbor= node.neighbors.get(i);
            
            if( !map.containsKey( neighbor) ){// not visited, store in map and dfs
                 UndirectedGraphNode copy = new UndirectedGraphNode( neighbor.label ); // copy is neighbor
                 map.put( neighbor, copy );
                 dfsHelper( neighbor, map);
            }
            // copy it, use map to get the copy node and add a neighbor to its neighbors 
            map.get( node ).neighbors.add( map.get( neighbor )  ); 
        }
    }
}

//http://www.jiuzhang.com/solutions/clone-graph/