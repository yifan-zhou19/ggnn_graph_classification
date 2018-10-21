package <missing>;

public class GlobalMembers
{
	public static int a(int m,int n)
	{
		int[][] s = new int[5][5];
		if (m > -1)
		{
			if (m < 5)
			{
				if (n > -1)
				{
					if (n < 5)
					{


							return 1;


					}
					   else
					   {
						   return 0;
					   }
				}
					else
					{
						return 0;
					}
			}
				else
				{
					return 0;
				}

		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int[][] s = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int x;
		int t;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s[i][j] = Integer.parseInt(tempVar);
				}
			}
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}

		x = a(m, n);


		if (x == 1)
		{
			for (i = 0;i < 5;i++)
			{
				t = s[m][i];
				s[m][i] = s[n][i];
				s[n][i] = t;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 4)
					{
						System.out.printf("%d\n",s[i][j]);
					}
					else
					{
						System.out.printf("%d ",s[i][j]);
					}
				}
			}
		}

		else
		{
			System.out.print("error");
		}

	}

}

