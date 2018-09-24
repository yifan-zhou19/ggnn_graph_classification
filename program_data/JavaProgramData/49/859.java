package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[500]);
		int i;
		int j;
		int h;
		int n;
		int t;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		h = c.length();
		for (i = 2;i <= h;i++)
		{
			for (j = 0;j <= h - i;j++)
			{
				n = -1;
				t = j;
				f = 2 * j + i - 1;
				while (t < j + i)
				{
					if (c.charAt(t) == c.charAt(f - t))
					{
						n = t;
						t++;
					}
					else
					{
						break;
					}
				}
				if (n == i + j - 1)
				{
					for (t = j;t < j + i;t++)
					{
						System.out.printf("%c",c.charAt(t));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}


}

