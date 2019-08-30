<template>
    <div class="ma-mainpanel">
        <ma-about v-if="showvalue==0"></ma-about>
        <ma-contact v-if="showvalue==2"></ma-contact>
        <ma-project v-if="showvalue==3"></ma-project>
    </div>
</template>

<script>
    import about from './about'
    import contact from './contact'
    import project from './project'
    export default {
        name:"ma-mainpanel",
        props:["showvalue"],
        components:{
            "ma-about":about,
            "ma-contact":contact,
            "ma-project":project
        }    
    }
</script>

<style scoped>
    .ma-mainpanel{
        float: left;
        width:382px;
        height:369px;
        background: #ddd;
        z-index: 1000;
    }
</style>