import { html, css, LitElement } from 'lit';

/**
 * `dashboard-counter-label` é um Web Component baseado em LitElement,
 * usado para exibir um **contador de destaque** com valor numérico,
 * título, subtítulo e uma área para um gráfico (via slot).
 *
 * ## Funcionalidades:
 * - Apresenta um número de destaque (`.count-digit`)
 * - Mostra um título e subtítulo
 * - Permite inserir um gráfico no topo através do `<slot>`
 * - Suporta 4 variações de cor via classes: `.green`, `.red`, `.blue`, `.gray`
 *
 * ## Slots:
 * - `<slot>`: permite inserir gráficos personalizados ou SVGs na área superior.
 *
 * ## Estilos CSS:
 * - Utiliza unidades relativas à viewport (`vh`) para altura responsiva.
 * - Integra com o tema Lumo (`--lumo-secondary-text-color`)
 *
 * @element dashboard-counter-label
 * @extends LitElement
 */
class DashboardCounterLabel extends LitElement {
  /**
   * Define os estilos do componente. Controla layout, cores e tipografia.
   * Inclui variações de cor aplicadas com classes na tag `<dashboard-counter-label>`.
   */
  static get styles() {
    return css`
      :host {
        position: relative;
        text-align: center;
        height: calc(18vh - 64px);
        min-height: 180px;
        display: block;
      }

      :host(.green) .count-digit {
        color: #55bf3b;
      }

      :host(.red) .count-digit {
        color: #ff473a;
      }

      :host(.blue) .count-digit {
        color: #1877f3;
      }

      :host(.gray) .count-digit {
        color: rgba(45, 71, 105, 0.7);
      }

      .content {
        padding: 10px;
      }

      .count-wrapper {
        display: block;
        text-align: center;
        padding-top: 12px;
        margin-bottom: 18px;
      }

      .count-digit {
        font-size: 44px;
      }

      .subtitle {
        color: var(--lumo-secondary-text-color);
        font-size: 14px;
      }

      h4 {
        margin: 0;
      }

      .chart-wrapper {
        position: absolute;
        top: 0;
        left: 0;
        height: 120px;
        width: 100%;
      }
    `;
  }

  /**
   * Renderiza a estrutura HTML do componente, composta por:
   * - Uma área para gráficos (`.chart-wrapper` com `<slot>`)
   * - Um contador principal
   * - Um título (`<h4>`)
   * - Um subtítulo
   *
   * @returns {import('lit').TemplateResult} O template HTML do componente
   */
  render() {
    return html`
      <div class="chart-wrapper">
        <slot></slot>
      </div>

      <div class="content">
        <div class="count-wrapper">
          <span id="count" class="count-digit"></span>
        </div>

        <h4 id="title"></h4>
        <div id="subtitle" class="subtitle"></div>
      </div>
    `;
  }

  /**
   * Nome do custom element para registo no DOM.
   * @returns {string} Nome do componente ('dashboard-counter-label')
   */
  static get is() {
    return 'dashboard-counter-label';
  }
}

// Registo do componente personalizado no browser
customElements.define(DashboardCounterLabel.is, DashboardCounterLabel);
