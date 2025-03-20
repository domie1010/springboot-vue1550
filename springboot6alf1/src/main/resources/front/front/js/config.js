
var projectName = '酒店客房管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '客房信息',
	url: './pages/kefangxinxi/list.html'
}, 

{
	name: '酒店资讯',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/springboot6alf1/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["查看","删除"],"menu":"会员","menuJump":"列表","tableName":"huiyuan"}],"menu":"会员管理"},{"child":[{"buttons":["查看","删除"],"menu":"清洁人员","menuJump":"列表","tableName":"qingjierenyuan"}],"menu":"清洁人员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"客房信息","menuJump":"列表","tableName":"kefangxinxi"}],"menu":"客房信息管理"},{"child":[{"buttons":["查看","审核","删除"],"menu":"用户预约","menuJump":"列表","tableName":"yonghuyuyue"}],"menu":"用户预约管理"},{"child":[{"buttons":["查看","审核","删除"],"menu":"会员预约","menuJump":"列表","tableName":"huiyuanyuyue"}],"menu":"会员预约管理"},{"child":[{"buttons":["查看","审核","删除","支付"],"menu":"用户取消","menuJump":"列表","tableName":"yonghuquxiao"}],"menu":"用户取消管理"},{"child":[{"buttons":["查看","审核","删除","支付"],"menu":"会员取消","menuJump":"列表","tableName":"huiyuanquxiao"}],"menu":"会员取消管理"},{"child":[{"buttons":["新增","查看","修改","删除","用户退房"],"menu":"用户入住","menuJump":"列表","tableName":"yonghuruzhu"}],"menu":"用户入住管理"},{"child":[{"buttons":["新增","查看","修改","删除","会员退房"],"menu":"会员入住","menuJump":"列表","tableName":"huiyuanruzhu"}],"menu":"会员入住管理"},{"child":[{"buttons":["查看","删除","支付"],"menu":"用户退房","menuJump":"列表","tableName":"yonghutuifang"}],"menu":"用户退房管理"},{"child":[{"buttons":["查看","删除","支付"],"menu":"会员退房","menuJump":"列表","tableName":"huiyuantuifang"}],"menu":"会员退房管理"},{"child":[{"buttons":["查看","删除"],"menu":"清扫房间","menuJump":"列表","tableName":"qingsaofangjian"}],"menu":"清扫房间管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"酒店资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"在线客服","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","用户预约","会员预约"],"menu":"客房信息列表","menuJump":"列表","tableName":"kefangxinxi"}],"menu":"客房信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","支付","取消预约"],"menu":"用户预约","menuJump":"列表","tableName":"yonghuyuyue"}],"menu":"用户预约管理"},{"child":[{"buttons":["查看"],"menu":"用户取消","menuJump":"列表","tableName":"yonghuquxiao"}],"menu":"用户取消管理"},{"child":[{"buttons":["查看","支付"],"menu":"用户入住","menuJump":"列表","tableName":"yonghuruzhu"}],"menu":"用户入住管理"},{"child":[{"buttons":["查看"],"menu":"用户退房","menuJump":"列表","tableName":"yonghutuifang"}],"menu":"用户退房管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","用户预约","会员预约"],"menu":"客房信息列表","menuJump":"列表","tableName":"kefangxinxi"}],"menu":"客房信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看","支付","取消预约"],"menu":"会员预约","menuJump":"列表","tableName":"huiyuanyuyue"}],"menu":"会员预约管理"},{"child":[{"buttons":["查看"],"menu":"会员取消","menuJump":"列表","tableName":"huiyuanquxiao"}],"menu":"会员取消管理"},{"child":[{"buttons":["查看","支付"],"menu":"会员入住","menuJump":"列表","tableName":"huiyuanruzhu"}],"menu":"会员入住管理"},{"child":[{"buttons":["查看"],"menu":"会员退房","menuJump":"列表","tableName":"huiyuantuifang"}],"menu":"会员退房管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","用户预约","会员预约"],"menu":"客房信息列表","menuJump":"列表","tableName":"kefangxinxi"}],"menu":"客房信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"会员","tableName":"huiyuan"},{"backMenu":[{"child":[{"buttons":["查看","清扫房间"],"menu":"用户退房","menuJump":"列表","tableName":"yonghutuifang"}],"menu":"用户退房管理"},{"child":[{"buttons":["查看","清扫房间"],"menu":"会员退房","menuJump":"列表","tableName":"huiyuantuifang"}],"menu":"会员退房管理"},{"child":[{"buttons":["查看"],"menu":"清扫房间","menuJump":"列表","tableName":"qingsaofangjian"}],"menu":"清扫房间管理"}],"frontMenu":[{"child":[{"buttons":["查看","用户预约","会员预约"],"menu":"客房信息列表","menuJump":"列表","tableName":"kefangxinxi"}],"menu":"客房信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"清洁人员","tableName":"qingjierenyuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
