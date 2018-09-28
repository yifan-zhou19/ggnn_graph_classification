package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[101][101];
		int n;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					a[i][j] = tempVar2.charAt(0);
				}
						  if ('\n' == a[i][j])
						  {
							  --j;
						  }
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
			 while (--m > 0)
			 {
		for (i = 0;i < n;i++)
		{
		 for (j = 0; j < n; j++)

		 {

					if (a[i][j] == '@')

					{

						if (i - 1 >= 0 && a[i - 1][j] == '.')
						{

							a[i - 1][j] = '*';
						}

						if (i + 1 < n && a[i + 1][j] == '.')
						{

							a[i + 1][j] = '*';
						}

						if (j - 1 >= 0 && a[i][j - 1] == '.')
						{

							a[i][j - 1] = '*';
						}

						if (j + 1 < n && a[i][j + 1] == '.')
						{

						   a[i][j + 1] = '*';
						}

					}

		 }
		}



			for (i = 0; i < n; i++)
			{

				for (j = 0; j < n; j++)
				{

					if (a[i][j] == '*')
					{

						a[i][j] = '@';
					}
				}
			}



			 }



		int sum = 0;

		for (i = 0; i < n; i++)
		{

			for (j = 0; j < n; j++)
			{

					if (a[i][j] == '@')
					{

						++sum;
					}
			}
		}



		System.out.printf("%d\n",sum);



		return 0;

	}

}

