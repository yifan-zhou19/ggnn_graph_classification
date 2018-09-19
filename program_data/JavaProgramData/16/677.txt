package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 b = a % 10;
	 System.out.printf("%d",b);
	 a = a / 10;
	 if (a != 0)
	 {
		b = a % 10;
		System.out.printf("%d",b);
		a = a / 10;
		 if (a != 0)
		 {
			b = a % 10;
			System.out.printf("%d",b);
			a = a / 10;
			 if (a != 0)
			 {
				b = a % 10;
				System.out.printf("%d",b);
				a = a / 10;
				 if (a != 0)
				 {
				  b = a % 10;
				  System.out.printf("%d",b);
				  a = a / 10;
				 }
			 }
		 }
	 }
	 return 0;
	}
}

