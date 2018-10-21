package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int[][] b =
		{
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i <= a - 1;i++)
		{
			for (j = 0;j <= a - 1;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i][j] = Integer.parseInt(tempVar2);
				}
			};
		}
		int s = 0;
		int l = 0;
		for (i = 0;i <= a - 1;i++)
		{
			for (j = 0;j <= a - 1;j++)
			{
				s = s + b[i][j];
			}
			if (s == 255 * (a - 2))
			{
				l = l + 1;
			}
			s = 0;
		}
		int t = 0;
		int k = 0;
		for (j = 0;j <= a - 1;j++)
		{
			for (i = 0;i <= a - 1;i++)
			{
				t = t + b[i][j];
			}
			if (t == 255 * (a - 2))
			{
				k = k + 1;
			}
			t = 0;
		}

		int sum = l * k;
		System.out.printf("%d",sum);
	}

}

