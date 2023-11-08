package subpack;

public class QU {
    private int id[];
    
    public QU(int N){
        id = new int[N + 1];
        for (int i = 0; i < N; i++) id[i] = i;
    }

    private int root(int i){
        while(i != id[i]) i = id[i];

        return i;
    }

    public boolean isConnected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);

        id[i] = j;
    }

    public void connected(int p, int q){
        if(isConnected(p, q)){
            System.out.println(p + " and " + q + " are connected");
        } else {
            System.out.println(p + " and " + q + " are not connected");
        }
    }
}
