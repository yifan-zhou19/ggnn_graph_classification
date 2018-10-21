package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] A = new int[1000][1000];
		int n;
		int a;
		int b;
		int c;
		int d;
		int i = 0;
		int j = 0;
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
					if (A[i][j] == 0 && A[i][j - 1] != 0 && A[i - 1][j] != 0)
					{
						a = i;
						b = j;
					}
					if (A[i][j] == 0 && A[i][j - 1] == 0 && A[i - 1][j] == 0)
					{
						c = i;
						d = j;
					}
			}
		}

		System.out.printf("%d",(c - a - 1) * (d - b - 1));
	}


}

