import React from "react"
import "./properties.css"
import Footer from "../common/footer/Footer"


import House1 from '../../assets/house1.jpg'
import Bed1 from '../../assets/bed1.jpg'
import Bed2 from '../../assets/bed2.jpg'
import Kitchen from '../../assets/kitchen.jpg'
import Bathroom from '../../assets/bath1.jpg'


const Properties = () => {
    return (
        <>
        <div className='properties'>
            <h1 className='properties-text'>Двухкомнатная квартира</h1>
            <p className='properties-text'>Минск</p>
            <div className='container'>
                <img className='span-3 image-grid-row-2' src={House1} alt='' />
                <img src={Bed1} alt='' />
                <img src={Bed2} alt='' />
                <img src={Kitchen} alt='' />
                <img src={Bathroom} alt='' />
                <div className='span-3 img-details'>
                    <div className='top'>
                        <h2>Проспект Держинского 125</h2>
                        <p>Квартира продается</p>
                        <p className='price'></p>
                    </div>
                    <div className='info-grid'>
                        <div>
                            <div className='info'>
                                <p className='bold'>Этаж:</p><p>5</p>
                            </div>
                            <div className='info'>
                                <p className='bold'>Комнат:</p><p>2</p>
                            </div>
                        </div>
                        <div>
                            <div className='info'>
                                <p className='bold'>Площадь:</p><p>8,138</p>
                            </div>
                            <div className='info'>
                                <p className='bold'>Стоимость:</p><p>$14,797</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div className='span-2 right-img-details'>
                    <p>Уютная квартира в 10 минутах от метро. 5 этаж. Хороший ремонт. Жить в экологически чистом районе города Минска, отдыхать после рабочего дня возле водоёма или проводить выходные с семьёй на свежем воздухе — мечта многих городских жителей! В жилом комплексе, расположенном в живописном престижном районе вблизи Цнянского водохранилища, это станет реальностью! </p>
                    {/* <button className='btn'>Написать риэлтору</button> */}
                    <div className="cardteam">
                    <div className="team">
                        <div className='box'>
                            <button className='btn3'>19 Объектов</button>
                            <div className='details'>
                                <div className='img'>
                                    <img src="../images/customer/team-1.jpg" alt='' />
                                </div>
                                <i className='fa fa-location-dot'></i>
                                <label>Минск</label>
                                <h4>Игорь Куниренко</h4>
                                <div className='button flex'>
                                    <button>
                                        <i className='fa fa-envelope'></i>
                                        Написать
                                    </button>
                                    <button className='btn4'>
                                        <i className='fa fa-phone-alt'></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    </div>
                </div>

            </div>
            {/* <img className='container' src={Map} alt='' />; */}
            <iframe className="map" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2353.9279726160617!2d27.467814176587922!3d53.84414497243791!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x46dbd09ac2788667%3A0x570d249d3eae4a0d!2z0L_RgNC-0YHQv9C10LrRgiDQlNC30LXRgNC20LjQvdGB0LrQvtCz0L4gMjU4LCDQnNC40L3RgdC6!5e0!3m2!1sru!2sby!4v1684353166115!5m2!1sru!2sby" width="660" height="550" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>

        </div>
        
        <Footer/>
      </>
    )
    
}

export default Properties
