package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] A = new int[1000][1000];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				int x;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x = Integer.parseInt(tempVar2);
				}
				A[i][j] = x;
			}
		}
		int a;
		int b;
		int c;
		int d;
		int p;
		for (i = 1;i < n - 1;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
		if (A[i][j] == 0 && A[i][j - 1] == 255 && A[i][j + 1] == 0 && A[i - 1][j] == 255 && A[i + 1][j] == 0)
		{
			a = i;
			b = j;
		}
		else if (A[i][j] == 0 && A[i][j - 1] == 0 && A[i][j + 1] == 255 && A[i - 1][j] == 0 && A[i + 1][j] == 255)
		{
			c = i;
			d = j;
		}
			}
		}
		p = (c - a - 1) * (d - b - 1);
		System.out.printf("%d",p);
		return 0;
	}

}

