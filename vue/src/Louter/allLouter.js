
import VueRouter from 'vue-router'
import login from  "../vue/login.vue"
import edit from  "../vue/edit.vue"
import list from  "../vue/list.vue"
import insert from  "../vue/insert.vue"
// 创建路由
const router = new VueRouter({
    routes: [
      // 动态路径参数 以冒号开头
      { path: '/login', component: login },
      {
        path: '/list', component: list 
      },
      {
        path: '/edit', component: edit 
      },
      {
          path:'/insert',component:insert
      }
    ]
  })
  export default router