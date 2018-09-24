package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int a0;
		 int b0;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a0 = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 b0 = Integer.parseInt(tempVar3);
		 }
		 double d = (double)b0 / a0;
		 for (int i = 0;i < n - 1;i++)
		 {
			   int a;
			   int b;
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   a = Integer.parseInt(tempVar4);
			   }
			   String tempVar5 = ConsoleInput.scanfRead(" ");
			   if (tempVar5 != null)
			   {
				   b = Integer.parseInt(tempVar5);
			   }
			   double c = (double)b / a;
			   if (d >= c)
			   {
					if (d - c > 0.05)
					{
						System.out.print("worse\n");
					}
					else
					{
						System.out.print("same\n");
					}
			   }
			   else
			   {
				   if (c - d > 0.05)
				   {
					   System.out.print("better\n");
				   }
				   else
				   {
					   System.out.print("same\n");
				   }
			   }
		 }
	}
}

