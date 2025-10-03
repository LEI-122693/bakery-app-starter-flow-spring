package com.vaadin.starter.bakery.backend.data;

/**
 * Representa estatísticas de entregas e pedidos na aplicação Bakery.
 *
 * <p>Esta classe mantém contadores relacionados ao estado atual dos pedidos,
 * incluindo entregas concluídas, pedidos de hoje e de amanhã, bem como os
 * que não estão disponíveis e novos pedidos.</p>
 */
public class DeliveryStats {

	private int deliveredToday;
	private int dueToday;
	private int dueTomorrow;
	private int notAvailableToday;
	private int newOrders;

	/**
	 * Obtém o número de pedidos entregues hoje.
	 *
	 * @return número de entregas feitas hoje
	 */
	public int getDeliveredToday() {
		return deliveredToday;
	}

	/**
	 * Define o número de pedidos entregues hoje.
	 *
	 * @param deliveredToday número de entregas feitas hoje
	 */
	public void setDeliveredToday(int deliveredToday) {
		this.deliveredToday = deliveredToday;
	}

	/**
	 * Obtém o número de pedidos previstos para hoje.
	 *
	 * @return número de pedidos com entrega prevista para hoje
	 */
	public int getDueToday() {
		return dueToday;
	}

	/**
	 * Define o número de pedidos previstos para hoje.
	 *
	 * @param dueToday número de pedidos de hoje
	 */
	public void setDueToday(int dueToday) {
		this.dueToday = dueToday;
	}

	/**
	 * Obtém o número de pedidos previstos para amanhã.
	 *
	 * @return número de pedidos com entrega prevista para amanhã
	 */
	public int getDueTomorrow() {
		return dueTomorrow;
	}

	/**
	 * Define o número de pedidos previstos para amanhã.
	 *
	 * @param dueTomorrow número de pedidos de amanhã
	 */
	public void setDueTomorrow(int dueTomorrow) {
		this.dueTomorrow = dueTomorrow;
	}

	/**
	 * Obtém o número de pedidos não disponíveis para hoje.
	 *
	 * @return número de pedidos indisponíveis hoje
	 */
	public int getNotAvailableToday() {
		return notAvailableToday;
	}

	/**
	 * Define o número de pedidos não disponíveis para hoje.
	 *
	 * @param notAvailableToday número de pedidos indisponíveis hoje
	 */
	public void setNotAvailableToday(int notAvailableToday) {
		this.notAvailableToday = notAvailableToday;
	}

	/**
	 * Obtém o número de novos pedidos recebidos.
	 *
	 * @return número de novos pedidos
	 */
	public int getNewOrders() {
		return newOrders;
	}

	/**
	 * Define o número de novos pedidos recebidos.
	 *
	 * @param newOrders número de novos pedidos
	 */
	public void setNewOrders(int newOrders) {
		this.newOrders = newOrders;
	}
}

