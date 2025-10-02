import { html, css, LitElement } from 'lit';

/**
 * `buttons-bar` é um Web Component baseado em LitElement que cria
 * uma barra de botões com layout responsivo.
 *
 * ### Slots disponíveis:
 * - `left`: Para botões ou conteúdo à esquerda.
 * - `info`: Conteúdo informativo (normalmente à direita, pode ocupar 100% no mobile).
 * - `right`: Para botões ou conteúdo à direita.
 *
 * ### Atributos:
 * - `no-scroll`: Remove a sombra superior quando ativo. Usado quando a barra está fixa
 *   e não precisa de separação visual com o conteúdo acima.
 *
 * ### Estilos aplicados:
 * Utiliza variáveis CSS do Lumo (`--lumo-space-s`, `--lumo-shade-20pct`, etc.)
 * e adapta o layout para ecrãs pequenos (mobile-first).
 *
 * @element buttons-bar
 * @extends LitElement
 */
class ButtonsBarElement extends LitElement {
  /**
   * Define os estilos do componente.
   * Usa flexbox para distribuir o conteúdo e estilos reativos para dispositivos móveis.
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
   * Renderiza os slots do componente:
   * - `left`: lado esquerdo
   * - `info`: centro (ou linha inteira em ecrãs pequenos)
   * - `right`: lado direito
   *
   * O slot "info" inclui por defeito um `<div class="info"></div>` se nada for fornecido.
   *
   * @returns {import('lit-html').TemplateResult} Template HTML renderizado pelo Lit
   */
  render() {
    return html`
      <slot name="left"></slot>
      <slot name="info"><div class="info"></div></slot>
      <slot name="right"></slot>
    `;
  }

  /**
   * Nome do elemento personalizado a ser registado.
   * @returns {string}
   */
  static get is() {
    return 'buttons-bar';
  }
}

// Regista o Web Component no browser
customElements.define(ButtonsBarElement.is, ButtonsBarElement);
