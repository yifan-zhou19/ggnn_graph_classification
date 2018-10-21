package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 2;
		int i = 0;
		int j = 0;
		String str = new String(new char[500]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = str.length();
		int p = 0;
		for (k = 2; k <= len; k++)
		{
			for (i = 0; i <= len - k; i++)
			{
				p = 0;
				for (j = i; j < i + k / 2; j++)
				{
					if (str.charAt(j) != str.charAt(2 * i + k - 1 - j))
					{
						break;
					}
					else
					{
						p++;
					}
					if (p == k / 2)
					{
						for (int t = i; t <= i + k - 1; t++)
						{
							System.out.print(str.charAt(t));
						}
						System.out.print("\n");
					}
				}
			}
		}

				return 0;
	}

}

