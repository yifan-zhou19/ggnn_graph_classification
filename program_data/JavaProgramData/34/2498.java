package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int x;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 x = Integer.parseInt(tempVar);
	 }
	 while (x % 2 == 0)
	 {
		 x = x / 2;
		 System.out.printf("%d/2=%d\n",x * 2,x);
		 while (x % 2 != 0 && x != 1)
		 {
			 x = x * 3 + 1;
			 System.out.printf("%d*3+1=%d\n",(x - 1) / 3,x);
		 }
	 }

	 while (x % 2 != 0 && x != 1)
	 {
		   x = x * 3 + 1;
		   System.out.printf("%d*3+1=%d\n",(x - 1) / 3,x);
		   while (x % 2 == 0)
		   {
				 x = x / 2;
				 System.out.printf("%d/2=%d\n",x * 2,x);
		   }
	 }
	 if (x == 1)
	 {
		 System.out.print("End\n");
	 }

	}

}

