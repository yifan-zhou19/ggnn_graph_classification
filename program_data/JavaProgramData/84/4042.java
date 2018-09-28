package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int max = 0;
		int lmax = 0;
		int[] a = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		a[0] = 0;
		for (int i = 0;i < b;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		   if (a[i] >= max)
		   {
			   max = a[i];
		   }
		}

		for (int k = 0;k < b;k++)
		{
			if ((a[k] >= lmax) && (a[k] < max))
			{
			lmax = a[k];
			}
		}
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",lmax);
		return 0;
	}



}

