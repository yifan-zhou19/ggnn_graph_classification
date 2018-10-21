package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

		char[][] a = new char[110][110];

		char[][] b = new char[110][110];

		int n;
		int m;

		int i;
		int j;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] + 1 = Integer.parseInt(tempVar2);
			}
		}

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}

		for (k = 1;k < m;k++)

		{

			for (i = 1;i <= n;i++)

			{

				for (j = 1;j <= n;j++)

				{

					if (a[i][j] == '.' && (a[i - 1][j] == '@' || a[i][j - 1] == '@' || a[i + 1][j] == '@' || a[i][j + 1] == '@'))
					{

						b[i][j] = '@';
					}

					else
					{

						b[i][j] = a[i][j];
					}

				}

			}

			for (i = 1;i <= n;i++)

			{

				for (j = 1;j <= n;j++)

				{

					a[i][j] = b[i][j];

					//printf("%c",a[i][j]);

				}

				//printf("\n");

			}

		}

		int sum = 0;

		for (i = 1;i <= n;i++)

		{

			for (j = 1;j <= n;j++)

			{

				if (a[i][j] == '@')
				{

					sum++;
				}

			}

		}

		System.out.printf("%d\n", sum);

		return 0;

	}


}

