package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[] t = new int[10];
		int s;
		int k = 60;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.printf("%d\n",k);
			}
			else if (m > 0)
			{
				for (j = 0;j < m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						t[j] = Integer.parseInt(tempVar3);
					}
					if ((t[j] + 3 * (j + 1)) <= 60)
					{
						s = t[j] + 60 - (t[j] + 3 * (j + 1));
					}
					else if ((t[j] + 3 * j) <= 60)
					{
						s = t[j];
					}
				}
				System.out.printf("%d\n",s);
			}
		}
		return 0;
	}
}

