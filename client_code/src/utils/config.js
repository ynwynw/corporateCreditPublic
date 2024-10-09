const config = {
    get() {
        return {
            url : process.env.VUE_APP_BASE_API_URL + process.env.VUE_APP_BASE_API + '/',
            name: process.env.VUE_APP_BASE_API,
			menuList:[
				{
					name: '新闻资讯管理',
					icon: '${frontMenu.fontClass}',
					child:[
						{
							name:'新闻资讯',
							url:'/index/newsList'
						},
					]
				},
				{
					name: '失信信息管理',
					icon: '${frontMenu.fontClass}',
					child:[
						{
							name:'失信信息',
							url:'/index/shixinxinxiList'
						},
					]
				},
			]
        }
    },
    getProjectName(){
        return {
            projectName: "企业信用信息管理系统"
        } 
    }
}
export default config
