<%@include file="header.jsp" %>
    <header class="header--form-page">
      <nav class="container container--70">
        <ul class="nav--actions">
          <li class="logged-user">
            Witaj Agata
            <ul class="dropdown">
              <li><a href="#">Profil</a></li>
              <li><a href="#">Moje zbiórki</a></li>
              <li><a href="#">Wyloguj</a></li>
            </ul>
          </li>
        </ul>

        <ul>
          <li><a href="index.jsp" class="btn btn--without-border active">Start</a></li>
          <li><a href="index.jsp#steps" class="btn btn--without-border">O co chodzi?</a></li>
          <li><a href="index.jsp#about-us" class="btn btn--without-border">O nas</a></li>
          <li><a href="index.jsp#help" class="btn btn--without-border">Fundacje i organizacje</a></li>
          <li><a href="index.jsp#contact" class="btn btn--without-border">Kontakt</a></li>
        </ul>
      </nav>

      <div class="slogan container container--90">
          <h2>
            Dziękujemy za przesłanie formularza Na maila prześlemy wszelkie
            informacje o odbiorze.
          </h2>
      </div>
    </header>
<%@include file="footer.jsp" %>