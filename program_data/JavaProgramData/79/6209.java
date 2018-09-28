package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int m;
	   int i;
	   int s;
	   int j = -1;
	   while (j != 0)
	   {
		   s = 0;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead(" ");
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
		   if (m == 0)
		   {
			   j = 0;
		   }
		   else
		   {
			   if (n == 1)
			   {
				   System.out.print("1\n");
			   }

			   else
			   {
				   j = -1;
				   for (i = 2; i <= n; i++)
				   {
					   s = (s + m) % i;
				   }
				   System.out.printf("%d\n", s + 1);
			   }
		   }
	   }

	}
}

