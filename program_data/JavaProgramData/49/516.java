package <missing>;

public class GlobalMembers
{
	public static String c = new String(new char[500]);
	public static int f(int e0, int s0)
	{
		int i0;
		int sum = 0;

		for (i0 = s0;i0 <= e0;i0++)
		{
			if (c.charAt(i0) != c.charAt(s0 + e0 - i0))
			{
				sum++;
			}
		}
		if (sum == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int e;
		int s;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		int len;
		len = c.length();
		for (i = 0;i < len;i++)
		{
			for (j = 0;j < len;j++)
			{
				if (j - i >= 0 && i + j + 1 <= len)
				{
					if (c.charAt(j - i) == c.charAt(i + j + 1))
					{
						s = j - i;
						e = i + j + 1;
						if (f(e, s) != 0)
						{
						for (k = s;k <= e;k++)
						{
							System.out.printf("%c",c.charAt(k));
						}
						System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}
}

