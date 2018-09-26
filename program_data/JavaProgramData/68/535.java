package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int a;
		int b;
		int m;
		int t;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			x = 0;
			for (a = 3;a <= i - 3;a = a + 2)
			{
				if (a == 3)
				{
					int b = i - a;
					if (b == 3)
					{
						x = 1;
						System.out.printf("%d=%d+%d\n",i,a,b);
					}
					else
					{
						for (t = 3;t <= Math.sqrt(b);t = t + 2)
						{
							if (b % t == 0)
							{
								break;
							}
						}
						if (b % t != 0)
						{
							x = 1;
							System.out.printf("%d=%d+%d\n",i,a,b);
						}
					}
				}
				else
				{
					for (m = 3;m <= Math.sqrt(a);m = m + 2)
					{
						if (a % m == 0)
						{
							break;
						}
					}
					if (a % m != 0)
					{
						int b = i - a;
						if (b == 3)
						{
							x = 1;
							System.out.printf("%d=%d+%d\n",i,a,b);
						}
						else
						{
							for (t = 3;t <= Math.sqrt(b);t = t + 2)
							{
								if (b % t == 0)
								{
									break;
								}
							}
							if (b % t != 0)
							{
								x = 1;
								System.out.printf("%d=%d+%d\n",i,a,b);
							}
						}
					}
				}
				if (x == 1)
				{
					break;
				}
			}
		}
	}
}

