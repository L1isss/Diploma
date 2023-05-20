import React from "react"
import "./signup.css"

const Signup = () => {
  return (
    <section className="auth">
      <div className="form">
      <form class="login-form" action="./" method="POST">
    <div className="login-form__logo-container">
        <img class="login-form__logo" src="../images/logo.png" alt="Logo"/>
    </div>
    <div className="login-form__content">
        <div class="login-form__header">Registration your account</div>
        <input class="login-form__input" type="text" name="dc_username" placeholder="Username"/>
        <input class="login-form__input" type="email" name="dc_username" placeholder="Email"/>
        <input class="login-form__input" type="password" name="dc_username" placeholder="Password"/>
        <button class="login-form__button" type="submit">Registration</button>
        <div class="login-form__links">
            <a class="login-form__link" href="./signin">есть аккаунт. Войти</a>
        </div>
    </div>
</form>
      </div>
      </section>
  );
}

export default Signup


  