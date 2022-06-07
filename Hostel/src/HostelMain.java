
public class HostelMain {
	public static void main(String[] args) {
		
	Hospede h1 = new Hospede("João Pedro", 27, 532228889, 433933989, 'M', false);
	Movimentacoes m1 = new Movimentacoes(100.0f, h1);
	
	
	m1.checkin(3);
	m1.informacoes();
	System.out.println("-----------------------------");
	
	m1.consumir();
	
	System.out.println("-----------------------------");
	
	m1.informacoes();
	
	System.out.println("-----------------------------");
	
	m1.checkout();
}
}
