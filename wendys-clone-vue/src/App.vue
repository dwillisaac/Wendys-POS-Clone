<template>
  <div>
  <navbarView></navbarView>
 <router-view></router-view>
  </div>
</template>

<script>
import navbarView from './views/navbarView.vue';


export default {
  
  components: {
    navbarView,
  }
}
</script>

<style>


</style>
