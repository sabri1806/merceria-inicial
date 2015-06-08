package com.merceria;

import static org.junit.Assert.*;


import org.junit.Test;

import com.merceria.model.Articulo;
import com.service.ArticuloService;

public class AdminArticuloTest {

	// Aca hace el tes de consulta
	@Test
	public void obtenerArt_articuloPorId_retornaArt() {
		ArticuloService articuloService = new ArticuloService();

		Long id = new Long(1);
		Articulo articulo = articuloService.obtenerArt(id);

		assertEquals(id,articulo.getId());
	}

	// aca hace el test de borrado
	@Test
	public void borrarArticulo_articuloConIdExistente_retornaIdArticuloBorrado() {

	}
}
