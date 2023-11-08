package pack;
import subpack.QFUF;

public class App {
    public static void main(String[] args) throws Exception {
        
        QFUF qf = new QFUF(10);

        qf.union(1, 10);
        qf.union(1, 7);
        qf.union(7, 5);

    }

    //? alorithm time: theta( N^2 )
    //! quadratic time does not scale up thus another algorithm is needed.
}
