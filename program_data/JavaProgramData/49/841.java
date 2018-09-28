package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[500]);
		int i;
		int j;
		int k;
		int l;
		int m;
		int t = 1;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		i = str.length();
		for (j = 1;j <= i - 1;j++)
		{
			for (k = 0;k <= i - j - 1;k++)
			{
				if (j % 2 != 0)
				{
					for (l = 0;l <= (j - 1) / 2;l++)
					{
						if (str.charAt(k + l) != str.charAt(k + j - l))
						{
							t = 0;
							break;
						}
					}
				}
				else
				{
					for (l = 0;l <= (j / 2) - 1;l++)
					{
						if (str.charAt(k + l) != str.charAt(k + j - l))
						{
							t = 0;
							break;
						}
					}
				}
				if (t == 1)
				{
					for (m = k;m <= k + j;m++)
					{
						System.out.print(str.charAt(m));
					}
					System.out.print("\n");
				}
				t = 1;
			}
		}
		return 0;
	}
}

