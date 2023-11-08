package subpack;

public class QFUF {
    private int[] Ns;

    public QFUF(int N){
        Ns = new int[N];

        for(int i = 0; i < N; i++){
            Ns[i] = i;
        }
    }

    public void union(int p, int q){
        int pN = Ns[p - 1];
        int qN = Ns[q - 1];

        for(int i = 0; i < Ns.length; i++){
            if(Ns[i] == pN) Ns[i] = qN;
        }
    }

    public boolean connected(int p, int q){
        return Ns[p - 1] == Ns[q - 1];
    }
}
