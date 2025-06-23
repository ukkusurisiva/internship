import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Login from './components/login'
import Sample from './components/Getallusers'
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Signup from './components/Signup'


function App() {
  return(

    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Sample />} />
        <Route path="/login" element={<Login />} />
        <Route path="/signup" element={<Signup />}/>
      </Routes>
    </BrowserRouter>

  )
}

export default App
