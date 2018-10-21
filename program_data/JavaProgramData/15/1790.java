package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] s = new int[1000][1000];
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
		int log = 0;
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
					s[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (s[i][j] == 0)
				{
					log = 1;
					a = i;
					b = j;
					break;
				}
			}
			if (log != 0)
			{
				break;
			}
		}
		log = 0;
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if (s[i][j] == 0)
				{
					log = 1;
					c = i;
					d = j;
					break;
				}
			}
			if (log != 0)
			{
				break;
			}
		}
		System.out.printf("%d",(c - a - 1) * (d - b - 1));
		return 0;
	}

}

