package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20];
		int[] b = new int[20];
		int i;
		int j;
		int k;
		int[] result = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		result[0] = 1;
		result[1] = 1;
		for (k = 1;k <= n;k++)
		{
			if (a[k - 1] >= 3)
			{
				for (j = 2;j <= a[k - 1] - 1;j++)
				{
					result[j] = result[j - 1] + result[j - 2];
				}
				b[k - 1] = result[a[k - 1] - 1];
				System.out.printf("%d\n",b[k - 1]);
			}
			else if (a[k - 1] == 1 || a[k - 1] == 2)
			{
				System.out.print("1\n");
			}
		}
		return 0;
	}
}

