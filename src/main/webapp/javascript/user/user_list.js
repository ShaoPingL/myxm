$(document).ready(function(){

    $.ajax({
        type: "post",
        url: path+"listUser",
        data: "",
        dataType: "json",
        success: function(data){
            debugger
            $("#userList").empty();   //清空里面的所有内容
            var html = '<table width="500px">';
            $.each(data, function(i, v){
                html += '<tr><td>'+v.name+'</td><td>'+v.age+'</td><td width="50px"><a onclick="del('+v.id+')">删除</a></td><td width="50px"><a onclick="update('+v.id+')">修改</a></td></tr>'
            });
            html+='</table>';
            $('#userList').html(html);
            $("tr:odd").css("background-color","#f7f7f7");

        },
        error: function (e) {
            alert("服务异常！");
        }

    });

})

function del(id){

}

function update(id){

}