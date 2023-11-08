package pack;

import subpack.QU;

public class App {
    public static void main(String[] args) throws Exception {
        QU uf = new QU(10);

        uf.union(1, 10);
        uf.union(1, 5);
        uf.union(10, 3);

        uf.connected(5, 3);
        uf.connected(5, 10);
        uf.connected(3, 4);
    }
}
