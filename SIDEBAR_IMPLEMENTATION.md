# Implementação da Sidebar Padrão

## Visão Geral
Este documento descreve a implementação de uma sidebar padrão para o projeto Clínica Plus. A sidebar foi implementada usando componentes PrimeFaces e segue um design responsivo.

## Arquivos Criados/Modificados

### Arquivos Criados:
1. **Template Principal**
   - Caminho: `/src/main/resources/META-INF/resources/template/template.xhtml`
   - Descrição: Template base com a estrutura da página, incluindo sidebar, topbar e área de conteúdo.

2. **Arquivo CSS**
   - Caminho: `/src/main/resources/META-INF/resources/css/style.css`
   - Descrição: Estilos para a sidebar, layout geral e componentes da interface.

3. **Arquivo JavaScript**
   - Caminho: `/src/main/resources/META-INF/resources/js/script.js`
   - Descrição: Script para controlar o comportamento responsivo da sidebar em dispositivos móveis.

### Arquivos Modificados:
1. **Página Inicial**
   - Caminho: `/src/main/resources/META-INF/resources/index.xhtml`
   - Descrição: Modificada para usar o template com a sidebar.

## Funcionalidades Implementadas

### Sidebar
- Menu de navegação com categorias para diferentes seções do sistema
- Estilo visual consistente com a identidade da aplicação
- Comportamento responsivo (colapsa em dispositivos móveis)

### Layout Geral
- Estrutura dividida em sidebar, área de conteúdo principal e rodapé
- Topbar com botão para mostrar/esconder a sidebar em dispositivos móveis
- Área de conteúdo flexível que se adapta ao conteúdo da página

## Como Usar o Template

Para criar novas páginas usando o template com a sidebar:

```xml
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:f="http://xmlns.jcp.org/jsf/core"
      xmlns:p="http://primefaces.org/ui"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets">

<ui:composition template="/template/template.xhtml">
    <ui:define name="title">Título da Página</ui:define>
    
    <ui:define name="content">
        <!-- Conteúdo da página aqui -->
    </ui:define>
</ui:composition>
</html>
```

## Itens de Menu

A sidebar inclui os seguintes itens de menu:

1. **Início**
   - Dashboard

2. **Cadastros**
   - Pacientes
   - Médicos

3. **Agendamentos**
   - Consultas

4. **Relatórios**
   - Atendimentos

5. **Configurações**
   - Usuários

## Responsividade

A sidebar é responsiva e se adapta a diferentes tamanhos de tela:
- Em telas grandes: sidebar sempre visível
- Em telas pequenas (< 992px): sidebar oculta por padrão, pode ser mostrada/escondida com o botão de menu

## Próximos Passos Sugeridos

1. Implementar as páginas para cada item do menu
2. Adicionar controle de acesso baseado em perfil de usuário
3. Melhorar a experiência do usuário com feedback visual para o item de menu ativo