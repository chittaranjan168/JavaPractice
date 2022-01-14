
public class InnerClassDemo {

	static class InnerStatic{
		private void abc() {
			System.out.println("Static Inner class Method");
		}
	}
	
	class Inner{
		int a=20;
	     void abc() {
	    	 System.out.println("Hi");
	    	 class InnerLocal{
		    	 void abc() {
		    		 System.out.println("Inner abc");
		    	 }
		     }
	    	 InnerLocal il=new InnerLocal();
	    	 il.abc();
	     }
	     
	     
	     
	}
	public static void main(String[] args) {
		
		
		InnerClassDemo innerClassDemo =new InnerClassDemo();
	     InnerClassDemo.Inner inner=innerClassDemo.new Inner();
	     inner.abc();
	     InnerClassDemo.InnerStatic innerStatic=new InnerClassDemo.InnerStatic();
	     innerStatic.abc();
	     
	}

}
