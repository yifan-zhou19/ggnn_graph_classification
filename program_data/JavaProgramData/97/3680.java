package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int[] a = new int[6];
		int[] b = {100, 50, 20, 10, 5, 1};
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < 6;j++)
		{
			for (i = 0;m < n - b[j] + 1;i++)
			{
				m = m + b[j];
				a[j]++;
			}
		}

		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		return 0;
	}


}

