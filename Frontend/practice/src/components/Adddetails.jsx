import React from 'react'
import { useState } from 'react';
function Adddetails() {
 const[email,setEmail]= useState("");
 const[password,setPassword]= useState("");
 const[result,setResult]= useState("");



  return (
    <div style={{backgroundImage:'https://t3.ftcdn.net/jpg/03/70/92/84/360_F_370928450_R6g8c0j5cey86PUXE32W7KMiqIUe1fOI.jpg'}}>
        <div className="apple" style={{border:'1px solid'}}>
            <form className='dubel' >
                <table border='1' cellPadding={5} cellSpacing={5} style={{borderCollapse:'collapse'}}>
                    <tbody style={{backgroundColor:"green"}}>
                    <tr>  
                        <td colSpan={3} align='center'><h1>New User</h1></td>
                    </tr>
                    <tr>
                        <td colSpan={3}>
                            <table border={0} cellPadding={10} style={{borderCollapse:'collapse',width:'100%',height:'100%'}}>
                                <tr>
                                    <td>Email</td>
                                    <td>:</td>
                                    <td><input type='email' name='email' required placeholder='Enter email' value={email} onChange={(e) => {setEmail:e.target.value}} autoComplete='email'/></td>
                                </tr>
                                <tr>
                                    <td>Password</td>
                                    <td>:</td>
                                    <td><input type='password'name='password' required placeholder='Enter password' value={password} onChange={(e) => {setPassword:e.target.value}} autoComplete='current-password'/></td>
                                </tr>
                                <tr align="center">
                                    <td colSpan={3}>
                                       <input type='submit'/> 
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </div>
  )
}

export default Adddetails