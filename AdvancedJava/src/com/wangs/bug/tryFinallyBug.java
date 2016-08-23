package com.wangs.bug;
//finally 中不要加return关键字
//输出如下：
//
//截获异常并重新抛出异常
//110
//异常处理finally
//关键的“截获异常catch”却没有执行！！！
//
//原因是在getResult()的finally中return一个值，等同于告诉编译器该方法没有异常,但实际上异常是有的，这样的结果是该方法的调用者却捕获不到异常，相对于异常被无端的被吃掉了，隐藏杀机啊！！
//
//结论：不要再finally中试图return一个值，这样可能会导致一些意想不到的逻辑错误，finally就是用来释放资源的！！

public class tryFinallyBug {
	
	public static void main(String[] args) {
		try {
			System.out.println(tryFinallyBug.getResult());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("截获异常catch");
		} finally {
			System.out.println("异常处理finally");
		}
	}

	public static int getResult() throws Exception {
		int a = 100;

		try {

			a = a + 10;
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("截获异常并重新抛出异常");
			throw new Exception();
		} finally {
			return a;
		}
	}

}
