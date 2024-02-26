
public class ChildOverloding extends ParentMethodoverloading{

	String a="morning";
	public void show()
	{
	//System.out.println("Romi");	
		//System.out.println(super.a);
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildOverloding obj=new ChildOverloding();
		obj.show();
	}

}
