package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int k;
		int i;
		int j = 0;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	   for (i = 3;i <= n - 2;i = i + 2)
	   {
						  z = 1;
	   for (k = 3;k * k <= i;k++)
	   {
	   if (i % k == 0)
	   {
		   z = 0;
	   }
	   }
	   if (z == 0)
	   {
		   ;
	   }
	   else
	   {
		   z = 1;
		   for (k = 3;k * k <= i + 2;k++)
		   {
	   if ((i + 2) % k == 0)
	   {
		   z = 0;
	   }
		   }
	   if (z == 0)
	   {
		   ;
	   }
	   else
	   {
		   System.out.printf("%d %d\n",i,i + 2);
		   j++;
	   }
	   }
	   }
	   if (j == 0)
	   {
	   System.out.print("empty");
	   }
	}

}

