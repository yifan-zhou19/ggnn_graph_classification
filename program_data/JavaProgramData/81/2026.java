package <missing>;

public class GlobalMembers
{
	public static int trans(int n, int m, int[] a)
	{
		int temp;
		int j;
		int i = 0;
		if (0 <= n != 0 && n <= 4 && 0 <= m != 0 && m <= 4)
		{
			for (j = 0;j < 5;j++)
			{
				temp = (a[n] + j);
				*(a[n] + j) = *(a[m] + j);
				*(a[m] + j) = temp;
			}
			i = 1;
		}
		return (i);
	}
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[5][5];
		int t;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*(a + i) + j = tempVar;
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
		t = trans(n, m, a);
		if (t == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j < 4)
					{
					System.out.printf("%d ",*(*(a + i) + j));
					}
					else
					{
						System.out.printf("%d\n",*(*(a + i) + j));
					}
				}
			}
		}

	return 0;
	}



}

