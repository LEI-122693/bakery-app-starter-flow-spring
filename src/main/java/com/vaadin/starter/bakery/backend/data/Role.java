package com.vaadin.starter.bakery.backend.data;

/**
 * Classe utilitária que define os diferentes papéis (roles) que podem ser atribuídos
 * aos utilizadores da aplicação.
 *
 * <p>Os papéis determinam os níveis de acesso às diferentes funcionalidades
 * do sistema. Atualmente, existem três papéis disponíveis: {@link #BARISTA}, 
 * {@link #BAKER} e {@link #ADMIN}.</p>
 *
 * <p>Esta classe não deve ser instanciada, apenas utilizada de forma estática.</p>
 */
public class Role {
    /** Papel atribuído a utilizadores com permissões de barista. */
    public static final String BARISTA = "barista";

    /** Papel atribuído a utilizadores com permissões de padeiro. */
    public static final String BAKER = "baker";

    /** 
     * Papel de administrador, que implicitamente concede acesso a todas as 
     * funcionalidades e vistas da aplicação. 
     */
    public static final String ADMIN = "admin";

    /**
     * Construtor privado para impedir a instanciação desta classe utilitária.
     */
    private Role() {
        // Apenas contém métodos e campos estáticos
    }

    /**
     * Retorna todos os papéis definidos no sistema.
     *
     * @return array contendo todos os papéis disponíveis
     */
    public static String[] getAllRoles() {
        return new String[] { BARISTA, BAKER, ADMIN };
    }
}
