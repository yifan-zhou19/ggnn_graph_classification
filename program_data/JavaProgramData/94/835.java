package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] a = new int[500];
		int[] b = new int[500];
		int k;
		int i;
		int j;
		int t;
		k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		i = 0;
		while (i < N)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			i = i + 1;
		}
		i = 0;
		while (i < N)
		{
				   if (a[i] % 2 == 1)
				   {
								 k = k + 1;
								 b[k - 1] = a[i];
				   }
				   i = i + 1;
		}
		for (j = 0;j < k - 1;j = j + 1)
		{
						   for (i = 0;i < k - j - 1;i = i + 1)
						   {
												if (b[i] > b[i + 1])
												{
																t = b[i];
																b[i] = b[i + 1];
																b[i + 1] = t;
												}
						   }
		}
		i = 0;
		while (i < k)
		{
				   if (i < k - 1)
				   {
					 System.out.printf("%d,",b[i]);
					 i = i + 1;
				   }
				   else
				   {
					 System.out.printf("%d",b[i]);
					 i = i + 1;
				   }
		}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				N = Integer.parseInt(tempVar3);
			}
		return 0;
	}

}

