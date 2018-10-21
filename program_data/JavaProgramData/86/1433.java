package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1000];
		int t;
		int i;
		int n;
		int m;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 1;a <= n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < m;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i] = Integer.parseInt(tempVar3);
				}
			}
			if (m == 0)
			{
				t = 60;
			}
			else
			{
			for (i = 0;i < m;i++)
			{
				if (sz[i] + 3 * i > 60)
				{
					t = 60 - 3 * i;
					break;
				}
				if ((sz[i] + 3 * i <= 60) && (sz[i] + 3 * i >= 57))
				{
					t = sz[i];
					break;
				}
				if ((sz[i] + 3 * i < 60) && (i == m - 1))
				{
					t = 60 - 3 * (i + 1);
					break;
				}
			}
			}
			System.out.printf("%d\n",t);
		}
		return 0;
	}

}

