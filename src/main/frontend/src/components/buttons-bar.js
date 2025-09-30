import { html, css, LitElement } from 'lit';

/**
 * `buttons-bar` é um Web Component baseado em LitElement
 * que fornece uma barra de botões com slots configuráveis
 * para alinhar conteúdo à esquerda, centro (info) e direita.
 *
 * ### Slots disponíveis:
 * - `left` → para colocar botões ou elementos alinhados à esquerda.
 * - `info` → para texto ou informações adicionais (centralizadas/direita).
 * - `right` → para botões ou elementos alinhados à direita.
 *
 * ### Estilos:
 * - Usa variáveis Lumo para margens (`--lumo-space-s`, `--lumo-space-xs`).
 * - Aplica `box-shadow` por padrão, que pode ser removido com o atributo `no-scroll`.
 *
 * ### Responsividade:
 * - Abaixo de 600px, o conteúdo do slot `info` passa a ocupar a linha toda
 *   e aparece acima dos botões (`order: -1`).
 *
 * @element buttons-bar
 * @extends LitElement
 */
class ButtonsBarElement extends LitElement {
  /**
   * Estilos aplicados ao componente.
   *
   * @returns {import('lit').CSSResultGroup}
   */
  static get styles() {
    return css`
      :host {
        flex: none;
        display: flex;
        flex-wrap: wrap;
        transition: box-shadow 0.2s;
        justify-content: space-between;
        padding-top: var(--lumo-space-s);
        align-items: baseline;
        box-shadow: 0 -3px 3px -3px var(--lumo-shade-20pct);
      }

      :host([no-scroll]) {
        box-shadow: none;
      }

      :host ::slotted([slot='info']),
      .info {
        text-align: right;
        flex: 1;
      }

      ::slotted(vaadin-button) {
        margin: var(--lumo-space-xs);
      }

      @media (max-width: 600px) {
        :host ::slotted([slot='info']) {
          order: -1;
          min-width: 100%;
          flex-basis: 100%;
        }
      }
    `;
  }

  /**
   * Renderiza os slots para os diferentes grupos de botões/informação.
   *
   * @returns {import('lit').TemplateResult}
   */
  render() {
    return html`
      <slot name="left"></slot>
      <slot name="info"><div class="info"></div></slot>
      <slot name="right"></slot>
    `;
  }

  /**
   * Nome da tag do componente customizado.
   *
   * @returns {string}
   */
  static get is() {
    return 'buttons-bar';
  }
}

customElements.define(ButtonsBarElement.is, ButtonsBarElement);
