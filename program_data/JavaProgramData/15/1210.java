package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int[][] s = new int[100][100];
		  int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a1 = n - 1;
		int a2 = 0;
		int b1 = n - 1;
		int b2 = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s[i][j] = Integer.parseInt(tempVar2);
				}
				if (s[i][j] == 0)
				{
					if (i < a1)
					{
						a1 = i;
					}
					if (i > a2)
					{
						a2 = i;
					}
					if (j < b1)
					{
						b1 = j;
					}
					if (j > b2)
					{
						b2 = j;
					}
				}
			}
		}
		x = (b2 - b1 - 1) * (a2 - a1 - 1);
		System.out.printf("%d",x);
		return 0;
	}
}

