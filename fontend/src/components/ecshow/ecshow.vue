
<template>
 <div class="ecshow">
     <div class="e-header">
            <h1>电商风采</h1>
        </div>
     <div class="demo">
	<div class="container">
		<div class="row">
			<div class="col-md-4 col-sm-6">
				<div class="box">
					<img src="@/assets/images/img-1.jpg">
					<div class="box-content">
						<h3 class="title">标题：xxx</h3>
						<span class="post">发布者：xx</span>
                        <button type="button" class="btn btn-primary">more</button>
					</div>
				</div>
			</div>
			<div class="col-md-4 col-sm-6">
				<div class="box">
				<img src="@/assets/images/img-2.jpg">
					<div class="box-content">
						<h3 class="title">标题：xxx</h3>
						<span class="post">发布者：xx</span>
                        <button type="button" class="btn btn-primary">more</button>
					</div>
				</div>
			</div>
			<div class="col-md-4 col-sm-6">
				<div class="box">
				<img class="img-clip image-clip-5" src="@/assets/images/img-3.jpg">
					<div class="box-content">
						<h3 class="title">标题：xxx</h3>
						<span class="post">发布者：xx</span>
                        <button type="button" class="btn btn-primary">more</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

 </div>
</template>

<script type="text/ecmascript-6">
import './bootstrap-grid.min.css'
export default {
 data() {
 return {

 }
 },
 components: {

 }
}
</script>

<style scoped>
/* eslint-disable */
.ecshow{
margin-top:30px;
display: block;

}
.e-header{
    width:100%;
    height: 60px;
    color: #000
}
.e-header h1{
    font-size: 20px;
    font-weight: 700;
    font-family: "宋体"
}
.demo{padding: 2em 0;}
.box{
	font-family: 'Merriweather Sans', sans-serif;
	overflow: hidden;
	position: relative;
	z-index: 1;
	transition: all .5s;
}
.box:hover{ box-shadow: 3px 3px 5px #999; }
.box:before,
.box:after{
	content: "";
	background: radial-gradient(circle at 23% 70%,rgba(255,255,255,0.8),#fff 30%);
	width: 150%;
	height: 150%;
	opacity: 0;
	transform: rotate(45deg);
	position: absolute;
	top:-10.5%;
	right:-150%;
	z-index: 1;
	transition: all 0.35s ease;
}
.box:after{
	background: rgba(255,255,255,0.5);
	width: 65%;
	height: 65%;
	right: auto;
	left: -20%;
	top: -65%;
}
.box:hover:before{
	opacity: 1;
	right: -85%;
}
.box:hover:after{
	opacity: 1;
	top: -42%;
}
.box img{
	width: 100%;
	height: auto;
	transition: all 0.5s ease;
}
.box:hover img{ transform: scale(1.2); }
.box .box-content{
	text-align: right;
	transform: translateY(-50%);
	position: absolute;
	top: 50%;
	right: -100%;
	z-index: 2;
	transition: all .5s;
}
.box:hover .box-content{ right: 5%; }
.box .title{
	color: #1e272e;
	font-size: 23px;
	font-weight: 700;
	text-transform: uppercase;
	margin: 15px 0 15px 0;
}
.box .post{
	font-size: 16px;
	text-transform: capitalize;
	margin: 0 0 15px;
	display: block;
}




@media only screen and (max-width:990px){
	.box { margin: 0 0 30px; }
}
@media only screen and (max-width:479px){
	.box .title{ font-size: 20px; }
}
</style>