package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] a = new int[100000];
		int[] w = new int[10000];
		int z = 0;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				  if (i % j == 0)
				  {
					  a[i]++;
					  break;
				  }
			}
		}
	   for (i = m;i <= n;i++)
	   {
		   if (a[i] == 0)
		   {
			   int k;
			   int b;
			   int c = 0;
			   k = i;
			   while (k > 0)
			   {
			   b = k % 10;

			   k = k / 10;
				c = c * 10 + b;
			   }
			   if (c == i)
			   {
				 z = z + 1;
				 w[z] = c;
				 s = s + 1;

			   }
			   else
			   {
				   continue;
			   }
		   }
	   }
	   if (z == 0)
	   {
		   System.out.print("no");
	   }
	   else
	   {
	   for (z = 1;z < s;z++)
	   {
				   System.out.printf("%d,",w[z]);
	   }
	  System.out.printf("%d",w[s]);
	   }
	return 0;
	}


}

