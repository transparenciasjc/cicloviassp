package org.transparenciasjc.cicloviassp.helpers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * Contém o nome das ciclovias por ID.
 * 
 * 
 * TODO: Carregar de arquivo no futuro
 * 
 * @author wsiqueir
 *
 */
public class CicloviaHelper {

	static final Map<Long, String> ciclovias;

	static {
		ciclovias = new HashMap<>();
		ciclovias.put(1l, "Faria Lima");
	}

	public static String nome(Long id) {
		return ciclovias.get(id);
	}

	public static Set<Entry<Long, String>> ciclovias() {
		return ciclovias.entrySet();
	}

}
