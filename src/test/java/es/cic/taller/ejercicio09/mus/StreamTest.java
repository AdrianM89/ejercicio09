package es.cic.taller.ejercicio09.mus;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class StreamTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		List<String> listaCadenas = new ArrayList<>();
		
		listaCadenas.add("dsfasfafs");
		listaCadenas.add("fasfasfa");
		listaCadenas.add("gjgkg");
		listaCadenas.add("tryrurtu");
		listaCadenas.add("ghjk");
		
		List<String> cadenasFiltradas = listaCadenas.stream().filter(s -> s.length()>5).collect(Collectors.toList());
		assertEquals(3, cadenasFiltradas.size());
	}

}
