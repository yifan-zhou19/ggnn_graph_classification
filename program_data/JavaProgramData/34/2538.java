package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int a;
		 int b;
		 int c;
		 int d;
		 int e;
		 int f;
		 int g;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 if (a != 1)
		 {
		 while (a != 1)
		 {
			   if (a % 2 == 0)
			   {
						  b = a / 2;
						  System.out.printf("%d/2=%d\n",a,b);
						  a = b;
			   }
			   else
			   {
				   b = a * 3 + 1;
				   System.out.printf("%d*3+1=%d\n",a,b);
				   a = b;
			   }
		 }
		 }
		 System.out.print("End");
	}



}

