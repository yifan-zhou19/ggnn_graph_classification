package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[501]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = str.length();
		int i = 0;
		int n = 0;
		int m = 0;
		int k = 0;
		int j = 0;
		int flag = 0;
		for (i = 2; i <= len; i++)
		{
			for (j = 0; j <= len - i; j++)
			{
				for (n = j, m = i + j - 1; n < m; n++, m--)
				{
					flag = 1;
					if (str.charAt(n) != str.charAt(m))
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					for (k = j; k <= i + j - 1; k++)
					{
						System.out.print(str.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

