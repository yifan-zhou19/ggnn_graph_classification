package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int k;
		int i;
		int j;
		int t;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i = i + 2)
		{
						t = (int)Math.sqrt(i);
						s = 0;
						for (k = 3;k <= t;k = k + 2)
						{
							s = 0;
						if (i % k == 0)
						{
							s = 1;
							break;
						}
						}
						if (s == 0)
						{
								j = m - i;
								t = (int)Math.sqrt(j);
								for (k = 3;k <= t;k = k + 2)
								{
									s = 0;
									if (j % k == 0)
									{
										s = 1;
										break;
									}
								}
								if (s == 0)
								{
								System.out.printf("%d %d\n",i,j);
								}
						}
		}
	}

}

