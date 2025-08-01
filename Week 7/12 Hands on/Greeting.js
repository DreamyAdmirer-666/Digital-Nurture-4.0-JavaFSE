import React from "react";
import UserPage from "./UserPage";
import GuestPage from "./GuestPage";

function Greeting(props)
{
    const isLoggedIn=props.isLoggedIn;
    return isLoggedIn ? <UserPage/>:<GuestPage/>;
}
export default Greeting;