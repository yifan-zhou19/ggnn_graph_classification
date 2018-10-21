package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int max;
		int min;
		int[] a = new int[50001];
		int[] b = new int[50001];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (i == 0)
			{
				min = a[i];
				max = b[i];
			}
			else
			{
				if (a[i] < min)
				{
					min = a[i];
				}
				if (b[i] > max)
				{
					max = b[i];
				}
			}
		}
		for (j = min;j < max;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (j + 0.0001 > a[i] && j + 0.0001 < b[i])
				{
					break;
				}
			}
			if (i == n)
			{
				System.out.print("no");
				break;
			}
		}
		if (j == max)
		{
			System.out.printf("\n%d %d\n",min,max);
		}

		return 0;

	}

}

