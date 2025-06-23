import React, { useState } from 'react'
import axios from 'axios';

function Login() {
    const [username,setUsername] = useState("");
    const [password,setPassword] = useState("");
    const [result,setResult] = useState("");

    const clicked= (e)  =>{
        e.preventDefault();
        console.log(username);
        console.log(password);
        axios.post("http://localhost:8080/add", {username:username,password:password})
        .then(Response =>{
            setResult(Response.data);
            console.log(result);
        })
        .catch(er => console.log(er));
    }
  return (
    <div>
    <div className='Apply'>
        <center>
        <form onSubmit ={clicked} id="e">
          <div style={{display:'center',textAlign:'center'}}>
              <div style={{display:'flex',padding:'10px',flexDirection:'column'}}>
                  <div style={{display:'flex',padding:'10px'}}>
                    <div style={{width:'40%',textAlign:'center',fontWeight:'bold',color:'white'}}>username</div>
                    <div style={{width:'60%'}}><input type="text" id="username" name="username" placeholder='username' value={username} onChange={(e) => {setUsername(e.target.value)}} autoComplete='username' style={{width:'100%'}}/> </div>
                  </div>
                  <div style={{display:'flex',padding:'10px'}}>
                    <div style={{width:'40%',textAlign:'center',fontWeight:'bold',color:'white'}}>password</div>
                    <div style={{width:'60%'}}><input type="password" id="password" name="password" placeholder='password' value={password} onChange={(e) => {setPassword(e.target.value)}} autoComplete='password' style={{width:'100%'}}/> </div>
                  </div>
              </div>
              <div style={{paddingLeft:"30%"}}>
                 <button  type="submit" name="submit" placeholder='submit' style={{marginTop:"5px" ,height:"30px",width:"70px",}}>SUBMIT</button>
                 </div>
             </div>
        </form>
        </center>
    </div>
    </div>
  )
}

export default Login;