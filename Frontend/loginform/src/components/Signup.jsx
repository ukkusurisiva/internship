import React, { useState } from 'react'
import axios from 'axios';
import { Link } from 'react-router-dom';
function Signup() {
    const [username,setUsername] = useState("");
    const [password,setPassword] = useState("");
    const [conformpassword,setConformpassword]= useState("");    
    const [result,setResult] = useState("")
    const update =(e) =>{
        e.preventDefault();
        if(password===conformpassword)
        {
            axios.post("http://localhost:8080/add",{username:username,password:password})
            .then(res=>{setResult(res.data==1?"success":"fail")})
            .catch(err=>console.log(err))
        }
        else{
            alert("Both password and confrompassword must be same")
        }    

    }

  return (
    <div style={{display:'flex', justifyContent:'center', alignItems:'center',height:'100vh',border:'1px solid green',width:'fit-content'}}>
    <form onSubmit={update} style={{height:'100vh',width:'fit-content',alignItems:'center'}}>
    <div >
        <div style={{display:'flex',flexDirection:'row'}}>
            <div >Username :</div>
            <div ><input type="text" name="username" value={username} onChange={(e)=>setUsername(e.target.value) } autoComplete='on'/></div>
        </div>
        <div style={{display:'flex',flexDirection:'row',paddingTop:'20px'}}>
        <div style={{width:'30%'}}>password :</div>
        <div style={{width:'70%'}}><input type="password" name="password" value={password} onChange={(e)=>setPassword(e.target.value) } autoComplete='on' style={{width:'100%'}}/></div>
        </div>
        <div style={{display:'flex',flexDirection:'row',paddingTop:'20px'}}>
        <div style={{width:'30%'}}>confrompassword :</div>
        <div style={{width:'70%'}}><input type="password" name="conformpassword" value={conformpassword} onChange={(e)=>setConformpassword(e.target.value) } autoComplete='on'/></div>
        </div>
        <div>
            <button  type="submit" name="submit" placeholder='submit' style={{marginTop:"5px" ,height:"30px",width:"70px",}}>SUBMIT</button>
        </div>
        <Link to="/login">sign in</Link>
        {result}
    </div>
    </form>
    </div>
  )
}

export default Signup