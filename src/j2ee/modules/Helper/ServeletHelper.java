package j2ee.modules.Helper;

import java.util.Date;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

public class ServeletHelper {

	public static void printServeletRequestHeader(HttpServletRequest request) {
		
		Enumeration<String> enumeration = request.getHeaderNames();
		while (enumeration.hasMoreElements()) {
			String name = (String) enumeration.nextElement();
			String value = request.getHeader(name);
			System.out.println(name + " : " + value);
		}
		
		System.out.println("\n\n");
		System.out.println("session id -> " + request.getSession().getId());
		System.out.println("session createTime -> " + new Date(request.getSession().getCreationTime()));
		System.out.println("session accessedTime -> " + new Date(request.getSession().getLastAccessedTime()));
		
		
//		Enumeration<String> enumeration = request.getParameterNames();
//		while (enumeration.hasMoreElements()) {
//			String name = (String) enumeration.nextElement();
//			String value = request.getParameter(name);
//			System.out.println(name + " - " + value);
//		}
	}
	
	
	
	
}
