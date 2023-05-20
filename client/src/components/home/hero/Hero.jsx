import React from "react"
import Heading from "../../common/Heading"
import "./hero.css"

const Hero = () => {
  return (
    <>
      <section className='hero'>
      <div className='container'>
      <Heading title='Недвижемость Беларусь' subtitle='Поможем найти недвижемость в твоем городе' />
          <form className='flex'>
            <div className='box'>
              <span>Город</span>
              <select className='box' id="bar">
                <option value="0">Минск</option>
                <option value="1">Гомель</option>
                <option value="2">Могилев</option>
              </select>
            </div>
            <div className='box'>
              <span>Тип услуги</span>
              <select className='box' id="bar">
                <option value="0">Покупка</option>
                <option value="1">Аренда</option>
              </select>
            </div>
            <div className='box'>
              <span>Тип недвижемости</span>
              <select className='box' id="bar">
                <option value="0">Жилая</option>
                <option value="1">Загородная</option>
                <option value="2">Коммерческая</option>
              </select>
            </div>
            <div className='box'>
              <span>Количество комнат</span>
              <select className='box' id="bar">
                <option value="0">1</option>
                <option value="1">2</option>
                <option value="2">3</option>
                <option value="3">4</option>
                <option value="4">5</option>
              </select>
            </div>

            <button className='btn1'>
              <i className='fa fa-search'></i>
            </button>
          </form>
          <div />
        </div>
      </section>
    </>
  )
}

export default Hero
