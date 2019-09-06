<template>
 <div class="allcourse">
     
      <div class="c-header" >
            <h1>全部课程</h1>
        </div>
        <canvas ref="courseCanvas" id="courseCanvas"></canvas>
 </div>
</template>

<script type="text/ecmascript-6">
export default {
 data() {
 return {

 }
 },
 components: {

 },
 mounted(){
     let canvas = this.refs.courseCanvas;
     let ctx = canvas.getContext("2d");
 }
}
</script>

<style scoped>
</style>
