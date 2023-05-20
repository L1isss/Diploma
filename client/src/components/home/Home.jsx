import React from "react"
import Awards from "./awards/Awards"
import Featured from "./featured/Featured"
import Hero from "./hero/Hero"
import Location from "./location/Location"
import Recent from "./recent/Recent"
import Team from "./team/Team"
import Header from "../common/header/Header"
import Footer from "../common/footer/Footer"

const Home = () => {
  return (
    <>

        <Hero />
        <Featured />
        <Recent />
        <Awards />
        <Location />
        <Team />
      <Footer/>
    </>
  )
}

export default Home
