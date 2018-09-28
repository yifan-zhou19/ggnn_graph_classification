package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int change = new int(int a[5][5],int m,int n); //??????????
		int[][] a = new int[5][5];
		int i;
		int j;
		int t;
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
			}
		}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			t = change(a, m, n);
		   if (t == 1)
		   {
				  for (i = 0;i < 5;i++)
				  {
			for (j = 0;j < 5;j++)
			{
				if (j == 4)
				{
				System.out.printf("%d\n",a[i][j]);
				}
				else
				{
					System.out.printf("%d ",a[i][j]);
				}
			}
				  }
		   }
			if (t == 0)
			{
				System.out.print("error");
			}
	}

	public static int change(int[][] a, int m, int n)
	{
		int i;
		int c;
		int p;
		if (m >= 5 || n >= 5)
		{
			c = 0;
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				p = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = p;
			}
				c = 1;
		}
		return (c);
	}


}

