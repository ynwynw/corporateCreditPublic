<template>
	<div>
		<div class="app-contain">
			<el-form class="password_form" ref="passwordFormRef" :model="form" label-width="120px" :rules="rules">
				<el-form-item label="密码" prop="mima1">
					<el-input class="list_inp" v-model="form.mima1" type="password" show-password />
				</el-form-item>
				<el-form-item label="新密码" prop="mima">
					<el-input class="list_inp" v-model="form.mima" type="password" show-password />
				</el-form-item>
				<el-form-item label="确认密码" prop="mima2">
					<el-input class="list_inp" v-model="form.mima2" type="password" show-password />
				</el-form-item>
				<span class="update_form_btn_box">
					<el-button class="update_btn" type="primary" @click="onSubmit">保存</el-button>
				</span>
					
			</el-form>
		</div>
	</div>
</template>

<script setup>
	import {
		reactive,
		ref,
		getCurrentInstance
	} from 'vue'
	const context = getCurrentInstance()?.appContext.config.globalProperties;
	const form = ref({})
	const user = ref({})
	const sessionTable = ref('')
	const passwordFormRef = ref(null)
	const rules = ref({
		mima1: [{
			required: true,
			message: '请输入',
			trigger: 'blur'
		}, ],
		mima: [{
			required: true,
			message: '请输入',
			trigger: 'blur'
		}, ],
		mima2: [{
			required: true,
			message: '请输入',
			trigger: 'blur'
		}, ],
	})
	const onSubmit = async () => {
		passwordFormRef.value.validate(async (valid) => {
			if (valid) {
				if(sessionTable.value == 'users'){
					if (form.value.mima1 != user.value.password) {
						context?.$toolUtil.message('原密码不正确','error')
						return false
					}
					user.value.password = form.value.mima
				}else{
				}
				if (form.value.mima2 != form.value.mima) {
					context?.$toolUtil.message('两次密码输入不一致','error')
					return false
				}
				context?.$http({
					url: `${sessionTable.value}/update`,
					method: 'post',
					data: user.value
				}).then(res => {
					context?.$toolUtil.message('修改成功，下次登录将使用新密码登录','success')
				})
			}
		})

	}
	const getInfo = () => {
		sessionTable.value = context?.$toolUtil.storageGet('sessionTable')
		context?.$http({
			url: `${sessionTable.value}/session`,
			method: 'get'
		}).then(res => {
			user.value = res.data.data
		})
	}
	getInfo()
</script>

<style lang="scss" scoped>
	// 表单
	.password_form{
		border: 0px solid #ddd;
		border-radius: 4px;
		padding: 30px;
		margin: 0;
		background: none;
		// form item
		:deep(.el-form-item) {
			margin: 0 150px 20px 0;
			background: none;
			display: flex;
			// 内容盒子
			.el-form-item__content{
				display: flex;
				width: calc(100% - 120px);
				justify-content: flex-start;
				align-items: center;
				flex-wrap: wrap;
				// 输入框
				.list_inp {
					border-radius: 0px;
					padding: 0 10px;
					background: #fff;
					width: auto;
					border-color: #999;
					border-width: 0 0 1px;
					line-height: 36px;
					box-sizing: border-box;
					border-style: dashed;
					min-width: 350px;
					height: 36px;
					//去掉默认样式
					.el-input__wrapper{
						border: none;
						box-shadow: none;
						background: none;
						border-radius: 0;
						height: 100%;
						padding: 0;
					}
					.is-focus {
						box-shadow: none !important;
					}
				}
			}
		}
		// 按钮盒子
		.update_form_btn_box {
			padding: 0 0 0 0px;
			margin: 20px 0 0;
			display: flex;
			width: 100%;
			justify-content: center;
			align-items: center;
			// 确定按钮
			.update_btn {
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
			.update_btn:hover {
			}
		}
	}
</style>
