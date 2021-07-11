import"./js/yang.js"
import"./css/green.css"

import index from "./vue/index.vue"
import Vue  from "vue"
import VueRouter from 'vue-router'
import router from "./Louter/allLouter.js"
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import locale from 'element-ui/lib/locale/lang/en'
// import axios from "axios"
import axios from 'axios'
Vue.use(ElementUI, { locale })
Vue.use(VueRouter)
Vue.prototype.$axios = axios
  new Vue({
    el:"#app",
    data:{
         
    },
    render:c=>c(index),
    router
})