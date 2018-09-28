package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[502]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		int len1;
		int len2;
		len1 = str.length();
		for (len2 = 2; len2 < len1; len2++)
		{
			for (i = 0; i < len1; i++)
			{
				for (j = i; j < i + len2; j++)
				{
					if (str.charAt(j) != str.charAt(2 * i + len2 - 1 - j))
					{
						break;
					}
				}
				if (j == i + len2)
				{
					for (j = i; j < i + len2; j++)
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

