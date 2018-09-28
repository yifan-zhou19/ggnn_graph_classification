package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int d;
		int n;
		int t;
		String a = new String(new char[600]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (d = 1;d <= n;d++)
		{
			for (i = 0;i + d <= n - 1;i++)
			{
				if (a.charAt(i) == a.charAt(i + d))
				{
					t = 0;
					if (d % 2 == 1)
					{
						for (k = 0;k <= d / 2;k++)
						{
							if (a.charAt(i + k) == a.charAt(i + d - k))
							{
								t = t + 1;
							}
						}
						if (t == (d + 1) / 2)
						{
							for (k = i;k <= i + d;k++)
							{
								System.out.printf("%c",a.charAt(k));
							}
							System.out.print("\n");
						}
					}
					else
					{
						for (k = 0;k <= d / 2 - 1;k++)
						{
							if (a.charAt(i + k) == a.charAt(i + d - k))
							{
								t = t + 1;
							}
						}
						if (t == d / 2)
						{
							for (k = i;k <= i + d;k++)
							{
								System.out.printf("%c",a.charAt(k));
							}
							System.out.print("\n");
						}
					}
				}
				else
				{
					continue;
				}
			}
		}
		return 0;
	}
}

