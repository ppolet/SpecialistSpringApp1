package org.example;

import java.util.List;

public class GraphStation {
    private List<GraphObject> graphObjectList;

    public List<GraphObject> getGraphObjectList() {
        return graphObjectList;
    }

    public void setGraphObjectList(List<GraphObject> graphObjectList) {
        this.graphObjectList = graphObjectList;
    }

    public void drawObject(){
        for(GraphObject gObj : graphObjectList){
            gObj.draw();
        }
    }
}
