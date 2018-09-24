package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] a = new int[k];
		int i;
		for (i = 0;i < k;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a[i] = Integer.parseInt(tempVar2);
						}
		}
		int[] b = new int[k];
		for (i = 0; i < k; i++)
		{
				b[i] = 1;
		}
		for (int i = 1; i < k; i++)
		{
			for (int t = 0; t < i; t++)
			{
			if (a[t] >= a[i] != 0 && b[t] + 1 >= b[i])
			{
					 b[i] = b[t] + 1;
			}
			}
		}
	 //   ????
	   int max = b[0];
	   for (int i = 1; i < k; i++)
	   {
			 if (b[i] > max)
			 {
				 max = b[i];
			 }
	   }

		System.out.printf("%d",max);
	}

}

