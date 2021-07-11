<template>
<div>
  <el-form  style="width:300px; margin:0 auto;">
    <el-form-item>
      用户名:
     <el-input placeholder="请输入用户名" v-model="username" ></el-input>
  </el-form-item>
  <el-form-item>
    密码:
     <el-input placeholder="请输入密码" v-model="password" show-password></el-input>
  </el-form-item>
  <el-form-item>
    <el-button type="primary" @click="onSubmit">登录</el-button>
  </el-form-item>
</el-form>
</div>
</template>      
<script>
  export default{
      name:'login',
      data(){
          return{
            username:"",
            password:"" ,
            flag:false ,
          }       
      },
      methods:{
          onSubmit(){
            //  console.log(this.username+this.password)
            //  发送阿请求
                this.flag  =false;
              if(this.username.trim() ==""  || this.password.trim() =="" ){
                return;
              }
             this.$axios({
                 method: 'post',             
                  url: 'http://localhost:8080/demo1/findbook',
                headers: { 'Content-Type': 'application/json;charset=UTF-8' },
                 data: {
                      name: this.username,
                      password: this.password
                      },
                   responseType: 'json'
                      })
                      .then(res=>{
                         if(res.data===null){
                           return;
                         }

                          this.$router.push({
                            path:"/list",
                            query:{
                              data:res.data,
                              list:this.listbook
                            }
                          });
                      }
                      );
                  
             
          }
      }
  }
</script>

<style>
</style>
