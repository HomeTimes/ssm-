<template>
<div>
  <!-- <el-form  style="width:300px; margin:0 auto;"> -->
      <div style="text-align:center; ">
           <el-form>
                <el-form-item>
      <!-- 用户名:{{username}}你好 -->
           </el-form-item>
           </el-form>                
      </div>
       <div>
           <el-row style="text-align:center;">
             <el-button type="success" @click="insert()">成功按钮</el-button>
            </el-row>
       </div>
       <div>
           <el-table
              :data="list"
               style="width: 50%;margin:0 auto;">
              <el-table-column
                 label="作者" 
                 width="180">
      <template slot-scope="scope">
        <span style="margin-left: 10px">{{ scope.row.author }}</span>
      </template>
    </el-table-column>
    <el-table-column
      label="书名"
      width="180">

      <template slot-scope="scope">
        <el-popover trigger="hover" placement="top">
          <p>姓名: {{ scope.row.name }}</p>
          <p>出版社: {{ scope.row.publishes }}</p>
          <div slot="reference" class="name-wrapper">
            <el-tag size="medium">{{ scope.row.name }}</el-tag>
          </div>
        </el-popover>
      </template>
    </el-table-column>

    <el-table-column label="操作">
         
      <template slot-scope="scope">
        <el-button
          size="mini"
          @click="edit(scope.row.id)"
         >编辑</el-button>
         <el-popconfirm
          confirm-button-text='好的'
          cancel-button-text='不用了'
            icon-color="red"
              icon="el-icon-info"
          title="这是一段内容确定删除吗？"
           @confirm="handleConfirm(scope.row.id)"
           @cancel="handleCancel"
>
        <el-button
          size="mini"
          type="danger"
          slot="reference"
          >删除</el-button>
          </el-popconfirm>
      </template>
    </el-table-column>
  </el-table>
       </div>
     
  <!-- </el-form> -->
</div>
</template>
       
<script>
  export default{
      name:'login',
      data(){
          return{
            username:"",
            password:"" ,
            list:[]
          }
      },
      created(){
         this.show()
        //  console.log( this.$route.query),
        //  this.username=this.$route.query.data.author
      },
      methods:{
          show(){
              this.$axios({
                            method: 'get',
                            url: 'http://localhost:8080/demo1/findallBook',
                            responseType: 'json'
                          })
                            .then(res=>{
                               this.list=res.data
                            }              
  )
          },
          edit(id){
                 this.$axios({
                            method: 'get',
                            url: 'http://localhost:8080/demo1/findbookID?id='+id,
                            responseType: 'json'
                          })
                            .then(res=>{
                                 if(res.data == null){
                                     return
                                 }
                                   this.$router.push({
                                      path:'/edit',
                                    query:{
                                        data:res.data 
                                    }
                 })
                            } )    
               
          },
          insert(){
              this.$router.push(
                  "/insert"
              )
          },
          handleConfirm(id){
                 console.log(id)
                 this.$axios({
                    method: 'get',
                    url: 'http://localhost:8080/demo1/delete?id='+id,
                        })
                    this.$router.push("/list")            
          } 
      }
  }
</script>
   
<style>
</style>
