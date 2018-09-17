package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int dmax;
		int[] a = new int[100];
		int[] d = new int[100];

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

		for (i = 0;i < n;i++)
		{
		d[i] = 1;
		}



		for (i = n - 2;i >= 0;i--)
		{
							for (j = i + 1;j < n;j++)
							{
								 if ((a[i] >= a[j]) && (d[i] <= d[j]))
								 {
									  d[i] = d[j] + 1;


								 }




							}
		}



		   dmax = 0;
		   for (i = 0;i < n;i++)
		   {
			   if (d[i] > dmax)
			   {
			  dmax = d[i];
			   }



		   }



		System.out.printf("%d\n",dmax);













		return 0;
	}

}

