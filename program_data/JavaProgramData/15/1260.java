package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] p = new int[row][row];
		int n;
		int word;
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
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
					p[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		word = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (word == 0)
				{
					if (p[i][j] == 0)
					{
						a = i;
						b = j;
						word = 1;
					}
				}
			}
		}
		word = 0;
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if (word == 0)
				{
					if (p[i][j] == 0)
					{
						c = i;
						d = j;
						word = 1;
					}
				}
			}
		}
		s = (c - a - 1) * (d - b - 1);
		System.out.printf("%d",s);
		return 0;
	}



}

