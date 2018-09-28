package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int sum;
		int k;
		int p;
		int q;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		char zds;


		//?? 
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			zds = tempVar2.charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					a[i][j] = tempVar3.charAt(0);
				}
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				zds = tempVar4.charAt(0);
			}
		}



		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m = Integer.parseInt(tempVar5);
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = a[i][j];
			}
		}




		//??m-1?
		for (k = 1;k < m;k++)
		{
			for (p = 0;p < n;p++)
			{
				for (q = 0;q < n;q++)
				{
					if (q > 0 && q < n && b[p][q] == '.' && b[p][q - 1] == '@')
					{
						a[p][q] = '@';
					}

					else if (q >= 0 && q < n - 1 && b[p][q] == '.' && b[p][q + 1] == '@')
					{
						a[p][q] = '@';
					}

					else if (p > 0 && p < n && b[p][q] == '.' && b[p - 1][q] == '@')
					{
						a[p][q] = '@';
					}

					else if (p >= 0 && p < n - 1 && b[p][q] == '.' && b[p + 1][q] == '@')
					{
						a[p][q] = '@';
					}


					else
					{
						a[p][q] = a[p][q];
					}
				}
			}

			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					b[i][j] = a[i][j];
				}
			}

		}



		sum = 0;

		//??
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
					if (a[i][j] == '@')
					{
						sum++;
					}
			}
		}





		//??
		System.out.printf("%d",sum);

		return 0;
	}
}

