package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int can = new int(int n,int m);
		void change(int a[5][5],int n,int m);
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[5][5];
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
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (can(n, m) != 0)
		{
			change(a, n, m);
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d",a[i][4]);
				System.out.print("\n");
			}
		}
		if (can(n, m) == 0)
		{
			System.out.print("error");
		}
	}
	public static int can(int n,int m)
	{

		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			return (1);
		}
		if (n < 0 || n >= 5 || m < 0 || m >= 5)
		{
			return (0);
		}
	}
	public static void change(int[][] a, int n, int m)
	{
		int i;
		int temp;
		for (i = 0;i < 5;i++)
		{
			temp = a[n][i];
			a[n][i] = a[m][i];
			a[m][i] = temp;
		}
	}

}

