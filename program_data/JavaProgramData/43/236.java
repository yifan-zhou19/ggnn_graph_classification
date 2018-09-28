package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int i;
	   int j;
	   int z;
	   int k;
	   int h;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   for (i = 3;i <= m / 2;i += 2)
	   {
		   z = 1;
		   k = m - i;
		   for (j = 2;j <= Math.sqrt(i);j++)
		   {
			   if (i % j == 0)
			   {
				   z = 0;
			   }
		   }
		   for (h = 2;h <= Math.sqrt(k);h++)
		   {
			   if (k % h == 0)
			   {
				   z = 0;
			   }
		   }
		   if (z != 0)
		   {
			   System.out.printf("%d %d\n",i,k);
		   }
	   }
	}

}

