package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] a = {100, 50, 20, 10, 5, 1};
		int[] b = new int[6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 5;i++)
		{
			for (j = 1;m >= a[i];j++)
			{
				m = m - a[i];
				b[i]++;
			}
		}
		for (i = 0;i <= 5;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}
}

