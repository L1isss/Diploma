import React from "react"
import img from "../images/pricing.jpg"
import Back from "../common/Back"
import "./contact.css"
import Header from "../common/header/Header"
import Footer from "../common/footer/Footer"

const Contact = () => {
  return (
    <>

      <section className='contact mb'>
        <Back name='Контакты' title='Поддержка' cover={img} />
        <div className='container'>
          <form className='shadow'>
            <h4>Форма для обратной связи</h4> <br />
            <div>
              <input type='text' placeholder='Имя' />
              <input type='text' placeholder='Email' />
            </div>
            <input type='text' placeholder='Тема' />
            <textarea cols='30' rows='10'></textarea>
            <button>Отправить</button>
          </form>
        </div>
      </section>
      <Footer/>
    </>
  )
}

export default Contact
