package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] a = new int[25];
		int i;
		int j;
		int temp = 0;
		for (i = 0;i < k;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		int[] max = new int[25];
		for (i = 0;i < k;i++)
		{
			max[i] = 1;
		}

		for (i = k - 2;i >= 0;i--)
		{

			for (j = i + 1;j < k;j++)
			{
			if (a[i] >= a[j])
			{
				temp = max[j] + 1;
			}
			if (temp > max[i])
			{
				max[i] = temp;
			}
			}

		}
		int nmax = 0;
		for (i = 0;i < k;i++)
		{
		if (max[i] > nmax)
		{
			nmax = max[i];
		}
		}
		System.out.printf("%d\n",nmax);

	}


}

