/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2018-08-24 09:44:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.egou;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=gbk");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html >\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GBK\" />\r\n");
      out.write("<title>云工厂网上书城 － 填写基本信息</title>\r\n");
      out.write("<link href=\"css/front/register.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"css/front/common.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"css/front/css.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/j.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/ajax.js\"></script>\r\n");
      out.write("\t\t<script language=\"javascript\" src=\"js/util.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/front/StringLength.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/front/base.js\"></script>\r\n");
      out.write("\t\t<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t\tvar msgs = {\r\n");
      out.write("\t\t\tuserNameMsg: '必填项，3-12字节，可以用中文',\r\n");
      out.write("\t\t\tpasswordMsg: '必填项，6-16个字符，推荐使用英文字母加数字或符号的组合密码',\r\n");
      out.write("\t\t\trepeatPasswordMsg: '必填项，请再次输入您设置的密码，并确保两次输入一致',\r\n");
      out.write("\t\t\temailMsg: '必填项，请填写有效的Email地址，以方便您找回用户名和密码',\r\n");
      out.write("\t\t\tcheckCodeMsg: '必填项，请输入图中看到的数字'\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t   function isIE(){if(document.all)return true;return false;}\r\n");
      out.write("\t   \r\n");
      out.write("\t   function onkey(form){\r\n");
      out.write("\t   \t\tvar evnt=arguments[1]||window.event;\r\n");
      out.write(" \t\t\tvar currentKey = evnt.charCode||evnt.keyCode;\r\n");
      out.write("\t\t  \tif (currentKey==13) { \r\n");
      out.write("\t\t  \t\tcheck(form);\r\n");
      out.write("\t\t  \t}\r\n");
      out.write("\t  \t}\r\n");
      out.write("\t   //是否字符键   \r\n");
      out.write("\t  function   ischarkey(evn,nkey)     \r\n");
      out.write("\t  {   \r\n");
      out.write("\t\t  if(!evn.altKey&&!evn.ctrlKey&&((nkey>=65&&nkey<=90)||     \r\n");
      out.write("\t\t\t  (nkey>=48&&nkey<=57)||(nkey>=96&&nkey<=105)||nkey==106||     \r\n");
      out.write("\t\t\t  nkey==107||nkey==109||nkey==110||nkey==111||nkey==32||     \r\n");
      out.write("\t\t\t  (nkey>=186&&nkey<=192)||(nkey>=219&&nkey<=222)))   \r\n");
      out.write("\t\t\t  return   true;     \r\n");
      out.write("\t\t\t  else     \r\n");
      out.write("\t\t\t  return   false;     \r\n");
      out.write("\t  }   \r\n");
      out.write("\t   \r\n");
      out.write("\t  \tvar flagPwd=true;\r\n");
      out.write("\t   function onkeyPwd(pwd){\r\n");
      out.write("\t    var evnt=arguments[1]||window.event;\r\n");
      out.write(" \t\tvar currentKey = evnt.charCode||evnt.keyCode;\r\n");
      out.write("\t    if(ischarkey(evnt,currentKey)){\r\n");
      out.write("\t    \tvar keyChar=String.fromCharCode(currentKey); \r\n");
      out.write("\t    \tif(/\\s/.test(keyChar)){\r\n");
      out.write("\t \t\t flagPwd=false;\r\n");
      out.write("\t \t\t }else if(pwd.value.length>=16){\r\n");
      out.write("\t \t\t flagPwd=false;\r\n");
      out.write("\t \t\t }else{\r\n");
      out.write("\t \t\t flagPwd=true;\r\n");
      out.write("\t \t\t }\r\n");
      out.write("\t\t\t if(!flagPwd&&!isIE()){\r\n");
      out.write("\t\t     evnt.preventDefault();\r\n");
      out.write("\t\t     }else if(!flagPwd){\r\n");
      out.write("\t\t     evnt.returnValue=false;\r\n");
      out.write("\t\t     }\r\n");
      out.write("\t    }else{\r\n");
      out.write("\t    //alert(currentKey);\r\n");
      out.write("\t    }\r\n");
      out.write("\t   }\r\n");
      out.write("\t   var flagCheck=true;\r\n");
      out.write("\t   function onkeyCheck(inputElement){//实现空白字符不能输入\r\n");
      out.write("\t \t\t var evnt=arguments[1]||window.event;\r\n");
      out.write("\t \t\t var currentKey = evnt.charCode||evnt.keyCode;\r\n");
      out.write("\t \t\t if(ischarkey(evnt,currentKey)){\r\n");
      out.write("\t    \t var keyChar=String.fromCharCode(currentKey); \r\n");
      out.write("\t    \t if(/\\s/.test(keyChar)){\r\n");
      out.write("\t \t\t flagCheck=false;\r\n");
      out.write("\t \t\t }else{\r\n");
      out.write("\t \t\t flagCheck=true;\r\n");
      out.write("\t \t\t }\r\n");
      out.write("\t\t\t if(!flagCheck&&!isIE()){\r\n");
      out.write("\t\t     evnt.preventDefault();\r\n");
      out.write("\t\t     }else if(!flagCheck){\r\n");
      out.write("\t\t     evnt.returnValue=false;\r\n");
      out.write("\t\t     }\r\n");
      out.write("\t\t    }else{\r\n");
      out.write("\t\t    //alert(currentKey);\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\tfunction setFocusStyle(v){\r\n");
      out.write("\t\t\t\tvar obj = document.getElementById(v);\r\n");
      out.write("\t\t\t\tobj.className = 'n_zc_blue';\r\n");
      out.write("\t\t\t\tobj.innerHTML = msgs[v];\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t \r\n");
      out.write("\t\t var strLen = new StringLength();\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction checkUserName(){\r\n");
      out.write("\t\t\tvar result=true;\r\n");
      out.write("\t\t\tvar userNameMsg = document.getElementById(\"userNameMsg\");\r\n");
      out.write("\t\t\tvar username = document.getElementById(\"username\").value;\r\n");
      out.write("\t\t\tif(''!=username){ \r\n");
      out.write("\t\t\t\tvar uLength = strLen.getRealLength(username);\r\n");
      out.write("\t\t\t\tif(uLength>=3 && uLength<13){\r\n");
      out.write("\t\t\t\t    var filter=/^\\s*[A-Za-z0-9\\u4e00-\\u9fa5_-]{3,12}\\s*$/; \r\n");
      out.write("\t\t\t\t    if (!filter.test(username))\r\n");
      out.write("\t\t\t\t    {\r\n");
      out.write("\t\t\t\t     userNameMsg.innerHTML=\"3-12个字符(包括字母、数字、中文、下划线、中划线)\";\r\n");
      out.write("\t\t\t\t\t userNameMsg.className = 'n_zc_red';\r\n");
      out.write("\t\t\t\t\t result=false;\r\n");
      out.write("\t\t\t\t    }\r\n");
      out.write("\t\t\t\t    else\r\n");
      out.write("\t\t\t\t    {\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tjQuery.ajax({\r\n");
      out.write("\t \t\t\t\t\t  type: \"POST\",\r\n");
      out.write("\t \t\t\t\t\t  url: \"checkUserName.do\",\r\n");
      out.write("\t \t\t\t\t      data: \"username=\"+username,\r\n");
      out.write("\t \t\t\t\t      success: function(data){\r\n");
      out.write("\t\t\t\t\t\tvar result = data;\r\n");
      out.write("\t\t\t\t        var userNameMsg = document.getElementById(\"userNameMsg\");\r\n");
      out.write("\t\t\t\t        if('true'==result){\r\n");
      out.write("\t\t\t\t        \tuserNameMsg.innerHTML=\"用户名可用\";\r\n");
      out.write("\t\t\t\t\t\t\tuserNameMsg.className = 'n_zc_green';\r\n");
      out.write("\t\t\t\t        }else{\r\n");
      out.write("\t\t\t\t\t\t\tuserNameMsg.innerHTML=\"用户名已经被占用了，请换一个\";\r\n");
      out.write("\t\t\t\t\t\t\tuserNameMsg.className = 'n_zc_red';\r\n");
      out.write("\t\t\t\t        }\r\n");
      out.write("\t \t\t\t\t\t\t\r\n");
      out.write("\t \t\t\t\t\t }\r\n");
      out.write("\t \t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tuserNameMsg.innerHTML=\"3-12个字符(包括字母、数字、中文、下划线、中划线)\";\r\n");
      out.write("\t\t\t\t\tuserNameMsg.className = 'n_zc_red';\r\n");
      out.write("\t\t\t\t\tresult=false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tuserNameMsg.innerHTML=\"3-12个字符(包括字母、数字、中文、下划线、中划线)\";\r\n");
      out.write("\t\t\t\tuserNameMsg.className = 'n_zc_red';\r\n");
      out.write("\t\t\t\tresult=false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn result;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction callback(req){\r\n");
      out.write("\t\t\treturn function (){\r\n");
      out.write("\t\t\t\tif (req.readyState == 4) {\r\n");
      out.write("\t\t\t\t\tif (req.status == 200) {\r\n");
      out.write("\t\t\t\t        var result = req.responseText;\r\n");
      out.write("\t\t\t\t        var userNameMsg = document.getElementById(\"userNameMsg\");\r\n");
      out.write("\t\t\t\t        if('true'==result){\r\n");
      out.write("\t\t\t\t        \tuserNameMsg.innerHTML=\"用户名可用\";\r\n");
      out.write("\t\t\t\t\t\t\tuserNameMsg.className = 'n_zc_green';\r\n");
      out.write("\t\t\t\t        }else{\r\n");
      out.write("\t\t\t\t\t\t\tuserNameMsg.innerHTML=\"用户名已经被占用了，请换一个\";\r\n");
      out.write("\t\t\t\t\t\t\tuserNameMsg.className = 'n_zc_red';\r\n");
      out.write("\t\t\t\t        }\r\n");
      out.write("\t\t\t\t        \r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t    //密码的校验(第一个)\r\n");
      out.write("    function checkPassword(){\r\n");
      out.write("    \tvar result = true;\r\n");
      out.write("    \tvar password = document.getElementById(\"password\");\r\n");
      out.write("    \tvar passwordMsg = document.getElementById(\"passwordMsg\");\r\n");
      out.write("    \t//第一步，password应满足不包含空白字符\r\n");
      out.write("    \tif(password.value.search(/\\s/g) != -1){\r\n");
      out.write("    \t\tpasswordMsg.innerHTML = \"密码只能使用英文字母、数字和符号\";\r\n");
      out.write("    \t\tpasswordMsg.className = 'n_zc_red';\r\n");
      out.write("    \t\tresult = false;\r\n");
      out.write("    \t}else{\r\n");
      out.write("\t\t\t//第二步，password应满足\"长度在6至16位之间\"\r\n");
      out.write("\t    \tif(password.value.length < 6){\r\n");
      out.write("\t    \t\tpasswordMsg.innerHTML = \"您的密码太短，密码至少为6个字符\";\r\n");
      out.write("\t    \t\tpasswordMsg.className = 'n_zc_red';\r\n");
      out.write("\t    \t\tresult = false;\r\n");
      out.write("\t    \t}else if(password.value.length > 16){\r\n");
      out.write("\t    \t\tpasswordMsg.innerHTML = \"密码最多为16个字符\";\r\n");
      out.write("\t    \t\tpasswordMsg.className = 'n_zc_red';\r\n");
      out.write("\t    \t\tresult = false;\r\n");
      out.write("\t    \t}else{\r\n");
      out.write("\t    \t\t//如果以上两步合规则，那么password的输入是合法的.\r\n");
      out.write("\t    \t\tpasswordMsg.innerHTML = \"密码填写正确\";\r\n");
      out.write("\t    \t\tpasswordMsg.className = 'n_zc_green';\r\n");
      out.write("\t    \t\t//最后一步，检查确认密码是否与密码一致\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    }\r\n");
      out.write("    \treturn result;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write(" //密码的校验\r\n");
      out.write("    function checkRePassword(){\r\n");
      out.write("    \tvar result = true;\r\n");
      out.write("    \tvar password = document.getElementById(\"password\");\r\n");
      out.write("    \tvar repassword = document.getElementById(\"repeatPassword\");\r\n");
      out.write("    \tvar repasswordMsg = document.getElementById(\"repeatPasswordMsg\");\r\n");
      out.write("   \t\tif(password.value != repassword.value || repassword.value==\"\"){\r\n");
      out.write("    \t\trepasswordMsg.innerHTML = \"两次输入的密码不一致，请重新输入\";\r\n");
      out.write("    \t\trepasswordMsg.className = 'n_zc_red';\r\n");
      out.write("    \t\tresult = false;\r\n");
      out.write("    \t}else{\r\n");
      out.write("    \t\trepasswordMsg.innerHTML = \"填写正确\";\r\n");
      out.write("    \t\trepasswordMsg.className = 'n_zc_green';\r\n");
      out.write("    \t}\r\n");
      out.write("    \treturn result;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("\t   function isEmail(s)   \r\n");
      out.write("\t\t\t\t{   \r\n");
      out.write("\t\t\t\tvar emailRegS=/^([a-zA-Z0-9_\\-\\.\\+]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$/;\r\n");
      out.write("\t\t\t\t//var emailRegM=/^((([a-zA-Z0-9_\\-\\.\\+]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)([;]))+)(([a-zA-Z0-9_\\-\\.\\+]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?))$/;  \r\n");
      out.write("\t\t\t\tif (!emailRegS.exec(s)){\r\n");
      out.write("\t\t\t\t\t return false ;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\treturn true  ;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\tfunction checkEmail(){\r\n");
      out.write("\t\t\tvar result = true;\r\n");
      out.write("\t\t\tvar email = document.register.email.value;\r\n");
      out.write("\t\t\tvar emailMsg = document.getElementById(\"emailMsg\");\r\n");
      out.write("\t\t\tif(''!=email){ \r\n");
      out.write("\t\t\t\tif(isEmail(email)){\r\n");
      out.write("\t\t\t\t\tvar req = getHttpRequest();\r\n");
      out.write("\t\t\t\t\tif(req){\r\n");
      out.write("\t\t\t\t\t\treq.onreadystatechange = callbackEmail(req);\r\n");
      out.write("\t\t\t\t\t\tvar url = 'checkEmail.do?email='+email\r\n");
      out.write("\t\t\t\t\t\treq.open(\"POST\",url,true );\r\n");
      out.write("\t\t \t\t\t\treq.send(null);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\temailMsg.innerHTML = \"Email格式不正确， 请输入正确的Email地址，如：myname@163.com\";\r\n");
      out.write("    \t\t\t\temailMsg.className = 'n_zc_red';\r\n");
      out.write("\t\t\t\t\tresult=false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\temailMsg.innerHTML = \"Email格式不正确， 请输入正确的Email地址，如：myname@163.com\";\r\n");
      out.write("    \t\t\temailMsg.className = 'n_zc_red';\r\n");
      out.write("    \t\t\tresult=false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn result;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction callbackEmail(req){\r\n");
      out.write("\t\t\treturn function (){\r\n");
      out.write("\t\t\t\tif (req.readyState == 4) {\r\n");
      out.write("\t\t\t\t\tif (req.status == 200) {\r\n");
      out.write("\t\t\t\t        var result = req.responseText;\r\n");
      out.write("\t\t\t\t        var emailMsg = document.getElementById(\"emailMsg\");\r\n");
      out.write("\t\t\t\t        if('true'==result){\r\n");
      out.write("\t\t\t\t        \temailMsg.innerHTML = \"填写正确\";\r\n");
      out.write("    \t\t\t\t\t\temailMsg.className = 'n_zc_green';\r\n");
      out.write("\t\t\t\t        \t\r\n");
      out.write("\t\t\t\t        }else{\r\n");
      out.write("\t\t\t\t        emailMsg.innerHTML = \"该Email地址已被注册，请换一个\";\r\n");
      out.write("    \t\t\t\t\temailMsg.className = 'n_zc_red';\r\n");
      out.write("\t\t\t\t        }\r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t//校验验证码\r\n");
      out.write("\tfunction validateCode(){\r\n");
      out.write("\t\tvar result = true;\r\n");
      out.write("\t\tvar checkCode = document.getElementById(\"randNum\");\r\n");
      out.write("\t\tvar checkCodeMsg = document.getElementById(\"checkCodeMsg\");\r\n");
      out.write("\t\tif(checkCode.value == \"\"){\r\n");
      out.write("\t\t\tcheckCodeMsg.innerHTML = \"您输入的验证码错误，请重新输入\";\r\n");
      out.write("\t\t\tcheckCodeMsg.className = 'n_zc_red';\r\n");
      out.write("\t\t\tresult = false;\r\n");
      out.write("\t\t}else if(checkCode.value.length != 4){\r\n");
      out.write("\t\t\tcheckCodeMsg.innerHTML = \"验证码为4位，请重新输入\";\r\n");
      out.write("\t\t\tcheckCodeMsg.className = 'n_zc_red';\r\n");
      out.write("\t\t\tresult = false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{//验证码格式正确\r\n");
      out.write("    \t\tcheckCodeMsg.className = '';\r\n");
      out.write("    \t\tcheckCodeMsg.innerHTML = \"\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn result;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction refreshCode(){\r\n");
      out.write("\t\t\tvar img = document.getElementById(\"img\");\r\n");
      out.write("\t\t\tif(img){\r\n");
      out.write("\t\t\t\tnowDate = new Date();\r\n");
      out.write("\t\t\t\timg.src = \"/validataImage.do?d=\"+nowDate.getTime();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//提交\r\n");
      out.write("\tfunction check(form){\r\n");
      out.write("\t\tif(!form.checked.checked){\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\tif(checkAll()){\r\n");
      out.write("\t\t\tdisableAll();\r\n");
      out.write("\t\t\tform.action = '/memberRegister.do';\r\n");
      out.write("\t\t\tform.submit();\r\n");
      out.write("\t\t} \r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    //校验全部字段\r\n");
      out.write("    function checkAll(){\r\n");
      out.write("    \tvar result = true;\r\n");
      out.write("    \tif(!checkUserName())\r\n");
      out.write("    \t\tresult = false;\r\n");
      out.write("   \t\tif(!checkPassword())\r\n");
      out.write("    \t\tresult = false;\r\n");
      out.write("    \tif(!checkRePassword())\r\n");
      out.write("    \t\tresult = false;\r\n");
      out.write("    \tif(!checkEmail())\r\n");
      out.write("    \t\tresult = false;\r\n");
      out.write("    \tif(!validateCode())\r\n");
      out.write("\t    \tresult = false;\t\r\n");
      out.write("    \treturn result;\r\n");
      out.write("    }\r\n");
      out.write("    function changeStatus(){\r\n");
      out.write("    \r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"changeStatus();\">\r\n");
      out.write("\t<div class=\"full\">\r\n");
      out.write("\t  \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("  var _gaq = _gaq || [];\r\n");
      out.write("  _gaq.push(['_setAccount', 'UA-12246903-1']);\r\n");
      out.write("  _gaq.push(['_setDomainName', '.egou.com']);\r\n");
      out.write("  _gaq.push(['_trackPageview']);\r\n");
      out.write("\r\n");
      out.write("  _gaq.push(['_setAccount', 'UA-1267821-1']);\r\n");
      out.write("  _gaq.push(['_trackPageview']);\r\n");
      out.write("\r\n");
      out.write("  (function() {\r\n");
      out.write("    var ga = document.createElement('script'); ga.type ='text/javascript'; ga.async = true;\r\n");
      out.write("    ga.src = ('https:' == document.location.protocol ? 'https://ssl' :'http://www') + '.google-analytics.com/ga.js';\r\n");
      out.write("    var s = document.getElementsByTagName('script')[0];\r\n");
      out.write("\ts.parentNode.insertBefore(ga, s);\r\n");
      out.write("  })();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div class=\"t_Top\">\r\n");
      out.write("\t  \t<div class=\"n_dl_logo\"><img src=\"images/front/logo.png\" border=\"0\" /></div>\r\n");
      out.write("\t\t<div class=\"n_dl_t\"><span class=\"color_4\">云工厂--更多精彩欢迎您</span></div>\r\n");
      out.write("\t\t<div class=\"n_dl_r\"><a href=\"/login.do\" class=\"color_56\">登录</a> <span class=\"color_55\">|</span> 易购新手 <span class=\"color_55\">|</span> 网站帮助</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"n_dl_l\"></div>\r\n");
      out.write("\t\t<div class=\"n_dl_l_1\"></div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t  <div class=\"n_dl_c\">\r\n");
      out.write("\t  \t<div class=\"n_dl_yz\"><img src=\"images/front/regis_t.gif\" /></div>\r\n");
      out.write("\t\t<!-- <ul class=\"n_zc_yz_1\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"n_zc_yz_1_a\">1.填写基本信息</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"n_zc_yz_1_b\">2.手机验证领取优惠券 (可选)</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"n_zc_yz_1_b\">3.注册成功</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul> \r\n");
      out.write("\t   -->\r\n");
      out.write("\t\t<div style=\"clear:both\"></div>\r\n");
      out.write("\t\t<div class=\"n_zc\">\r\n");
      out.write("\t\t<form method=\"post\" id=\"register\" action=\"");
      out.print(request.getContextPath());
      out.write("/CustomerRegister\" name=\"register\" onkeydown=\"onkey(this,event);\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<input name=\"vid\" type=\"hidden\" value=\"\" />\r\n");
      out.write("\t\t\t\t<input name=\"cid\" type=\"hidden\" value=\"\" />\r\n");
      out.write("\t\t\t\t<input name=\"wid\" type=\"hidden\" value=\"\" />\r\n");
      out.write("\t\t\t\t<input name=\"vwid\" type=\"hidden\" value=\"\" />\r\n");
      out.write("\t\t\t\t<input name=\"fbt\" type=\"hidden\" value=\"\" />\r\n");
      out.write("\t\t  <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t  \r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"89\" height=\"40\" align=\"right\">用户名：</td>\r\n");
      out.write("\r\n");
      out.write("              <td height=\"40\" colspan=\"3\"><input type=\"text\" id=\"username\" name=\"username\" class=\"input_35\" value=\"\" onblur=\"checkUserName()\" onfocus=\"setFocusStyle('userNameMsg');\" \r\n");
      out.write("               tabindex=\"1\" onkeydown=\"onkeyCheck(this,event);\"\r\n");
      out.write("               onbeforepaste=\"clipboardData.setData('text',clipboardData.getData('text').replace(/[^\\d]/g,''))\"   autocomplete=off   ondragenter=\"javascript:return false;\"   onpaste=\"return false\" />\r\n");
      out.write("              </td>\r\n");
      out.write("              <td width=\"19\" height=\"40\" align=\"center\" class=\"color_1\">*</td>\r\n");
      out.write("              <td width=\"465\" height=\"40\"><span class=\"color_4\" id=\"userNameMsg\">3-12个字符(包括字母、数字、中文、下划线、中划线)</span>\r\n");
      out.write("              <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("              var msg='';\r\n");
      out.write("              if(\"\"!=msg){\r\n");
      out.write("              document.getElementById(\"userNameMsg\").innerHTML=msg;\r\n");
      out.write("              }\r\n");
      out.write("              </script>\r\n");
      out.write("              </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"40\" align=\"right\">密码：</td>\r\n");
      out.write("              <td height=\"40\" colspan=\"3\"><input type=\"password\" name=\"password\" id=\"password\" onfocus=\"setFocusStyle('passwordMsg')\" onblur=\"checkPassword()\" class=\"input_35\" \r\n");
      out.write("              tabindex=\"2\"   onkeydown=\"onkeyPwd(this,event);\"\r\n");
      out.write("              onbeforepaste=\"clipboardData.setData('text',clipboardData.getData('text').replace(/[^\\d]/g,''))\"   autocomplete=off   ondragenter=\"javascript:return false;\"   onpaste=\"return false\" />\r\n");
      out.write("              </td>\r\n");
      out.write("              <td height=\"40\" align=\"center\" class=\"color_1\">*</td>\r\n");
      out.write("              <td height=\"40\"><span class=\"color_4\" id=\"passwordMsg\" >6-16个字符，推荐使用英文字母加数字或符号的组合密码</span>\r\n");
      out.write("              <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("              msg='';\r\n");
      out.write("              if(\"\"!=msg){\r\n");
      out.write("              document.getElementById(\"passwordMsg\").innerHTML=msg;\r\n");
      out.write("              }\r\n");
      out.write("              </script>\r\n");
      out.write("\r\n");
      out.write("              </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"40\" align=\"right\">确认密码：</td>\r\n");
      out.write("              <td height=\"40\" colspan=\"3\"><input type=\"password\" name=\"repeatPassword\" id=\"repeatPassword\" onfocus=\"setFocusStyle('repeatPasswordMsg')\" onblur=\"checkRePassword()\"  class=\"input_35\" \r\n");
      out.write("              tabindex=\"3\" onkeydown=\"onkeyPwd(this,event);\"\r\n");
      out.write("              onbeforepaste=\"clipboardData.setData('text',clipboardData.getData('text').replace(/[^\\d]/g,''))\"   autocomplete=off   ondragenter=\"javascript:return false;\"   onpaste=\"return false\" />\r\n");
      out.write("              </td>\r\n");
      out.write("              <td height=\"40\" align=\"center\"><span class=\"color_1\">*</span></td>\r\n");
      out.write("              <td height=\"40\"><span class=\"color_4\" id=\"repeatPasswordMsg\">请再次输入您设置的密码，并确保两次输入一致</span>\r\n");
      out.write("\r\n");
      out.write("              <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("              msg='';\r\n");
      out.write("              if(\"\"!=msg){\r\n");
      out.write("              document.getElementById(\"repeatPasswordMsg\").innerHTML=msg;\r\n");
      out.write("              }\r\n");
      out.write("              </script>\r\n");
      out.write("              </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("             \r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"40\" align=\"right\">Email地址：</td>\r\n");
      out.write("              <td height=\"40\" colspan=\"3\"><input type=\"text\" name=\"email\" id=\"email\" value=\"\" onfocus=\"setFocusStyle('emailMsg')\" onblur=\"checkEmail()\"  class=\"input_35\" \r\n");
      out.write("              tabindex=\"4\" onkeydown=\"onkeyCheck(this,event);\"\r\n");
      out.write("              />\r\n");
      out.write("              </td>\r\n");
      out.write("              <td height=\"40\" align=\"center\"><span class=\"color_1\">*</span></td>\r\n");
      out.write("\r\n");
      out.write("              <td height=\"40\"><span class=\"color_4\" id=\"emailMsg\">请填写有效的Email地址，以方便您找回用户名和密码</span>\r\n");
      out.write("              <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("              msg='';\r\n");
      out.write("              if(\"\"!=msg){\r\n");
      out.write("              document.getElementById(\"emailMsg\").innerHTML=msg;\r\n");
      out.write("              }\r\n");
      out.write("              </script>\r\n");
      out.write("              </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            ");
      out.write("<tr>");
      out.write("<input type=\"hidden\" name=\"_finish\" /> \t\r\n");
      out.write("              <td height=\"80\" colspan=\"6\" align=\"center\"><input type=\"submit\" id=\"submitBtn\" name=\"新用户注册\" /></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"50\" colspan=\"6\" align=\"center\"><input type=\"checkbox\" name=\"checked\" value=\"checkbox\" checked=\"checked\" id=\"checked\" tabindex=\"6\" />\r\n");
      out.write("              我已经阅读并同意 <a href=\"/html/user_protocol.jsp\" target=\"_blank\" class=\"color_59\">个人会员注册服务协议条款</a> </td>\r\n");
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("          </form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t  \r\n");
      out.write("\t\t<div class=\"Bottom\">\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("<div class=\"Bottom\">\r\n");
      out.write("\t\t<div class=\"Bottom_1\" style=\"margin-top:5px\"></div>\r\n");
      out.write("\t\t<div class=\"Bottom_2\">\r\n");
      out.write("\r\n");
      out.write("\t\t  <table width=\"950\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t  <td colspan=\"3\" align=\"center\"><a href=\"help/aboutegou.html\" target=\"_blank\" class=\"color\">关于易购</a> | <a href=\"/help/mediumreported.html\" target=\"_blank\" class=\"color\">媒体报道</a> | <a href=\"help/loveletter.html\"  class=\"color_1\">易购情书</a> | <a href=\"/help/advertisement.html\" target=\"_blank\" class=\"color\">广告合作</a> | <a href=\"http://bbs.egou.com/thread.php?fid=16\" target=\"_blank\" class=\"color\">建议疑问</a> | <a href=\"/help/\" target=\"_blank\" class=\"color\">网站帮助</a> | <a href=\"/help/sitemap.html\" target=\"_blank\" class=\"color\">网站地图</a> | <a href=\"/help/links.html\" target=\"_blank\" class=\"color\">友情链接</a> |\r\n");
      out.write("\t   <a href=\"/help/contactus.html\" target=\"_blank\" class=\"color\">联系我们</a></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t  <td width=\"250\"></td>\r\n");
      out.write("\t\t\t  <td width=\"389\" align=\"center\"><span style=\"color:#666666\">Copyright &copy; 2004-2010 by   www.egou.com all rights reserved<br />\r\n");
      out.write("\t\t\t\t<a href=\"http://www.emar.com.cn\" target=\"_blank\" class=\"color_2\">亿玛在线</a> 旗下网站<a href=\"http://www.miibeian.gov.cn/\" target=\"_blank\" class=\"color_2\">京ICP证080025号</a> </span></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t  <td width=\"309\" height=\"60\" align=\"left\" valign=\"middle\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t  </table>\r\n");
      out.write(" \t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t\tvar eid=getUrlValue('eid');\r\n");
      out.write("\t\tvar yid=getUrlValue('yid');\r\n");
      out.write("\t\tvar keyword=getUrlValue('keyword');\r\n");
      out.write("\t\tvar cookieName='';\r\n");
      out.write("\t\tvar cookieValue='';\r\n");
      out.write("\t\tif(keyword!=''){\r\n");
      out.write("\t\t\tif(eid!=''){\r\n");
      out.write("\t\t\t\tcookieName='EqifaKeyword';\r\n");
      out.write("\t\t\t\tcookieValue='_eid_'+eid+'_'+keyword;\r\n");
      out.write("\t\t\t\tcookieCallback(cookieValue);\t\r\n");
      out.write("\t\t\t\t//encoder.encoder(cookieValue,cookieCallback);\r\n");
      out.write("\t\t\t}else if(yid!=''){\r\n");
      out.write("\t\t\t\tcookieName='YiqifaKeyword';\r\n");
      out.write("\t\t\t\tcookieValue='_yid_'+yid+'_'+keyword;\r\n");
      out.write("\t\t\t\tcookieCallback(cookieValue);\r\n");
      out.write("\t\t\t\t//encoder.encoder(cookieValue,cookieCallback);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction cookieCallback(msg){\r\n");
      out.write("\t\t\tcookieValue=msg;\r\n");
      out.write("\t\t\tvar name=cookieName;\r\n");
      out.write("\t\t\tvar value=cookieValue;\r\n");
      out.write("\t\t\tvar expires=1;\r\n");
      out.write("\t\t\tvar path=\"/\";\r\n");
      out.write("\t\t\tvar domain=\".egou.com\";\r\n");
      out.write("\t\t\tvar secure=\"\";\r\n");
      out.write("\t\t\tvar today = new Date();    \r\n");
      out.write("\t\t  \ttoday.setTime( today.getTime() );    \r\n");
      out.write("\t\t   \tif (expires) {     \r\n");
      out.write("\t\t       expires = expires * 1000 * 60 * 30;     \r\n");
      out.write("\t\t   \t}\r\n");
      out.write("\t\t    var expires_date = new Date( today.getTime() + (expires));   \r\n");
      out.write("\t\t    document.cookie = name+'='+(value)+((expires) ? ';expires='+expires_date.toGMTString() : '')+((path) ? ';path=' + path : '') +((domain) ? ';domain=' + domain : '')+((secure) ? ';secure' : ''); \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction getUrlValue(qs){\r\n");
      out.write("\t        var s = location.href;\r\n");
      out.write("\t        s = s.replace(\"?\",\"?&\").split(\"&\");\r\n");
      out.write("\t        var re = \"\";\r\n");
      out.write("\t        for(i=0;i<s.length;i++){\r\n");
      out.write("\t           if(s[i].indexOf(qs+\"=\")==0){\r\n");
      out.write("\t             re = s[i].replace(qs+\"=\",\"\");\r\n");
      out.write("\t             break;\r\n");
      out.write("\t            }\r\n");
      out.write("\t        }\r\n");
      out.write("\t        return re;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t \r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 用于sem监控 -->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("  var _gaq = _gaq || [];\r\n");
      out.write("  _gaq.push(['_setAccount', 'UA-12246903-1']);\r\n");
      out.write("  _gaq.push(['_setDomainName', '.egou.com']);\r\n");
      out.write("  _gaq.push(['_trackPageview']);\r\n");
      out.write("\r\n");
      out.write("  _gaq.push(['_setAccount', 'UA-1267821-1']);\r\n");
      out.write("  _gaq.push(['_trackPageview']);\r\n");
      out.write("\r\n");
      out.write("  (function() {\r\n");
      out.write("    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\r\n");
      out.write("    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\r\n");
      out.write("    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\r\n");
      out.write("  })();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("var _bdhmProtocol = ((\"https:\" == document.location.protocol) ? \" https://\" : \" http://\");\r\n");
      out.write("document.write(unescape(\"%3Cscript src='\" + _bdhmProtocol + \"hm.baidu.com/h.js%3F977ed62600436aca38f88304752ba8c4' type='text/javascript'%3E%3C/script%3E\"));\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
