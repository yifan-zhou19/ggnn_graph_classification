package <missing>;

public class GlobalMembers
{
	public static int fun(int[] p, int n, int m)
	{
		int i;
		int t;
		if (n < 0 || n >= 5 || m < 0 || m >= 5)
		{
			return 0;
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				t = (p[n] + i);
				*(p[n] + i) = *(p[m] + i);
				*(p[m] + i) = t;
			}
			return 1;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[][] a = new int[5][5];
		(int)(*p)[5];
		p = a;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*(p + i) + j = tempVar;
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
		if (fun(p, n, m) == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)

			{

				for (j = 0;j < 5;j++)

				{
					if (j != 4)
					{
				System.out.printf("%d ",*(*(p + i) + j));
					}
					else
					{
			 System.out.printf("%d\n",*(*(p + i) + j));
					}

				}

			}
		}



		return 0;
	}

}

