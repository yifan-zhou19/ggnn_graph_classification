package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] A = new int[100][100];
		int n;
		int i;
		int j;
		int a;
		int b;
		int p;
		int q;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					A[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (A[i][j] == 255 && A[i][j - 1] == 255 && A[i - 1][j] == 0)
				{
					a = i;
					b = j;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (A[i][j] == 0 && A[i][j - 1] == 255)
				{
					p = i;
					q = j;
					i = n;
					j = n;
				}
			}
		}
		r = (a - p - 2) * (b - q - 1);
		System.out.printf("%d\n",r);
		return 0;
	}

}

