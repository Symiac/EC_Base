<template>
  <div id="app">
    <v-header></v-header>
    <v-swiper></v-swiper>
    <v-activities></v-activities>
  </div>
</template>

<script>
import swiper from './components/swiper/swiper'
import header from './components/header/header'
import activities from './components/activities/activities'
export default {
  name: 'app',
  components: {
    "v-header":header,
    "v-swiper":swiper,
    'v-activities':activities
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  /* margin-top: 60px; */
}

</style>
