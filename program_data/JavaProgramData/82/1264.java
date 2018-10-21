package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] s = new int[100][2];
		int[] a = new int[100];
		int i;
		int j;
		int e;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		int c = 0;
		for (i = 0;i < n;i++)
		{
			if (s[i][0] <= 140 && s[i][0] >= 90 && s[i][1] <= 90 && s[i][1] >= 60)
			{
				c++;
			}
			else
			{
				a[i] = c;
				c = 0;
			}
		}
		a[n - 1] = c;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] < a[j + 1])
				{
					e = a[j + 1];
					a[j + 1] = a[j];
					a[j] = e;
				}
			}
		}
		System.out.printf("%d",a[0]);
		return 0;
	}
}

