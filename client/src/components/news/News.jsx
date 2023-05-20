import React from "react"
import "./news.css"
import Footer from "../common/footer/Footer"
import { Link } from "react-router-dom"
import Back from "../common/Back"
import img from "../images/services.jpg"

const News = () => {
  return (
    <>
      <Back name='Новости' title='Свежие новости' cover={img} />
      <Link to={"/"}>      <img src="../images/news.png" alt='' /></Link>
      <Footer/>
    </>
  )
}

export default News