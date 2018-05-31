<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<! DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Translation//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Home</title>
</head>
<body>
<p id="demo">no content yet</p>
<button type="button" id="button_get" name="GET" onclick="doRequest('GET')">Get</button>
<button type="button" id="button_post" name="POST" onclick="doRequest('POST')">Post</button>
<button type="button" id="button_put" name="PUT" onclick="doRequest('PUT')">Put</button>
<button type="button" id="button_delete" name="DELETE" onclick="doRequest('DELETE')">Delete</button>
</body>

<script>
  function doRequest(request) {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
      if (this.readyState === 4 && this.status === 200) {
        document.getElementById("demo").innerHTML=this.responseText;
      }
    };
    xhttp.open(request, "/controller", true);
    xhttp.send();
  }
</script>
</html>