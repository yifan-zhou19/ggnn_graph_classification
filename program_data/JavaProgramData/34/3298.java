package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int n;
		   int a;
		   int b;
		   int i;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   if (n == 1)
		   {
			   System.out.print("End\n");
		   }
		   else
		   {
				a = n;
				b = n;
			   for (;;)
			   {
				 if (a == 1)
				 {
					 break;
				 }
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
			   System.out.print("End\n");
		   }
	}

}

