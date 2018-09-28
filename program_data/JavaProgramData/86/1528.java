package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int s;
		int[] t = new int[60];
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
				s = 60;
			}
			else
			{
				for (j = 0;j < m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						t[j] = Integer.parseInt(tempVar3);
					}
				}
				for (j = 0;j < m;j++)
				{
					if (t[j] + 3 * (j + 1) < 60)
					{
						s = 60 - 3 * (j + 1);
					}
					else if (t[j] + 3 * j < 60)
					{
						s = t[j];
						break;
					}
					else if (t[j] < 60)
					{
						s = 60 - 3 * j;
						break;
					}
				}
			}
			System.out.printf("%d\n",s);
		}
		return 0;
	}
}

