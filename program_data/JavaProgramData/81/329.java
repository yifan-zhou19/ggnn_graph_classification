package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t;
		int[][] a = new int[5][5];
		int f = new int(int m,int n);
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
		if (f(m, n) == 0)
		{
			System.out.print("error");
		}
			else
			{
				 for (i = 0;i < 5;i++)
				 {
					t = a[n][i];
					a[n][i] = a[m][i];
					a[m][i] = t;
				 }
					for (i = 0;i < 5;i++)
					{
						  System.out.printf("%d",a[i][0]);
						for (j = 1;j < 5;j++)
						{
						   System.out.printf(" %d",a[i][j]);
						}
						  System.out.print("\n");
					}
			}
	}
	public static int f(int m,int n)
	{
		int s;
		if (m < 5 && n < 5)
		{
				s = 1;
		}
		else
		{
				s = 0;
		}
		return (s);
	}



}

