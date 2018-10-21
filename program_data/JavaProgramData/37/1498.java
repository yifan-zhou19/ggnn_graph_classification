package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		char[][] a = new char[N][M];
		int i;
		int j;
		int r;
		int num;

		for (i = 0;i < N;i++)
		{
			for (j = 0;j < M;j++)
			{
				a[i][j] = '\0';
			}
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}

		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}

		for (i = 0;i < t;i++)
		{
			for (j = 0;a[i][j] != '\0';j++)
			{
				for (r = 0,num = 0;a[i][r] != '\0';r++)
				{
					if (a[i][j] == a[i][r])
					{
						num++;
					}
				}
				if (num == 1)
				{
					System.out.printf("%c\n",a[i][j]);
					break;
				}
			}

			if (a[i][j] == '\0')
			{
				System.out.print("no\n");
			}
		}

		return 0;

	}
}

