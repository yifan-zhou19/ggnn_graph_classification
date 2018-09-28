package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		int n;
		int i;
		int j = 2;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		n = s.length();
		for (;j <= n;j++)
		{
			if (j % 2 != 0)
			{
				m = (j + 1) / 2;
			}
			else
			{
				m = j / 2;
			}
			for (k = 0;k <= n - j;k++)
			{
				for (i = k;i <= m + k - 1;i++)
				{
					if (s.charAt(i) != s.charAt(j + 2 * k - 1 - i))
					{
						break;
					}
				}
				if (i == m + k)
				{
					for (i = k;i <= j + k - 1;i++)
					{
						System.out.printf("%c",s.charAt(i));
					}
					System.out.print("\n");
				}
			}
		}
	}
}

