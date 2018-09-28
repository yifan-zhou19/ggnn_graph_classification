package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		int n;
		int i;
		int j;
		int m;
		int b;
		int c;
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = s.length();
		for (i = 1; i < n; i++)
		{
			b = n - i - 1;
			for (m = 0; m <= b; m++)
			{
				c = 0;
				for (j = 0; j <= i; j++)
				{
					if (s.charAt(m + j) == s.charAt(m + i - j))
					{
						c++;
					}
				}
					if (c == i + 1)
					{
						for (j = m; j <= m + i; j++)
						{
							System.out.print(s.charAt(j));
						}
						System.out.print("\n");
					}
			}
		}
		return 0;
	}

}

