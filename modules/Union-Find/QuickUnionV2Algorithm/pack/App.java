package pack;

import subpack.WQU;

public class App {
    public static void main(String[] args) throws Exception {
        WQU qu = new WQU(10);

        qu.union(1, 4);
        qu.union(6, 1);
        qu.union(8, 4);
        qu.union(3, 2);

        qu.connected(4, 6);
        qu.connected(8, 6);
        qu.connected(3, 4);
    }
}
