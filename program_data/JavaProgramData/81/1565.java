package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static f(int[][] a, int s, int t)
	{
		int i;
		int k;
		int[][] b = new int[1][5];

		if (s < 0 || s>4 || t < 0 || t>4)
		{
				k = 0;
		}
			else
			{
				k = 1;
				for (i = 0;i < 5;i++)
				{
					b[0][i] = a[s][i];
					a[s][i] = a[t][i];
					a[t][i] = b[0][i];

				}


			}
		return (k);
	}



	public static void Main()
	{
		int[][] d = new int[5][5];
		int m;
		int n;
		int i;
		int j;


		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					d[i][j] = Integer.parseInt(tempVar);
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
		f(d, m, n);
		if (f(d,m,n) == 0)
		{
			System.out.print("error");
		}
			else if (f(d,m,n) == 1)
			{
				  for (i = 0;i < 5;i++)
				  {
					  for (j = 0;j < 5;j++)
					  {
						  if (j / 4 == 0)
						  {
						  System.out.printf("%d ",d[i][j]);
						  }
					else if (j / 4 == 1)
					{
					System.out.printf("%d\n",d[i][j]);
					}
					  }
				  }
			}
	}


}

