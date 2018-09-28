package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] m = new int[100];
		int[] c = new int[100];
		int[] s = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (m[i] == 0)
			{
				s[i] = 60;
			}
			else
			{
				for (k = 1;k <= m[i];k++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						c[k] = Integer.parseInt(tempVar3);
					}
				}
				for (k = 1;k <= m[i];k++)
				{
					if ((c[k] + (k - 1) * 3 >= 57) && (c[k] + (k - 1) * 3 <= 60))
					{
						s[i] = c[k];
						k = k + m[i];
					}
					else
					{
						if (c[k] + (k - 1) * 3 > 60)
						{
							s[i] = c[k] - (c[k] + (k - 1) * 3 - 60);
							k = k + m[i];
						}
						else
						{
							if (k == m[i])
							{
							s[i] = 60 - 3 * k;
							}
						}
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%d\n",s[i]);
		}
		return 0;
	}
}

