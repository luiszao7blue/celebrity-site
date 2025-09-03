<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="Página dedicada à artista Lady Gaga, com imagens e informações sobre sua carreira.">
  <title>Lady Gaga - Página Inicial</title>

  <!-- Fonte fancy do Google Fonts -->
  <link href="https://fonts.googleapis.com/css2?family=Playfair+Display:wght@400;700&display=swap" rel="stylesheet">

  <!-- Estilos personalizados -->
  <style>
    body {
      background: linear-gradient(135deg, #ff9a9e, #fad0c4, #fbc2eb, #a18cd1);
      background-size: 400% 400%;
      animation: gradientShift 15s ease infinite;

      font-family: 'Playfair Display', serif;
      color: #333;
      margin: 0;
      padding: 0;
    }

    @keyframes gradientShift {
      0% {
        background-position: 0% 50%;
      }

      50% {
        background-position: 100% 50%;
      }

      100% {
        background-position: 0% 50%;
      }
    }

    /* Estilo adicional básico */
    header,
    footer {
      background-color: rgba(255, 255, 255, 0.8);
      padding: 1rem;
      border-radius: 8px;
    }

    img {
      max-width: 100%;
      height: auto;
    }

    nav ul {
      padding: 0;
      list-style: none;
    }

    nav li a {
      text-decoration: none;
      color: #222;
      font-weight: bold;
    }

    h1, h2 {
      font-weight: 700;
    }

    .container {
      max-width: 960px;
      margin: auto;
      padding: 1rem;
    }

    .text-center {
      text-align: center;
    }

    .my-5 {
      margin-top: 3rem;
      margin-bottom: 3rem;
    }

    .mb-4 {
      margin-bottom: 1.5rem;
    }

    .mb-3 {
      margin-bottom: 1rem;
    }

    .small {
      font-size: 0.875rem;
    }

    .lead {
      font-size: 1.25rem;
      font-weight: 300;
    }

    .rounded {
      border-radius: 0.5rem;
    }

    .shadow {
      box-shadow: 0 0.5rem 1rem rgba(0, 0, 0, 0.15);
    }

    .row {
      display: flex;
      flex-wrap: wrap;
      gap: 1rem;
      justify-content: center;
    }

    .col-md-4 {
      flex: 0 0 30%;
      max-width: 30%;
    }

    @media (max-width: 768px) {
      .col-md-4 {
        flex: 0 0 100%;
        max-width: 100%;
      }
    }
  </style>
</head>

<body>
  <!-- Cabeçalho -->
  <header class="container text-center my-5">
    <h1>Lady Gaga</h1>
    <nav>
      <ul class="list-unstyled d-flex justify-content-center">
        <li><a href="#index" class="mx-3">Início</a></li>
        <li><a href="#galeria" class="mx-3">Galeria</a></li>
        <li><a href="#sobre" class="mx-3">Sobre</a></li>
      </ul>
    </nav>
  </header>

  <!-- Seção Index -->
  <section id="index" class="container my-5 text-center">
    <h2 class="mb-4">Lady Gaga</h2>

    <figure class="mb-3">
      <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Lady_Gaga_Grammys_2017.png/800px-Lady_Gaga_Grammys_2017.png"
        alt="Lady Gaga no Grammy Awards de 2017, vestindo traje preto com transparências" class="img-fluid rounded shadow" loading="lazy">
      <figcaption class="text-muted small">
        Imagem: Rogue Artists / CC BY 3.0
      </figcaption>
    </figure>

    <p class="lead">
      Lady Gaga é uma cantora, compositora e atriz norte-americana, conhecida por sua originalidade e versatilidade artística.
    </p>
  </section>

  <!-- Galeria -->
  <section id="galeria" class="container my-5">
    <h2 class="text-center mb-4">Galeria de Imagens</h2>

    <div class="row">
      <div class="col-md-4">
        <figure>
          <img
            src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Lady_Gaga_-_ArtRave_-_The_Artpop_Ball_Tour_%2814210479935%29.jpg/800px-Lady_Gaga_-_ArtRave_-_The_Artpop_Ball_Tour_%2814210479935%29.jpg"
            alt="Lady Gaga em apresentação ao vivo" class="img-fluid rounded shadow mb-3" loading="lazy">
          <figcaption class="text-muted small">
            Imagem: Thierry / CC BY 2.0
          </figcaption>
        </figure>
      </div>
      <div class="col-md-4">
        <figure>
          <img
            src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Lady_Gaga_at_the_2019_Grammy_Awards.png/800px-Lady_Gaga_at_the_2019_Grammy_Awards.png"
            alt="Lady Gaga em tapete vermelho" class="img-fluid rounded shadow mb-3" loading="lazy">
          <figcaption class="text-muted small">
            Imagem: Michael Black / CC BY-SA 4.0
          </figcaption>
        </figure>
      </div>
      <!-- Adicionar mais imagens conforme necessário -->
    </div>
  </section>

  <!-- Sobre -->
  <section id="sobre" class="container my-5 text-center">
    <h2 class="mb-4">Sobre Lady Gaga</h2>
    <p>
      Nascida Stefani Joanne Angelina Germanotta em 28 de março de 1986, Lady Gaga é uma das artistas mais aclamadas da
      indústria musical moderna. Conhecida por seu estilo extravagante e impactante, ela também é uma defensora dos direitos
      LGBTQIA+, do empoderamento feminino e da saúde mental.
    </p>
  </section>

  <!-- Rodapé -->
  <footer class="container text-center my-5">
    <p class="small">
      &copy; 2025 Lady Gaga Fan Page | Todos os direitos reservados.
    </p>
  </footer>

</body>

</html>
