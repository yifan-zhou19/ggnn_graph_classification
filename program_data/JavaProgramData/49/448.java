package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[500]);

	public static int huiwen(int i, int length)
	{
				int j;
				int p = i + length - 1;
				for (j = i; j <= (2 * i + length) / 2 ; j++)
				{
					if (str.charAt(j) != str.charAt(p))
					{
						return 0;
					}
						p--;
				}

				return 1;
	}

	public static int Main()
	{
			int length;
			int i = 0;
			int j;
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (length = 2; str.charAt(length - 1) != '\0';length++)
			{
				for (i = 0;str.charAt(i + length - 1) != '\0'; i++)
				{
					if (huiwen(i, length) != 0)
					{
						for (j = i; j < i + length; j++)
						{
							if (j == i + length - 1)
							{
								System.out.print(str.charAt(j));
								System.out.print("\n");
							}
							else
							{
								System.out.print(str.charAt(j));
							}
						}
					}
				}
			}
		return 0;
	}
}

