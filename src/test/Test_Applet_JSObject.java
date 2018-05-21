package test;

import javax.swing.JApplet;

import netscape.javascript.JSObject;

@SuppressWarnings("serial")
public class Test_Applet_JSObject extends JApplet {

	
  @SuppressWarnings("restriction")
public void start() {
		 JSObject win = JSObject.getWindow(this);
		 win.eval("x = [1,2,3]");
		 JSObject jso = (JSObject) win.getMember("x");
		 System.out.println(" 2 =?= " + jso.getSlot(1)); 
		 jso = (JSObject) win.getMember("document");
		 jso = (JSObject) jso.call("getElementsByTagName", new Object[] { "body" });
		 System.out.println(jso.getSlot(0));
		 jso = (JSObject) win.getMember("J2S");
		 jso = (JSObject) jso.call("say", new Object[] { "OK" });
		 jso = (JSObject) win.getMember("testApplet");
		 jso = (JSObject) jso.getMember("_appletPanel");
		 jso = (JSObject) jso.call("getAppletContext", new Object[0]);
		 Object obj = /** @j2sNative jso.obj || */ null;
		 System.out.println(obj);
		 System.out.println("done");
  }
	
}