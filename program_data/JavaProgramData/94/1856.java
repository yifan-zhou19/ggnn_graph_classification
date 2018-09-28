package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[500];
		int[] b = new int[500];
		int i;
		int j = 0;
		int t;
		int k;
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
			if (a[i] % 2 != 0)
			{
				b[j] = a[i];
				j = j + 1;
			}
		}
		t = j;
		for (j = 0;j < t - 1;j++)
		{
			for (i = 0;i < t - 1 - j;i++)
			{
				if (b[i] > b[i + 1])
				{
					k = b[i];
				b[i] = b[i + 1];
				b[i + 1] = k;
				}
			}
		}
		for (j = 0;j < t;j++)
		{
			if (j == 0)
			{
			System.out.printf("%d",b[j]);
			}
			else
			{
				System.out.printf(",%d",b[j]);
			}
		}
	}

}

