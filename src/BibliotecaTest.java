import org.junit.Test;


public class BibliotecaTest {

	@Test
	public void novoLivro() {
		Biblioteca b = new Biblioteca();
		b.addLivro("POO", "Fulano");
	}

}
