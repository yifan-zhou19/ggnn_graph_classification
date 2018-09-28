package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int k;
	   int m;
	   int[] a = new int[501];
	   int[] b = new int[501];
	   j = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
	   }
		for (k = 0;k < 250;k++)
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] == 2 * k + 1)
				{
					 b[j] = a[i];
					 j += 1;
				}
			}
		}
		if (j != 0)
		{
		  for (m = 0;m < j - 1;m++)
		  {
			System.out.printf("%d,",b[m]);
		  }
		  System.out.printf("%d",b[j - 1]);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;

	}

}

