public class Nodo {
    String id;
    double lat;
    double lon;
    Nodo pai;
    public Nodo(long id, double lat, double lon, Nodo pai){
        super();
        this.id = String.valueOf(id);
        this.lat = lat;
        this.lon = lon;
        this.pai = pai;
    }
    public Nodo(GNodo gnodo, Nodo pai){
        super();
        this.id = String.valueOf(gnodo.id);
        this.lat = gnodo.lat;
        this.lon = gnodo.lon;
        this.pai = pai;
    }
}
