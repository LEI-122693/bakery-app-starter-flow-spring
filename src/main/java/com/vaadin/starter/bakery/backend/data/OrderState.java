package com.vaadin.starter.bakery.backend.data;

import java.util.Locale;
import com.vaadin.flow.shared.util.SharedUtil;

/**
 * Representa os diferentes estados possíveis de um pedido
 * na aplicação da pastelaria.
 *
 * <p>Os estados refletem o ciclo de vida de um pedido, desde
 * a sua criação até à entrega ou cancelamento.</p>
 */
public enum OrderState {

    /** Pedido recém-criado e ainda não confirmado. */
    NEW,

    /** Pedido confirmado e em preparação. */
    CONFIRMED,

    /** Pedido pronto para ser entregue. */
    READY,

    /** Pedido entregue ao cliente. */
    DELIVERED,

    /** Pedido com um problema (ex.: pagamento, produto em falta). */
    PROBLEM,

    /** Pedido cancelado. */
    CANCELLED;

    /**
     * Devolve o nome do estado em formato legível para o utilizador.
     * Por exemplo, {@code READY} torna-se "Ready".
     *
     * @return uma versão legível do identificador do estado
     */
    public String getDisplayName() {
        return SharedUtil.capitalize(name().toLowerCase(Locale.ENGLISH));
    }
}
