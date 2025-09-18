import java.beans.Transient;

public class TesteEmail {


    @Test
    public void testar_email_com_arroba(){
        Pessoa pessoa = new Pessoa();

        pessoa.emailValid("email_teste@dominio.com.br");
        assertTrue(pessoa);
    }

    @Test
    public void testar_email_sem_arroba(){
        Pessoa pessoa = new Pessoa();

        pessoa.emailValid("email_testedominio.com.br");
        assertFalse(pessoa);
    }

    @Test
    public void testar_email_mais_50_caracteres(){
        Pessoa pessoa = new Pessoa();

        boolean teste =  pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br");
        assertEquals(false, teste);
    }
}
