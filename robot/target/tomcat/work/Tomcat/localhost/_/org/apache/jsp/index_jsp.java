/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-20 15:48:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html >\n");
      out.write("<!--\n");
      out.write("　　 へ　　　　　／|\n");
      out.write("　　/＼7　　∠＿/\n");
      out.write("　 /　│　　 ／　／\n");
      out.write("　│　Z ＿,＜　／　　 /`ヽ\n");
      out.write("　│　　　　　ヽ　　 /　　〉\n");
      out.write("　 Y　　　　　`　 /　　/\n");
      out.write("　ｲ●　､　●　　⊂⊃〈　　/\n");
      out.write("　()　 へ　　　　|　＼〈\n");
      out.write("　　>ｰ ､_　 ィ　 │ ／／\n");
      out.write("　 / へ　　 /　ﾉ＜| ＼＼\n");
      out.write("　 ヽ_ﾉ　　(_／　 │／／\n");
      out.write("　　7　　　　　　　|／\n");
      out.write("　　＞―r￣￣`ｰ―＿\n");
      out.write("翠刚家的皮卡丘,对偷看者使用十万伏特\n");
      out.write("-->\n");
      out.write("<head>\n");
      out.write("  <title>人工智能机器人mini</title>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("  <meta name=\"Keywords\" content=\"人工智能机器人mini\" />\n");
      out.write("  <meta name=\"Description\" content=\"人工智能机聊天mini机器人为你分担烦恼\" />\n");
      out.write("  <link rel=\"Shortcut Icon\" href=\"imgs/samllworldlogo.png\" type=\"image/x-icon\">\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("\n");
      out.write("    body {background: #060e1b;}\n");
      out.write("    canvas {opacity: 0.5;position:absolute;top:0;left:0;}\n");
      out.write("\n");
      out.write("    /*<!-- 通配符\"*\"表示匹配所有 -->*/\n");
      out.write("    *{margin:0;padding:0;}\n");
      out.write("    /*<!-- 设置背景图片 -->*/\n");
      out.write("    /*body{background: url(imgs/timg.png)no-repeat;}*/\n");
      out.write("\n");
      out.write("\n");
      out.write("    /*<!-- 设置中央区域属性 -->*/\n");
      out.write("    #content{width:800px;height:600px;background:rgba(255,255,255,.5);margin:0px auto 0;position: relative;}\n");
      out.write("\n");
      out.write("    /*<!-- 设置中央头部区域属性 -->*/\n");
      out.write("    #content .c_head{width:100%;height:60px;background:#4caf50;position: relative;}\n");
      out.write("    #content .c_head img{margin-left:10px;float:left;position: relative;}\n");
      out.write("    #content .c_head span{line-height:60px;display: block;height:60px;left;color:#fff;font-size:18px;cursor:pointer;position: relative;}\n");
      out.write("\n");
      out.write("    /*<!-- 设置中央中心区域属性 -->*/\n");
      out.write("    #content .c_center{width:100%;height:440px;overflow:auto ; position: relative;background: url(imgs/timg.png)no-repeat;}\n");
      out.write("\n");
      out.write("    /*<!-- 设置中央中心计算机会话框区域属性 -->*/\n");
      out.write("    #content .c_center .rWord{width:100%;margin-top:20px;overflow:hidden;position: relative; position: relative;}\n");
      out.write("    #content .c_center .rWord span{display: block;width:30px;height:40px;background: url(imgs/touxiang.png);margin:0 10px;float:left;position: relative;}\n");
      out.write("    #content .c_center .rWord p{float:left;background:rgba(0,0,255,.5);padding:10px;color:black;border-radius:10px;max-width:240px;position: relative;}\n");
      out.write("\n");
      out.write("    /*<!-- 设置中央中心我的会话框区域属性 -->*/\n");
      out.write("    #content .c_center .mWord{width:100%;overflow:hidden;margin-top:20px;position: relative;}\n");
      out.write("    #content .c_center .mWord span{display: block;width:40px;height:40px;background: url(imgs/wtouxiang.png);margin:0 10px;float:right;position: relative;}\n");
      out.write("    #content .c_center .mWord p{float:right;background:#19b955;padding:10px;color:#333;border-radius:10px;max-width:240px;position: relative;}\n");
      out.write("\n");
      out.write("    /*<!-- 设置中央底部区域属性 -->*/\n");
      out.write("    #content .c_footer{width:100%;height:60px;position: relative;}\n");
      out.write("\n");
      out.write("    /*<!-- 设置底部输入框区域属性 -->*/\n");
      out.write("    #input{width:620px;height:60px;background:rgba(0,0,0,.1);outline:none;border:none;margin:20px;margin-top:10px;border-radius:10px;text-indent:20px;font-size:16px;position: relative;}\n");
      out.write("\n");
      out.write("    /*<!-- 设置底部按钮区域属性 -->*/\n");
      out.write("    #btn{width:100px;height:60px;background:rgba(0,0,0,.5);float:right;text-align:center;line-height:60px;margin: 20px;margin-top:10px;color:#fff;border-radius:12px;cursor:pointer;position: relative;}\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<canvas id=\"canvas\" width=\"800px\" height=\"600px\"></canvas>\n");
      out.write("<!-- 不能以数字以及特殊符号要见名之意-->\n");
      out.write("<!-- 头部文字-->\n");
      out.write("\n");
      out.write("<!-- 中央头部文字及LOGO图片-->\n");
      out.write("<div id=\"content\">\n");
      out.write("  <div class=\"c_head\">\n");
      out.write("    <img src=\"imgs/timglogo.png\" alt=\"logo\" width=\"40\" height=\"60\"/>\n");
      out.write("    <span>人工智能 聊天MINI机器人</span>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- 中央头机器人会话框-->\n");
      out.write("  <div class=\"c_center\">\n");
      out.write("    <div class=\"rWord\">\n");
      out.write("      <span></span>\n");
      out.write("      <p>你好呀!我是mini，我可是个聪明的宝宝，跟我聊聊天吧！^_^</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- 输入框及按钮-->\n");
      out.write("  <div class=\"c_footer\">\n");
      out.write("    <input id=\"input\" type=\"text\"/>\n");
      out.write("    <div id=\"btn\">发送</div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" >\n");
      out.write("    $(function(){\n");
      out.write("      $(\"#btn\").click(function(){\n");
      out.write("        var message=$(\"#input\").val();\n");
      out.write("        $(\".c_center\").append('<div class=\"mWord\"><span></span><p>'+message+'</p></div>');\n");
      out.write("        $.ajax({\n");
      out.write("          type:\"post\",\n");
      out.write("          url:\"http://localhost:8080/robot\",\n");
      out.write("          data:{\"message\":message},\n");
      out.write("          success:function(data){\n");
      out.write("            data=$.parseJSON(data);\n");
      out.write("            var text=data.text;\n");
      out.write("\n");
      out.write("            $(\".c_center\").append('<div class=\"rWord\"><span></span><p>'+text+'</p></div>');\n");
      out.write("            $(\".c_center\").scrollTop(1000000000);\n");
      out.write("            $(\"#input\").val(\"\");\n");
      out.write("            $(\"#input\").focus();\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $(document).keydown(function(event){\n");
      out.write("      if(event.keyCode==13){\n");
      out.write("        var message=$(\"#input\").val();\n");
      out.write("        $(\".c_center\").append('<div class=\"mWord\"><span></span><p>'+message+'</p></div>');\n");
      out.write("        $.ajax({\n");
      out.write("          type:\"post\",\n");
      out.write("          url:\"http://localhost:8080/robot\",\n");
      out.write("          data:{\"message\":message},\n");
      out.write("          success:function(data){\n");
      out.write("            data=$.parseJSON(data);\n");
      out.write("            var text=data.text;\n");
      out.write("            $(\".c_center\").append('<div class=\"rWord\"><span></span><p>'+text+'</p></div>');\n");
      out.write("            $(\".c_center\").scrollTop(1000000000);\n");
      out.write("            $(\"#input\").val(\"\");\n");
      out.write("            $(\"#input\").focus();\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    function fn() {\n");
      out.write("      window.requestAnimFrame = (function () {\n");
      out.write("        return window.requestAnimationFrame || window.webkitRequestAnimationFrame || window.mozRequestAnimationFrame || function (callback) {\n");
      out.write("          window.setTimeout(callback, 1000 / 60);\n");
      out.write("        }\n");
      out.write("      })();\n");
      out.write("      var canvas = document.getElementById('canvas'), ctx = canvas.getContext('2d'), w = canvas.width = window.innerWidth, h = canvas.height = window.innerHeight, hue = 217, stars = [], count = 0, maxStars = 1200;\n");
      out.write("      var canvas2 = document.createElement('canvas'), ctx2 = canvas2.getContext('2d');\n");
      out.write("      canvas2.width = 100;\n");
      out.write("      canvas2.height = 100;\n");
      out.write("      var half = canvas2.width / 2, gradient2 = ctx2.createRadialGradient(half, half, 0, half, half, half);\n");
      out.write("      gradient2.addColorStop(0.025, '#fff');\n");
      out.write("      gradient2.addColorStop(0.1, 'hsl(' + hue + ', 61%, 33%)');\n");
      out.write("      gradient2.addColorStop(0.25, 'hsl(' + hue + ', 64%, 6%)');\n");
      out.write("      gradient2.addColorStop(1, 'transparent');\n");
      out.write("      ctx2.fillStyle = gradient2;\n");
      out.write("      ctx2.beginPath();\n");
      out.write("      ctx2.arc(half, half, half, 0, Math.PI * 2);\n");
      out.write("      ctx2.fill();\n");
      out.write("      function random(min, max) {\n");
      out.write("        if (arguments.length < 2) {\n");
      out.write("          max = min;\n");
      out.write("          min = 0\n");
      out.write("        }\n");
      out.write("        if (min > max) {\n");
      out.write("          var hold = max;\n");
      out.write("          max = min;\n");
      out.write("          min = hold\n");
      out.write("        }\n");
      out.write("        return Math.floor(Math.random() * (max - min + 1)) + min\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function maxOrbit(x, y) {\n");
      out.write("        var max = Math.max(x, y), diameter = Math.round(Math.sqrt(max * max + max * max));\n");
      out.write("        return diameter / 2\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      var Star = function () {\n");
      out.write("        this.orbitRadius = random(maxOrbit(w, h));\n");
      out.write("        this.radius = random(60, this.orbitRadius) / 12;\n");
      out.write("        this.orbitX = w / 2;\n");
      out.write("        this.orbitY = h / 2;\n");
      out.write("        this.timePassed = random(0, maxStars);\n");
      out.write("        this.speed = random(this.orbitRadius) / 900000;\n");
      out.write("        this.alpha = random(2, 10) / 10;\n");
      out.write("        count++;\n");
      out.write("        stars[count] = this\n");
      out.write("      };\n");
      out.write("      Star.prototype.draw = function () {\n");
      out.write("        var x = Math.sin(this.timePassed) * this.orbitRadius + this.orbitX, y = Math.cos(this.timePassed) * this.orbitRadius + this.orbitY, twinkle = random(10);\n");
      out.write("        if (twinkle === 1 && this.alpha > 0) {\n");
      out.write("          this.alpha -= 0.05\n");
      out.write("        } else if (twinkle === 2 && this.alpha < 1) {\n");
      out.write("          this.alpha += 0.05\n");
      out.write("        }\n");
      out.write("        ctx.globalAlpha = this.alpha;\n");
      out.write("        ctx.drawImage(canvas2, x - this.radius / 2, y - this.radius / 2, this.radius, this.radius);\n");
      out.write("        this.timePassed += this.speed\n");
      out.write("      };\n");
      out.write("      for (var i = 0; i < maxStars; i++) {\n");
      out.write("        new Star()\n");
      out.write("      }\n");
      out.write("      function animation() {\n");
      out.write("        ctx.globalCompositeOperation = 'source-over';\n");
      out.write("        ctx.globalAlpha = 0.8;\n");
      out.write("        ctx.fillStyle = 'hsla(' + hue + ', 64%, 6%, 1)';\n");
      out.write("        ctx.fillRect(0, 0, w, h);\n");
      out.write("        ctx.globalCompositeOperation = 'lighter';\n");
      out.write("        for (var i = 1, l = stars.length; i < l; i++) {\n");
      out.write("          stars[i].draw()\n");
      out.write("        }\n");
      out.write("        ;\n");
      out.write("        window.requestAnimationFrame(animation)\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      animation();\n");
      out.write("    }\n");
      out.write("    fn();\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
