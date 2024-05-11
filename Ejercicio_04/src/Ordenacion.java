
public class Ordenacion {

	private int[] v;
	
	public Ordenacion(int[] v) {
		this.v = v;
	}
	
	public void intercambio(int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    } 
	
	 public void ordenar() {
	        for (int i = 0; i < v.length - 1; i++) {
	            for (int j = 0; j < v.length - 1 - i; j++) 
	                if (v[j] > v[j + 1]) 
	                    intercambio(j, j + 1);   
	        }
	    }
		public void mostrar() {
			for (int i=0;i < v.length; i++) {
				   System.out.print(v[i]+" "); 
			}
		}
}
