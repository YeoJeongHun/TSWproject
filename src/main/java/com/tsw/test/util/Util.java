package com.tsw.test.util;

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
	

}





















