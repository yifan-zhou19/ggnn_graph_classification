package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int a;
		int b;
		int k = 0;
		int dao;
		int p;
		int t;
		int j;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			t = 0;
			dao = 0;
			p = i;
			j = p % 10;
			while (j != 0 || dao < i)
			{
				dao = 10 * dao + j;
				f = dao;
				p = p / 10;
				j = p % 10;
			}
			if (dao == i)
			{
				for (j = 2;j <= i / 2;j++)
				{
					if (i % j == 0)
					{
						t = 1;
					}
				}
				if (t == 0)
				{
					if (k == 0)
					{
						System.out.printf("%ld",i);
						k = 1;
					}
					else
					{
						System.out.printf(",%ld",i);
					}
				}
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

