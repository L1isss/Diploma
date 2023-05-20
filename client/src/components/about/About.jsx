import React from "react"
import Back from "../common/Back"
import Heading from "../common/Heading"
import img from "../images/pricing.jpg"
import "./about.css"
import Header from "../common/header/Header"
import Footer from "../common/footer/Footer"

const About = () => {
  return (
    <>
      <section className='about'>
        <Back name='О нас' title='О нас - Чем мы занимаемся?' cover={img} />
        <div className='container flex mtop'>
          <div className='left row'>
            <Heading title='Наша история' subtitle='Поможет вам немного больше узнать о нас и наших принципах работы' />

            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.</p>
            <button className='btn2'>Еще больше информации</button>
          </div>
          <div className='right row'>
            <img src={img} alt='' />
          </div>
        </div>
      </section>
      <Footer/>
    </>
  )
}

export default About
