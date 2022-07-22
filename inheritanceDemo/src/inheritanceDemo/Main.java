package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI=new KrediUI();
		double kredi=krediUI.KrediHesapla(new OgretmenKrediManager());

		System.out.println(kredi);
	}

}
