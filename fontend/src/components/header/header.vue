<template>
    <div class="v-header">
        <div class="inner">

        </div>
    </div>
</template>

<script>
    export default {
        name:"v-header"
    }
</script>

<style scoped>
.v-header{
    width: 100%;
    height: 80px;
    background: #333;
}
.inner{
    position: fixed;
    left: 0;
    top:0;
    width: 100%;
    height:80px;
    background: rgba(50, 100, 150, .7)
}
</style>