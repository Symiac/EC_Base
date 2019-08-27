<template>
    <div class="outlink">
        <div class="o-header">
            <h1>友情链接</h1>
        </div>
        <div class="links">
            <ul>

                <li>
                    <div class="link">
                        <div class="icon">
                            <i class="fa fa-graduation-cap" aria-hidden="true"></i>
                        </div>
                        <div class="desc">
                            <p>
                                对链接简单的描述balabalablablablablabla
                            </p>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="link">
                        <div class="icon">
                            <i class="fa fa-graduation-cap" aria-hidden="true"></i>
                        </div>
                        <div class="desc">
                            <p>
                                对链接简单的描述balabalablablablablabla
                            </p>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="link">
                        <div class="icon">
                            <i class="fa fa-graduation-cap" aria-hidden="true"></i>
                        </div>
                        <div class="desc">
                            <p>
                                对链接简单的描述balabalablablablablabla
                            </p>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="link">
                        <div class="icon">
                            <i class="fa fa-graduation-cap" aria-hidden="true"></i>
                        </div>
                        <div class="desc">
                            <p>
                                对链接简单的描述balabalablablablablabla
                            </p>
                        </div>
                    </div>
                </li>
            </ul>
            
        </div>
       
    </div>
</template>

<script>
    export default {
        name:"v-outlink",
        data(){
            return{
                font:true
            }
        },
        methods:{
            enter(){
                this.font=false
                window.console.log("--------------")
            }
        }
    }
</script>

<style scoped>
.outlink{
margin-top:30px;
display: block;

}
.o-header{
    width:100%;
    height: 80px;

}
.o-header h1{
    font-size: 28px;
    font-weight: 700;
    font-family: "宋体"
}
.links li{
    width: 25%;
    height:auto;
    float: left;
    cursor: pointer;
}
.link{
    width:240px;
    height:180px;
    border:solid 1px #999;
    margin: 0% auto;
    transition: 2s;
    /* transition-delay: 2s; */
}
.link .icon{
    width:100%;
    height:80px;
    color:#e63;
    font-size: 50px;
    line-height: 80px;
    
}
.link:hover{
    animation: linkshakesmall .5s  1;
}
@keyframes linkshake {
    0%{transform: translateX(20px)}
    10%{transform: translateX(-20px)}
    20%{transform: translateX(16px)}
    30%{transform: translateX(-16px)}
    40%{transform: translateX(12px)rotateZ(5deg)}
    50%{transform: translateX(-12px)rotateZ(-5deg)}
    60%{transform: translateX(8px)}
    70%{transform: translateX(-8px)}
    80%{transform: translateX(4px)}
    90%{transform: translateX(-4px)}
    100%{transform: translateX(2px)}
}
@keyframes linkshakesmall {
    0%{transform: translateX(15px)}
    10%{transform: translateX(-15px)}
    20%{transform: translateX(12px)}
    30%{transform: translateX(-12px)}
    40%{transform: translateX(9px)rotateZ(5deg)}
    50%{transform: translateX(-9px)rotateZ(-5deg)}
    60%{transform: translateX(6px)}
    70%{transform: translateX(-6px)}
    80%{transform: translateX(3px)}
    90%{transform: translateX(-3px)}
    100%{transform: translateX(1px)}
}
.desc p{
    width:80%;
    line-height: 200%;
    margin: 30px auto
}
.testAB{
    height: 300px;
    width:400px;
    margin-top: 1000px;
    margin-left: 300px;
}
.A, .B{
    position: absolute;
    width: 400px;
    height: 300px;
    translate: 2s;
}
.A{
    background: red;
    /* transform: rotateY(90deg); */
    /* transition-delay: 2s; */

}

.B{
    background: blueviolet;
    transform: rotateY(0deg)
}

</style>