<template>
<div>
  <el-form  style="width:300px; margin:0 auto;">
    <el-form-item>
      作者:
     <el-input placeholder="请输入用户名" v-model="author" ></el-input>
  </el-form-item>
  <el-form-item>
    书名:
     <el-input placeholder="请输入密码" v-model="name" ></el-input>
  </el-form-item>
    <el-form-item>
    出版社:
     <el-input placeholder="请输入密码" v-model="publishes" ></el-input>
  </el-form-item>
  <el-form-item>
    <el-button type="primary" @click="onSubmit">更新</el-button>
    <el-button type="success" @click="comeback()">返回</el-button>
  </el-form-item>
</el-form>
</div>
</template>      
<script>
  export default{
      name:'login',
      data(){
          return{
              id:0,
            author:"",
            name:"" ,
            publishes:""
          }       
      },
       created(){
         this.show();
         console.log(this.$route.query)
       },
       methods:{
           show(){
               const data=this.$route.query.data
                 this.id =data.id
               this.name =data.name
               this.author=data.author
               this.publishes=data.publishes
           },
           comeback(){
               this.$router.push("/list")
           },
           onSubmit(){
               this.$axios({
                    method: 'post',
                    url: 'http://localhost:8080/demo1/updatebook',
                    data: {
                            id: this.id ,
                          name: this.name,
                        author:this.author,
                        publishes:this.publishes

                        }
                        })
                  this.$router.push("/list")      
           }
       }
      }
      </script>
      
<style>
</style>
