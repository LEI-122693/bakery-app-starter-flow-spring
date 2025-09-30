package com.vaadin.starter.bakery.backend.data;

import java.util.LinkedHashMap;
import java.util.List;

import com.vaadin.starter.bakery.backend.data.entity.Product;

/**
 * Classe que representa os dados estatísticos usados no dashboard da aplicação.
 * Contém informações agregadas sobre entregas, vendas e produtos.
 */
public class DashboardData {

	/**
	 * Estatísticas globais de entregas (total, confirmadas, com problema, etc.).
	 */
	private DeliveryStats deliveryStats;

	/**
	 * Lista com o número de entregas realizadas em cada dia do mês atual.
	 */
	private List<Number> deliveriesThisMonth;

	/**
	 * Lista com o número de entregas realizadas em cada mês do ano atual.
	 */
	private List<Number> deliveriesThisYear;

	/**
	 * Matriz com os valores de vendas por mês. Pode representar diferentes séries (ex: por tipo de produto).
	 */
	private Number[][] salesPerMonth;

	/**
	 * Mapa ordenado com a quantidade de entregas por produto.
	 */
	private LinkedHashMap<Product, Integer> productDeliveries;

	/**
	 * Obtém as estatísticas globais de entregas.
	 *
	 * @return objeto {@link DeliveryStats} com os dados agregados.
	 */
	public DeliveryStats getDeliveryStats() {
		return deliveryStats;
	}

	/**
	 * Define as estatísticas globais de entregas.
	 *
	 * @param deliveryStats objeto {@link DeliveryStats} a ser definido.
	 */
	public void setDeliveryStats(DeliveryStats deliveryStats) {
		this.deliveryStats = deliveryStats;
	}

	/**
	 * Obtém a lista de entregas por dia do mês atual.
	 *
	 * @return lista de números representando as entregas.
	 */
	public List<Number> getDeliveriesThisMonth() {
		return deliveriesThisMonth;
	}

	/**
	 * Define a lista de entregas por dia do mês atual.
	 *
	 * @param deliveriesThisMonth lista de entregas a definir.
	 */
	public void setDeliveriesThisMonth(List<Number> deliveriesThisMonth) {
		this.deliveriesThisMonth = deliveriesThisMonth;
	}

	/**
	 * Obtém a lista de entregas por mês do ano atual.
	 *
	 * @return lista de números representando as entregas.
	 */
	public List<Number> getDeliveriesThisYear() {
		return deliveriesThisYear;
	}

	/**
	 * Define a lista de entregas por mês do ano atual.
	 *
	 * @param deliveriesThisYear lista de entregas a definir.
	 */
	public void setDeliveriesThisYear(List<Number> deliveriesThisYear) {
		this.deliveriesThisYear = deliveriesThisYear;
	}

	/**
	 * Define os dados de vendas por mês.
	 *
	 * @param salesPerMonth matriz de números representando as vendas.
	 */
	public void setSalesPerMonth(Number[][] salesPerMonth) {
		this.salesPerMonth = salesPerMonth;
	}

	/**
	 * Obtém os dados de vendas para um determinado mês.
	 *
	 * @param i índice do mês (0 = Janeiro, 1 = Fevereiro, etc.)
	 * @return vetor de vendas correspondente ao mês.
	 */
	public Number[] getSalesPerMonth(int i) {
		return salesPerMonth[i];
	}

	/**
	 * Obtém o mapa de entregas por produto.
	 *
	 * @return mapa com produtos e a respetiva quantidade de entregas.
	 */
	public LinkedHashMap<Product, Integer> getProductDeliveries() {
		return productDeliveries;
	}

	/**
	 * Define o mapa de entregas por produto.
	 *
	 * @param productDeliveries mapa com os produtos e respetivas quantidades.
	 */
	public void setProductDeliveries(LinkedHashMap<Product, Integer> productDeliveries) {
		this.productDeliveries = productDeliveries;
	}
}
