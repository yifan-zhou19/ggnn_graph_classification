package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[500]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l = str.length();
		int i;
		int j;
		int m = 1;
		int count = 0;
		for (m = 1; m < l; m++)
		{
			for (i = 0; i < l - m; i++)
			{
				count = 0;
				for (j = 0; j <= m / 2 + 1; j++)
				{
					if (str.charAt(i + j) != str.charAt(i + m - j))
					{
						continue;
					}
					else
					{
						count++;
					}
				}
				if (count >= j)
				{
					for (j = i; j <= i + m; j++)
					{
						System.out.print(str.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

