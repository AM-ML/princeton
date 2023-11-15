package subpack;

// Weighted Quick Union Algorithm
public class WQU {
    private int[] id;
    private int[] sz;
  
    public WQU (int N){
       id = new int[N];
       sz = new int[N];

      for (int i = 0; i < N; i++) {
        id[i] = i;
        sz[i] = 1;
      }
    }

    private int root(int n) {

      //? go through the parent references until root references itself
      while(n != id[n]) n = id[n]; 

      return n;
    }

    public boolean isConnected(int p, int q){
      //? return true if the root of p and q are the same else return false
      return root(p) == root(q);
    }

    public void union(int p, int q){
      
      int i = root(p);
      int j = root(q);

      // if they are already connected, return
      if(root(i) == root(j)) return;

      // if the size of tree of i is smaller than j do the following
      if(sz[i] < sz[j]) { 
          id[i] = j;  // change root of i tree to reference root of j tree
          sz[j] += sz[i]; // update size of i tree
          System.out.println("root of " + i + " is changed to " + j + "!"); // user feedback
      }

      else {
        id[j] = i; // change root of j tree to reference root of i tree
        sz[i] += sz[j]; // update size of i tree
        System.out.println("root of " + j + " is changed to " + i + "!");; // user feedback
      }; 
    }

    public void connected(int p, int q){ // user feedback
      if(isConnected(p, q))
        System.out.println(p + " is connected to " + q );
      else 
        System.out.println(p + " is not connected to " + q);
    }
}
