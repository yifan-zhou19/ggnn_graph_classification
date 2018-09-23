package <missing>;

public class GlobalMembers
{
	public static int[][] zl = new int[1000][1000];
	public static int Main()
	{
		int i;
		int j;
		int n;
		int a;
		int b;
		int s;
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
					zl[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (zl[i][j] == 0)
				{
					break;
				}
			}
		 if (zl[i][j] == 0)
		 {

					break;
		 }
		}
	a = i;
	b = j;
		for (i = n - 1;i > 0;i--)
		{
			 for (j = n - 1;j > 0;j--)
			 {
				if (zl[i][j] == 0)
				{
				 break;
				}
			 }
		if (zl[i][j] == 0)
		{
				 break;
		}
		}
		s = (i - a - 1) * (j - b - 1);
		System.out.printf("%d\n",s);
		return 0;
	}
}

