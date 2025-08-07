# Implementa��o da Sidebar Padr�o

## Vis�o Geral
Este documento descreve a implementa��o de uma sidebar padr�o para o projeto Cl�nica Plus. A sidebar foi implementada usando componentes PrimeFaces e segue um design responsivo.

## Arquivos Criados/Modificados

### Arquivos Criados:
1. **Template Principal**
   - Caminho: `/src/main/resources/META-INF/resources/template/template.xhtml`
   - Descri��o: Template base com a estrutura da p�gina, incluindo sidebar, topbar e �rea de conte�do.

2. **Arquivo CSS**
   - Caminho: `/src/main/resources/META-INF/resources/css/style.css`
   - Descri��o: Estilos para a sidebar, layout geral e componentes da interface.

3. **Arquivo JavaScript**
   - Caminho: `/src/main/resources/META-INF/resources/js/script.js`
   - Descri��o: Script para controlar o comportamento responsivo da sidebar em dispositivos m�veis.

### Arquivos Modificados:
1. **P�gina Inicial**
   - Caminho: `/src/main/resources/META-INF/resources/index.xhtml`
   - Descri��o: Modificada para usar o template com a sidebar.

## Funcionalidades Implementadas

### Sidebar
- Menu de navega��o com categorias para diferentes se��es do sistema
- Estilo visual consistente com a identidade da aplica��o
- Comportamento responsivo (colapsa em dispositivos m�veis)

### Layout Geral
- Estrutura dividida em sidebar, �rea de conte�do principal e rodap�
- Topbar com bot�o para mostrar/esconder a sidebar em dispositivos m�veis
- �rea de conte�do flex�vel que se adapta ao conte�do da p�gina

## Como Usar o Template

Para criar novas p�ginas usando o template com a sidebar:

```xml
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:f="http://xmlns.jcp.org/jsf/core"
      xmlns:p="http://primefaces.org/ui"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets">

<ui:composition template="/template/template.xhtml">
    <ui:define name="title">T�tulo da P�gina</ui:define>
    
    <ui:define name="content">
        <!-- Conte�do da p�gina aqui -->
    </ui:define>
</ui:composition>
</html>
```

## Itens de Menu

A sidebar inclui os seguintes itens de menu:

1. **In�cio**
   - Dashboard

2. **Cadastros**
   - Pacientes
   - M�dicos

3. **Agendamentos**
   - Consultas

4. **Relat�rios**
   - Atendimentos

5. **Configura��es**
   - Usu�rios

## Responsividade

A sidebar � responsiva e se adapta a diferentes tamanhos de tela:
- Em telas grandes: sidebar sempre vis�vel
- Em telas pequenas (< 992px): sidebar oculta por padr�o, pode ser mostrada/escondida com o bot�o de menu

## Pr�ximos Passos Sugeridos

1. Implementar as p�ginas para cada item do menu
2. Adicionar controle de acesso baseado em perfil de usu�rio
3. Melhorar a experi�ncia do usu�rio com feedback visual para o item de menu ativo