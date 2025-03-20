const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot6alf1/",
            name: "springboot6alf1",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot6alf1/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "酒店客房管理系统"
        } 
    }
}
export default base
