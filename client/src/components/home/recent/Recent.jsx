import React from "react"
import Heading from "../../common/Heading"
import "./recent.css"
import RecentCard from "./RecentCard"

const Recent = () => {
  return (
    <>
      <section className='recent padding'>
        <div className='container'>
          <Heading title='Каталог' subtitle='Недвижимость в любой точке Беларуси от проверенных собственников ' />
          <RecentCard />
        </div>
      </section>
    </>
  )
}

export default Recent
