/* (c) 2024 by Gan Xiaohe  */
console.log(localStorage.getItem('token'));
axios.defaults.headers.common['token'] = localStorage.getItem('token')