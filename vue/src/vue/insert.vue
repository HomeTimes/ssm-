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
    <el-button type="primary" @click="insert()">插入</el-button>
    <el-button type="success" @click="comeback()">返回</el-button>
  </el-form-item>
</el-form>
</div>
</template>      
<script>
  export default{
      name:'insert',
      data(){
          return{
              author:"",
              name:"" ,
              publishes:""
          }       
      },
       created(){
        
       },
       methods:{
comeback(){
 this.$router.push("/list")
},
insert(){
          this.$axios({
                    method: 'post',
                    url: 'http://localhost:8080/demo1/insert',
                    data: {
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
