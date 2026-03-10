package com.tt1.trabajo.interfaces;

import com.tt1.trabajo.modelo.DatosSimulation;
import com.tt1.trabajo.modelo.DatosSolicitud;
import com.tt1.trabajo.modelo.Entidad;
import java.util.List;

/**
 * Interfaz que define las operaciones para interactuar con el sistema de simulación.
 * Permite gestionar solicitudes, descargar datos y obtener la representación visual (grid).
 */
public interface InterfazContactoSim {

	/**
	 * Registra una nueva solicitud de simulación en el sistema.
	 * @param sol Objeto con los datos de la solicitud (ancho, alto, etc.).
	 * @return Un identificador único (ticket) para la simulación.
	 */
	int solicitarSimulation(DatosSolicitud sol);

	/**
	 * Descarga los resultados de una simulación finalizada.
	 * @param ticket El identificador obtenido al solicitar la simulación.
	 * @return Objeto con los datos detallados de la simulación.
	 */
	DatosSimulation descargarDatos(int ticket);

	/**
	 * Obtiene el listado de entidades (simuladores) disponibles en el sistema.
	 * @return Lista de objetos Entidad.
	 */
	List<Entidad> getEntities();

	/**
	 * Verifica si el ID de una entidad es válido dentro del sistema.
	 * @return true si es válido, false en caso contrario.
	 */
	boolean isValidEntityId();

	/**
	 * Consume el servicio de la máquina virtual para obtener la matriz de celdas.
	 * El servicio devuelve una cadena con el ancho y los datos de cada celda (tiempo, x, y, color)[cite: 54, 55].
	 * @param token El token de acceso proporcionado por el sistema de simulación.
	 * @return Una cadena de texto con el formato: "ancho\nt,y,x,color\n..."[cite: 45, 54, 55].
	 */
	String obtenerGrid(String token);
}