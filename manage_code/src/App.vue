<template>
	<router-view />
</template>
<script setup>
	import * as echarts from "echarts";
	import {
		provide
	} from "vue";
	provide("echarts", echarts);
	provide("baseUrl", process.env.VUE_APP_BASE_API)
	const debounce = (fn, delay) => {
		let timer = null;
		return function() {
			let context = this;
			let args = arguments;
			clearTimeout(timer);
			timer = setTimeout(function() {
				fn.apply(context, args);
			}, delay);
		}
	}
	
	const _ResizeObserver = window.ResizeObserver;
	window.ResizeObserver = class ResizeObserver extends _ResizeObserver {
		constructor(callback) {
			callback = debounce(callback, 16);
			super(callback);
		}
	}
</script>
<style lang="scss">
	#app {
		font-family: Avenir, Helvetica, Arial, sans-serif;
		-webkit-font-smoothing: antialiased;
		-moz-osx-font-smoothing: grayscale;
		// text-align: center;
		color: #2c3e50;
	}
	// 按钮盒子
	.formModel_btn_box {
		padding: 0 0 0 0px;
		margin: 20px 0 0;
		display: flex;
		width: 100%;
		justify-content: center;
		align-items: center;
		// 取消按钮
		.formModel_cancel {
			cursor: pointer;
			padding: 0 5px;
			margin: 0 30px 0 0;
			color: rgba(246,40,40,1);
			letter-spacing: 4px;
			font-size: 16px;
			border-color: rgba(246,40,40,1);
			border-radius: 0px;
			background: #fff;
			width: auto;
			border-width: 0 0 4px;
			border-style: solid;
			height: 36px;
		}
		// 取消按钮-悬浮
		.formModel_cancel:hover {
		}
		// 确定按钮
		.formModel_confirm {
			cursor: pointer;
			padding: 0 5px;
			margin: 0 30px 0 0;
			color: rgba(246,154,40,1);
			letter-spacing: 4px;
			font-size: 16px;
			border-color: rgba(246,154,40,1);
			border-radius: 0px;
			background: #fff;
			width: auto;
			border-width: 0 0 4px;
			border-style: solid;
			height: 36px;
		}
		// 确定按钮-悬浮
		.formModel_confirm:hover {
		}
	}
	.app-contain {
		border-radius: 0 0 0px 0px;
		padding: 20px 20px;
		margin: 0 auto 20px;
		overflow: hidden;
		background: #fff;
		width: calc(100% - 40px) !important;
		border-color: #ddd;
		border-width: 0 4px 4px;
		border-style: dotted;
		height: auto;
	}
	body {
		margin: 0;
	}
	* {
		box-sizing: border-box;
	}
	.el-select .el-input {
		font-size: inherit;
	}
	.el-input__inner {
		color: inherit;
	}
	nav {
		padding: 30px;

		a {
			font-weight: bold;
			color: #2c3e50;

			&.router-link-exact-active {
				color: #42b983;
			}
		}
	}
</style>