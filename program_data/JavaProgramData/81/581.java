package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		int exchange = new int(int a[5][5],int n,int m);
		int n;
		int m;
		for (n = 0;n < 5;n = n + 1)
		{
			for (m = 0;m < 5;m = m + 1)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[n][m] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (exchange(a, n, m) == 1)
		{
			for (n = 0;n < 5;n = n + 1)
			{
				for (m = 0;m < 4;m = m + 1)
				{
					System.out.printf("%d ",a[n][m]);
				}
				System.out.printf("%d\n",a[n][4]);
			}
		}
		else
		{
			System.out.print("error\n");
		}
	}
	public static int exchange(int[][] a, int n, int m)
	{
		int flag;
		int i;
		int t;
		if ((n >= 0 && n <= 4) && (m >= 0 && m <= 4))
		{
		 flag = 1;
		 for (i = 0;i < 5;i++)
		 {
			 t = a[n][i];
			 a[n][i] = a[m][i];
			 a[m][i] = t;
		 }
		}
		else
		{
			flag = 0;
		}
		return (flag);
	}
}

