package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 3;a < m;a++)
		{
			for (c = 2;c <= Math.sqrt(a);c++)
			{
					if (a % c == 0)
					{
						break;
					}
			}
					if (c > Math.sqrt(a))
					{
						b = m - a;
						for (d = 2;d <= Math.sqrt(b);d++)
						{
							if (b % d == 0)
							{
								break;
							}
						}
						if (d > Math.sqrt(b) && a <= b)
						{
							System.out.printf("%d %d\n",a,b);
						}
					}
		}
	}

}

