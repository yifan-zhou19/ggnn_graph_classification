package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int b;
		int c;
		int d;
		int e;
		int f;
		char[][] a = new char[1000][1000];
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
					a[i][j] = tempVar2.charAt(0);
				}
			}
		}
		c = -1;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					c = i;
					d = j;
				break;
				}
			}
			if (c != -1)
			{
				break;
			}
		}

		e = -1;
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if (a[i][j] == 0)
				{
					e = i;
					f = j;
					break;
				}
			}
			if (e != -1)
			{
				break;
			}
		}

		b = (e - c - 1) * (f - d - 1);
		System.out.printf("%d",b);
		return 0;
	}




}

