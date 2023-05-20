import React, { useState } from "react"
import "./header.css"
import { nav } from "../../data/Data"
import { Link } from "react-router-dom"

const Header = () => {
  const [navList, setNavList] = useState(false)

  return (
    <>
      <header>
        <div className='container flex'>
          <div className='logo'>
            <Link to={"/"}><img src='./images/logo.png' alt='' /></Link>
          </div>
          <div className='nav'>
            <ul className={navList ? "small" : "flex"}>
              {nav.map((list, index) => (
                <li key={index}>
                  <Link to={list.path}>{list.text}</Link>
                </li>
              ))}
            </ul>
          </div>
          <div className='button flex'>
            {/* <h4>
              <span>2</span>Избранное
            </h4> */}
            
            <Link to={"/signin"}>
              <button className='btn1'> 
                    Вход
              </button>
            </Link>
            <Link to={"/signup"}>
              <button className='btn1'> 
                    Регистрация
              </button>
            </Link>
            
          </div>

          <div className='toggle'>
            <button onClick={() => setNavList(!navList)}>{navList ? <i className='fa fa-times'></i> : <i className='fa fa-bars'></i>}</button>
          </div>
        </div>
      </header>
    </>
  )
}

export default Header
