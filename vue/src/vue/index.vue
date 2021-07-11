<template>
   <div>
     <div>index.vue界面</div>
     <router-view></router-view>
   </div>
</template>

<script>
  export default {
    name:'index',
    data() {
      return {
        
      }
    },
    methods: {
      onSubmit() {
        console.log('submit!');
      }
    }
  }
  </script> 
<style >
  .oop{
      text-align: center;
  }
</style>
