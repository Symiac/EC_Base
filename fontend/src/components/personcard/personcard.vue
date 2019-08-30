<template>
    <div class="wraper">
        <ma-left @valuechanged="changevalue"></ma-left>
        <ma-mainpanel :showvalue="show"></ma-mainpanel>
    </div>
</template>

<script>
    import left from './left';
    import mainPanel from './mainPanel'
    export default {
        name:"ma-persion-card",
        data(){
            return {
                show:0
            }
        },
        components:{
            "ma-left":left,
            "ma-mainpanel":mainPanel
        },
        methods:{
            changevalue(t){
                this.show=t[0]
            }
        }
    }
</script>

<style scoped>
    .wraper{
        position: absolute;
        left: 50%;
        top:50%;
        transform: translate(-50%,-25%);
        /* background: 说#999; */
        width: 572px;
        height:369px;
        box-shadow: 6px 6px 8px #369;
        transition: .3s;
        -moz-user-select: none
    }
    .wraper:hover{
        box-shadow: 6px 6px 8px #69e;
    }
</style>