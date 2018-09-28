package <missing>;

public class GlobalMembers
{
	public static int shuzu(int n, int m)
	{

		if (n < 0 || n>4 || n < 0 || m>4)
		{
			return 0;
		}
		else
		{


				return 1;
		}
	}
	public static int Main()
	{
		int[][] a = new int[10][10];
	int i;
	int j;
	int d;
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
		int n;
		int m;
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
		int s;
		s = shuzu(n, m);
		if (s == 0)
		{
			System.out.print("error");
		}
		else
		{

				for (j = 0;j < 5;j++)
				{
					d = a[m][j];
					a[m][j] = a[n][j];
					a[n][j] = d;
				}
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d %d %d %d %d\n",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
			}
		}
		return 0;
	}


}

