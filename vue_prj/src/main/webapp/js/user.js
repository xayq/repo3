var vue = new Vue({
    el: "#app",
    data: {
        user: {id:"",name:"",age:"",address:""},
        userList: []
    },
    methods: {
        findAll: function () {
            var _this = this;
            axios.get("/vue_prj/user/findAll.do").then(function (response) {
                _this.userList = response.data;
                console.log(_this.userList);
            }).catch(function (err) {
                console.log(err);
            });
        },
        findById: function (userid) {
            var _this = this;
            axios.get("/vue_prj/user/findById.do", {
                params: {
                    id: userid
                }
            }).then(function (response) {
              _this.user = response.data;
                $('#myModal').modal("show");
            }).catch(function (err) {
            });

        },
        update: function () {
            var _this = this;
            axios.post("/vue_prj/user/updateUser.do",_this.user).then(function (response) {
                _this.findAll();
            }).catch(function (err) {
            });
        }
    },
    //页面加载后就执行
    created:function(){
        this.findAll();
    }
});