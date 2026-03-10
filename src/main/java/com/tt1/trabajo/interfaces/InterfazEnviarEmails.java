package com.tt1.trabajo.interfaces;

import com.tt1.trabajo.modelo.Destinatario;

/**
 * Interfaz que define el contrato para el servicio de mensajería electrónica del sistema.
 * Esta clase representa el punto de integración para notificar a los usuarios sobre
 * el estado de sus simulaciones mediante el envío de correos electrónicos[cite: 18].
 * * Se utiliza para comunicar la aplicación principal con el microservicio de
 * mensajería alojado en la máquina virtual[cite: 42].
 * * @author Tu Nombre
 * @version 1.0 (Curso 25/26) [cite: 5]
 */
public interface InterfazEnviarEmails {

	/**
	 * Realiza el envío de un correo electrónico a un destinatario específico.
	 * Este método es fundamental para la integración de resultados, permitiendo
	 * enviar la información procesada del grid a la dirección del usuario[cite: 18, 42].
	 * * @param dest Objeto de la clase {@link Destinatario} que contiene la información
	 * del receptor (como su nombre y dirección de correo principal)[cite: 18].
	 * @param email Cadena de texto que representa el cuerpo o contenido del mensaje
	 * que será enviado al usuario[cite: 18].
	 * @return true si el correo se ha enviado correctamente a través del servicio
	 * de la máquina virtual; false en caso de error de conexión o validación[cite: 18].
	 */
	public boolean enviarEmail(Destinatario dest, String email);
}