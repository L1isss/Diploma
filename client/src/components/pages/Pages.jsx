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
import Info from "../info/Info"
import Favorites from "../favorites/Favorites"
import Chats from "../chats/Chats"
import Chat from "../chat/Chat"
import News from "../news/News"

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
          <Route exact path='/news' element={<News/>} />
          <Route exact path='/properties' element={<Properties/>} />
          <Route exact path='/signin' element={<Signin/>} />
          <Route exact path='/signup' element={<Signup/>} />

          <Route exact path='/info' element={<Info/>} />
          <Route exact path='/favorites' element={<Favorites/>} />
          <Route exact path='/chats' element={<Chats/>} />
          <Route exact path='/chat' element={<Chat/>} />
        </Routes>
      </Router>
    </>
  )
}

export default Pages
