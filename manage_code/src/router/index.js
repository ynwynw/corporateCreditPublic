	import {
		createRouter,
		createWebHashHistory
	} from 'vue-router'
	import qiye from '@/views/qiye/list'
	import news from '@/views/news/list'
	import qiyexinxi from '@/views/qiyexinxi/list'
	import shixinxinxi from '@/views/shixinxinxi/list'
	import storeup from '@/views/storeup/list'
	import config from '@/views/config/list'
	import users from '@/views/users/list'

export const routes = [{
		path: '/login',
		name: 'login',
		component: () => import('../views/login.vue')
	},{
		path: '/',
		name: '首页',
		component: () => import('../views/index'),
		children: [{
			path: '/',
			name: '首页',
			component: () => import('../views/HomeView.vue'),
			meta: {
				affix: true
			}
		}, {
			path: '/updatepassword',
			name: '修改密码',
			component: () => import('../views/updatepassword.vue')
		}
		
		,{
			path: '/qiye',
			name: '企业',
			component: qiye
		}
		,{
			path: '/news',
			name: '新闻资讯',
			component: news
		}
		,{
			path: '/qiyexinxi',
			name: '企业信息',
			component: qiyexinxi
		}
		,{
			path: '/shixinxinxi',
			name: '失信信息',
			component: shixinxinxi
		}
		,{
			path: '/storeup',
			name: '我的收藏',
			component: storeup
		}
		,{
			path: '/config',
			name: '轮播图',
			component: config
		}
		,{
			path: '/users',
			name: '管理员',
			component: users
		}
		]
	},
]

const router = createRouter({
	history: createWebHashHistory(process.env.BASE_URL),
	routes
})

export default router
