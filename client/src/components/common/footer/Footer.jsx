import React from "react"
import { footer } from "../../data/Data"
import "./footer.css"
import { Link } from "react-router-dom"

const Footer = () => {
  return (
    <>
      <section className='footerContact'>
        <div className='container'>
          <div className='send flex'>
            <div className='text'>
              <h1>Есть вопросы?</h1>
              <p>Мы ответим на каждый ваш вопрос</p>
            </div>
            <Link to ={"/contact"}><button className='btn5'>Связаться</button></Link>
          </div>
        </div>
      </section>

      <footer>
        <div className='container'>
          <div className='box'>
            <div className='logo'>
              <img src='../images/logo-light.png' alt='' />
              <h2>Не хотите пропускать важные события?</h2>
              <p>Подпишитесь на нашу рассылку и получайте полезную информацию и выгодные предложения от нашего агенства.</p>

              <div className='input flex'>
                <input type='text' placeholder='Email' />
                <button>Подписаться</button>
              </div>
            </div>
          </div>

          {footer.map((val) => (
            <div className='box'>
              <h3>{val.title}</h3>
              <ul>
                {val.text.map((items) => (
                  <li> {items.list} </li>
                ))}
              </ul>
            </div>
          ))}
        </div>
      </footer>
      <div className='legal'>
        <span>© 2023</span>
      </div>
    </>
  )
}

export default Footer
