package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int a;
		 int b;
		 int[] sz = new int[100];
		 int m = 0;
		 int j = 0;
		 int max = 0;
		 int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (j = 0;j <= 99;j++)
	   {
	   sz[j] = 0;
	   }

	   j = 0;
	   for (i = 0;i <= n - 1;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b = Integer.parseInt(tempVar3);
		   }
		if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
		{
			m = m + 1;
		 sz[j] = m;
		}
		  else
		  {
			  j = j + 1;
			   sz[j] = 0;
				j = j + 1;
				 m = 0;
		  }
	   }

		for (j = 0;j <= 99;j++)
		{
			if (sz[j] > max)
			{
		 max = sz[j];
			}
		}
	   System.out.printf("%d",max);
	   return 0;
	}
}

