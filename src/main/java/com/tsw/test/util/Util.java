package com.tsw.test.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class Util {

	public static String msgAndBack(HttpServletRequest req, String msg) {
        req.setAttribute("msg", msg);
        req.setAttribute("historyBack", true);
        return "mpaUsr/common/redirect";
    }

    public static String msgAndReplace(HttpServletRequest req, String msg, String replaceUri) {
        req.setAttribute("msg", msg);
        req.setAttribute("replaceUri", replaceUri);
        return "mpaUsr/common/redirect";
    }
	
    public static String msgAndBack(String msg) {
        StringBuilder sb = new StringBuilder();
        sb.append("<script>");
        sb.append("alert('" + msg + "');");
        sb.append("history.back();");
        sb.append("</script>");

        return sb.toString();
    }

    public static String msgAndReplace(String msg, String uri) {
        StringBuilder sb = new StringBuilder();
        sb.append("<script>");
        sb.append("alert('" + msg + "');");
        sb.append("location.replace('" + uri + "');");
        sb.append("</script>");

        return sb.toString();
    }
    
    //인코딩 된 값 반환 (사용 : 로그인 요구 후 직전 페이지로 이동되게 하는 기능)
    public static String getUrlEncoded(String str) {
		try {
			return URLEncoder.encode(str, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return str;
		}
	}
    
    public static String makeFullUriAndEncoded(HttpServletRequest req) {
        String afterLoginUrl = req.getRequestURI();
    	if(req.getQueryString()!=null) {
    		afterLoginUrl = afterLoginUrl + "?" + req.getQueryString();
    	}
    	return Util.getUrlEncoded(afterLoginUrl);
    }
    
    public static String redirectLoginPage(HttpServletRequest req) {
    	if(req.getQueryString()!=null) {
    		return "?" + req.getQueryString();
    	}
    	return null;
    }
    
    public static String querySplit(HttpServletRequest req) {
    	String afterLoginUrl = req.getQueryString();
    	afterLoginUrl = URLDecoder.decode(afterLoginUrl);
    	return afterLoginUrl.replaceFirst("afterLoginUrl=", "");
    }

}





















