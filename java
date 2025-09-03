document.addEventListener('DOMContentLoaded', function () {
    const botaoDeAcessibilidade = document.getElementById('botao-acessibilidade');
    const opcoesDeAcessibilidade = document.getElementById('opcoes-acessibilidade');

    // Alternar a visibilidade das opções de acessibilidade e a rotação do botão
    botaoDeAcessibilidade.addEventListener('click', function () {
        botaoDeAcessibilidade.classList.toggle('rotacao-botao');
        opcoesDeAcessibilidade.classList.toggle('apresenta-lista');
    });

    // Manipulação do aumento e diminuição da fonte
    const aumentaFonteBotao = document.getElementById('aumentar-fonte');
    const diminuiFonteBotao = document.getElementById('diminuir-fonte');

    let tamanhoAtualFonte = 1;

    aumentaFonteBotao.addEventListener('click', function () {
        tamanhoAtualFonte += 0.1;
        document.body.style.fontSize = `${tamanhoAtualFonte}rem`;

        // Adicionando um efeito visual de transição para o aumento de fonte
        document.body.style.transition = "font-size 0.3s ease";
    });

    diminuiFonteBotao.addEventListener('click', function () {
        tamanhoAtualFonte -= 0.1;
        document.body.style.fontSize = `${tamanhoAtualFonte}rem`;

        // Efeito visual de transição para o tamanho da fonte diminuindo
        document.body.style.transition = "font-size 0.3s ease";
    });

    // Adicionando efeitos de cor ao botão de acessibilidade
    botaoDeAcessibilidade.addEventListener('mouseenter', function () {
        botaoDeAcessibilidade.style.background = 'linear-gradient(45deg, #FF7E5F, #feb47b, #FF6A00, #FF1493, #00BFFF)';
        botaoDeAcessibilidade.style.color = '#fff';
    });

    botaoDeAcessibilidade.addEventListener('mouseleave', function () {
        botaoDeAcessibilidade.style.background = 'transparent';
        botaoDeAcessibilidade.style.color = '#000';
    });
});
