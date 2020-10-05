class Prim {
	int[] primzahlenBestimmen(int n) {
		int[] zahlen = new int[n+1];

        // Zunaechst sind alle Zahlen nicht markiert
		for (int i = 0; i <= n; i++) {
			zahlen[i] = i;
		}

        // 0 und 1 sind keine Primzahlen, werden daher markiert
        zahlen[0] = 0;
        zahlen[1] = 0;

	    // Fuegen Sie Ihre Implementierung hier ein.
        
		return zahlen;
    }
    
	public static void main(String[] args) {
	    Prim prim = new Prim();
	    
        int[] output = prim.primzahlenBestimmen(20);
        System.out.println("Die Primzahlen kleiner gleich 20 lauten:");
        // Mit der folgenden Zeile kann ein Feld testweise ausgegeben werden
		System.out.println(Arrays.toString(output));
    }
}
