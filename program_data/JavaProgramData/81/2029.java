package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		(int)(*p)[5];
		int i;
		int j;
		int m;
		int n;
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		int trans = new int(int p[5],int m,int n);
		if (trans(a, m, n) != 0)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",*(*(p + i) + j));
				}
				System.out.printf("%d\n",*(*(p + i) + 4));
			}
		}
		else
		{
			System.out.print("error\n");
		}
	}
	public static int trans(int[] p, int m, int n)
	{
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{
			int i;
			int t;
			for (i = 0;i < 5;i++)
			{
				t = (p[m] + i);
				*(p[m] + i) = *(p[n] + i);
				*(p[n] + i) = t;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

