package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String x = "0";
		int length;
		int i;
		int j;
		int m;
		int t;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = tempVar.charAt(0);
		}
		length = x.length();
		for (i = 2;i <= length;i++)
		{
			for (j = 0;j + i - 1 < length;j++)
			{
				m = 0;
				for (t = 0;t < i / 2;t++)
				{
					if (x.charAt(j + t) != x.charAt(i + j - 1 - t))
					{
					m = 1;
					}
				}
				if (m == 0)
				{
					for (w = j;w <= i + j - 1;w++)
					{
						System.out.printf("%c",x.charAt(w));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

