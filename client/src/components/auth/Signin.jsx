import React from "react"
import { Link } from "react-router-dom";

const Signin = () => {
  return (
    <section className="auth">
      <div className="form">
        <form class="login-form">
          <div className="login-form__logo-container">
            <img class="login-form__logo" src="../images/logo.png" alt="Logo" />
          </div>
          <div className="login-form__content">
            <div class="login-form__header">Login to your account</div>
            <input class="login-form__input" type="text" name="dc_username" placeholder="Username" />
            <input class="login-form__input" type="password" name="dc_username" placeholder="Password" />


            <Link to={"/favorites"}><button class="login-form__button" type="submit">Login</button></Link>


            <div class="login-form__links">
              <a class="login-form__link" href="./signup">Нет аккаунта. Зарегистрироваться</a>
            </div>
          </div>
        </form>
      </div>
    </section>


  );
}

export default Signin


