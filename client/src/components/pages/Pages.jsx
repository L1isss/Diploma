import React from "react"
import { BrowserRouter as Router, Routes, Route } from "react-router-dom"
import Home from "../home/Home"
import About from "../about/About"
import Blog from "../blog/Blog"
import Services from "../services/Services"
import Contact from "../contact/Contact"
import Properties from "../properties/Properties"
import Signin from "../auth/Signin"
import Signup from "../auth/Signup"
import Header from "../common/header/Header"



const Pages = () => {
  return (
    <>

      <Router>
      <Header/>
        <Routes>
          <Route exact path='/' element={<Home/>} />
          <Route exact path='/about' element={<About/>} />
          <Route exact path='/services' element={<Services/>} />
          <Route exact path='/blog' element={<Blog/>} />
          <Route exact path='/contact' element={<Contact/>} />

          <Route exact path='/properties' element={<Properties/>} />
          <Route exact path='/signin' element={<Signin/>} />
          <Route exact path='/signup' element={<Signup/>} />



        </Routes>
      </Router>
    </>
  )
}

export default Pages
