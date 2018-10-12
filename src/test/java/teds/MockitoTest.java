package teds;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doReturn;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import modelo.Acessorio;
import modelo.Carro;

import org.junit.jupiter.api.Test;

@ExtendWith(MockitoExtension.class)
class MockitoTest {
	
	private Carro carro;
	
	@Mock
	private List<Acessorio> listaacessorio;
	
	@Mock
	private Acessorio acessorio;
	@Mock
	private Acessorio acessorio2;

	@Test
	void test() {
		// Primeiro Acessorio
		acessorio.setCodigo(123);
		acessorio.setDescricao("volante");
		acessorio.setValor(50);
		listaacessorio.add(acessorio);
		
		acessorio2.setCodigo(321);
		acessorio2.setDescricao("banco");
		acessorio2.setValor(200);
		listaacessorio.add(acessorio2);
		
		carro.setAcessorios(listaacessorio);
		
		carro.setValorBaseDiaria(500);
		
		assertEquals(carro.getValorAPagar(), 750);
			
		
	}

}
