package <missing>;

public class GlobalMembers
{
	public static int panduan(int n,int m)
	{
		int y;




			if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
			{

				y = 1;
			}



			else
			{
				y = 0;
			}
			return y;


	}

	public static void Main()
	{
		int puanduan = new int(int n,int m);
		int y;
		int i;
		int j;
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int[] c = new int[5];
		int m;
		int n;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
				b[i][j] = a[i][j];
			}
		}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}

		y = panduan(n, m);
		if (y == 1)
		{
			for (i = 0;i < 5;i++)
			{
				c[i] = a[n][i];
				b[n][i] = a[m][i];
				b[m][i] = a[n][i];
			}
		  for (i = 0;i < 5;i++)
		  {
			  System.out.printf("%d %d %d %d %d\n",b[i][0],b[i][1],b[i][2],b[i][3],b[i][4]);
		  }

		}


		else
		{
			System.out.print("error");
		}
	}



}

