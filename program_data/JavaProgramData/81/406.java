package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int change = new int(int n,int m);
		void changing(int a[5][5],int n,int m);
		int n;
		int m;
		int i;
		int j;
		int flag;
		int[][] a = new int[5][5];
		for (j = 0;j < 5;j++)
		{
			for (i = 0;i < 5;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[j][i] = Integer.parseInt(tempVar);
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
		flag = change(n, m);
		if (flag == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			changing(a, n, m);
			for (j = 0;j < 5;j++)
			{
				System.out.printf("%d",a[j][0]);
				for (i = 1;i < 5;i++)
				{
					System.out.printf(" %d",a[j][i]);
				}
				System.out.print("\n");
			}
		}
	}
	public static int change(int n,int m)
	{
		int f;
		if ((n >= 0 && n < 5) && (m >= 0 && m < 5))
		{
			f = 1;
		}
		else
		{
			f = 0;
		}
		return (f);
	}
	public static void changing(int[][] a, int n, int m)
	{
		int i;
		int[] b = new int[5];
		for (i = 0;i < 5;i++)
		{
			b[i] = a[n][i];
			a[n][i] = a[m][i];
			a[m][i] = b[i];
		}
	}




}

