public class Main{
	public String name ="Meng";
	public int umur = 3;
	public String kesukaan = "tidur";
	public String warna = "Putih";
	public String ras = "British Short Hair";
	
	public void myCat(){
	System.out.println("Nama Kucing: "+name);
		System.out.println("Umur Kucing: "+umur);
				System.out.println("Kesukaan: "+kesukaan);
					System.out.println("Warna Kucing: "+warna);
						System.out.println("Ras Kucing: "+ras);
		}
		
		public static void main(String[] args){
		Main kucing = new Main();
		kucing.myCat();
		}
}
		
