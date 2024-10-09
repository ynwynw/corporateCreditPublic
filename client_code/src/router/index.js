import { createRouter, createWebHashHistory } from 'vue-router'
import index from '../views'
import home from '../views/pages/home.vue'
import login from '../views/pages/login.vue'
import qiyeList from '@/views/pages/qiye/list'
import qiyeDetail from '@/views/pages/qiye/formModel'
import qiyeAdd from '@/views/pages/qiye/formAdd'
import qiyeRegister from '@/views/pages/qiye/register'
import qiyeCenter from '@/views/pages/qiye/center'
import qiyexinxiList from '@/views/pages/qiyexinxi/list'
import qiyexinxiDetail from '@/views/pages/qiyexinxi/formModel'
import qiyexinxiAdd from '@/views/pages/qiyexinxi/formAdd'
import shixinxinxiList from '@/views/pages/shixinxinxi/list'
import shixinxinxiDetail from '@/views/pages/shixinxinxi/formModel'
import shixinxinxiAdd from '@/views/pages/shixinxinxi/formAdd'
import newsList from '@/views/pages/news/list'
import storeupList from '@/views/pages/storeup/list'

const routes = [{
		path: '/',
		redirect: '/index/home'
	},
	{
		path: '/index',
		component: index,
		children: [{
			path: 'home',
			component: home
		}
		, {
			path: 'qiyeList',
			component: qiyeList
		}, {
			path: 'qiyeDetail',
			component: qiyeDetail
		}, {
			path: 'qiyeAdd',
			component: qiyeAdd
		}
		, {
			path: 'qiyeCenter',
			component: qiyeCenter
		}
		, {
			path: 'qiyexinxiList',
			component: qiyexinxiList
		}, {
			path: 'qiyexinxiDetail',
			component: qiyexinxiDetail
		}, {
			path: 'qiyexinxiAdd',
			component: qiyexinxiAdd
		}
		, {
			path: 'shixinxinxiList',
			component: shixinxinxiList
		}, {
			path: 'shixinxinxiDetail',
			component: shixinxinxiDetail
		}, {
			path: 'shixinxinxiAdd',
			component: shixinxinxiAdd
		}
		, {
			path: 'newsList',
			component: newsList
		}
		, {
			path: 'storeupList',
			component: storeupList
		}
		]
	},
	{
		path: '/login',
		component: login
	}
	,{
		path: '/qiyeRegister',
		component: qiyeRegister
	}
]

const router = createRouter({
  history: createWebHashHistory(process.env.BASE_URL),
  routes
})

export default router
