package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] s = new int[100][2];
		int i;
		int j;
		int[] a = new int[100];
		int m = 0;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
		for (i = 0;i < n;i++)
		{
			if (s[i][0] >= 90 && s[i][0] <= 140 && s[i][1] >= 60 && s[i][1] <= 90)
			{
				a[m]++;
			}
			else
			{
				m++;
			}
		}
		b = a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] > b)
			{
				b = a[i];
			}
		}
		System.out.printf("%d",b);
		return 0;
	}

}

