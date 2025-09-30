/**
 * Classe principal da aplicação Spring Boot para o projeto Bakery.
 *
 * <p>Responsável por inicializar o contexto do Spring e configurar os pacotes
 * principais da aplicação, incluindo segurança, repositórios JPA e entidades.</p>
 *
 * <p>Extende {@link SpringBootServletInitializer} para permitir a implantação
 * em servidores de aplicação externos (como Tomcat ou Jetty) além do modo
 * standalone.</p>
 *
 * <h2>Configurações principais:</h2>
 * <ul>
 *   <li>{@link EnableJpaRepositories} para ativar os repositórios JPA.</li>
 *   <li>{@link EntityScan} para localizar as entidades persistentes.</li>
 *   <li>Exclusão de {@link ErrorMvcAutoConfiguration} para evitar conflitos com
 *       o roteamento de erros do Vaadin.</li>
 * </ul>
 *
 * @see SpringBootApplication
 * @see SpringBootServletInitializer
 */
@SpringBootApplication(scanBasePackageClasses = { SecurityConfiguration.class, MainView.class, Application.class,
        UserService.class }, exclude = ErrorMvcAutoConfiguration.class)
@EnableJpaRepositories(basePackageClasses = { UserRepository.class })
@EntityScan(basePackageClasses = { User.class })
public class Application extends SpringBootServletInitializer {

    /**
     * Método principal que inicia a aplicação Spring Boot em modo standalone.
     *
     * @param args argumentos de linha de comando
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Configura a aplicação quando esta é implantada num servidor de aplicação externo.
     *
     * @param application construtor do SpringApplication
     * @return a aplicação configurada
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
