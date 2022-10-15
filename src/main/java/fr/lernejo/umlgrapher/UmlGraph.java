package fr.lernejo.umlgrapher;

public class UmlGraph {

    public UmlGraph(Class c) {

    }

    public String as(GraphType graphType) {
        return """
        classDiagram
        class Machin {
            <<interface>>
        }
        """;
    }
}
