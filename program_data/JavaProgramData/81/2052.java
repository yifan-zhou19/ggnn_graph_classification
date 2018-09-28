package <missing>;

public class GlobalMembers
{
	public static int survival(int[][] a, int n, int m)
	{
		if (n < 0 || n>4 || m < 0 || m>4)
		{
			return 0;
		}
		else
		{
			int temp;
			int i;
			for (i = 0;i <= 4;i++)
			{
				temp = (a[n] + i);
				*(a[n] + i) = *(a[m] + i);
				*(a[m] + i) = temp;
			}
			return 1;
		}
	}

	public static void Main()
	{
		int[][] a = new int[6][6];
		int n;
		int m;
		int i;
		int j;
		int f;
		int survival = new int(int a[6][6],int n,int m);
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] + j = Integer.parseInt(tempVar);
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
		f = survival(a, n, m);
		if (f == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i <= 4;i++)
			{
				for (j = 0;j <= 3;j++)
				{
					System.out.printf("%d ",*(a[i] + j));
				}
				System.out.printf("%d\n",*(a[i] + j));
			}
		}
	}

}

