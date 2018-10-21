package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int q;
		int[] a = new int[10000];
		int[] b = new int[10000];
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
		j = 0;
		k = 0;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 == 1)
			{
				b[j] = a[i];
				k++;
				j++;
			}
		}


		for (i = 0;i < k;i++)
		{
	for (j = 0;j < k - 1;j++)
	{
				if (b[j] > b[j + 1])
				{
					q = b[j];
					b[j] = b[j + 1];
					b[j + 1] = q;
				}
	}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d",b[i]);
			System.out.print(",");
		}
	System.out.printf("%d\n",b[k - 1]);
	return 0;
	}
}

