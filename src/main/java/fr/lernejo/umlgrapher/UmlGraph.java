package fr.lernejo.umlgrapher;

public class UmlGraph {

    private final Class[] classes;

    public UmlGraph(Class[] classes) {
        this.classes = classes;
    }

    public String as(GraphType graphType) {
        switch (graphType) {
            case Mermaid:
                InternalGraphRepresentation graph = new InternalGraphRepresentation(classes);
                return new MermaidFormatter().format(graph);
            default:
                throw new IllegalArgumentException();
        }
    }
}
