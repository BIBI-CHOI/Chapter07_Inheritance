package ch07_4_abstract_class;

abstract class HttpServlet {
	public abstract void service();
	public void method( ) {}
	public void method( ) {}
}

public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());	// �α��� �մϴ�.
		method(new FileDownloadServlet());	// ���� �ٿ�ε��մϴ�.
	}

	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
