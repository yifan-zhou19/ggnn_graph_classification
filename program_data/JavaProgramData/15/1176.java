package <missing>;

public class GlobalMembers
{
	public static int[][] s = new int[10000][10000];
	public static void Main()
	{
		int n;
		int i;
		int j;
		int a1;
		int b1;
		int a2;
		int b2;
		int sum;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
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
			flag = 0;
			for (j = 0;j < n;j++)
			{
				if (s[i][j] == 0)
				{
					a1 = i;
					b1 = j;
					flag = 1;
					break;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}

		for (i = n - 1;i > 0;i--)
		{
			flag = 0;
			for (j = n - 1;j > 0;j--)
			{
				if (s[i][j] == 0)
				{
					a2 = i;
					b2 = j;
					flag = 1;
					break;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}

		sum = (a2 - a1 - 1) * (b2 - b1 - 1);
		System.out.printf("%d",sum);

	}
}

