package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[501]);
		int i;
		int j;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (j = 1; str.charAt(j) != '\0'; j++)
		{
			for (i = 0; str.charAt(i) != '\0'; i++)
			{
				for (int l = j, p = 0; l >= 1; p++, l--)
				{
					if (str.charAt(i + p) != str.charAt(i + l))
					{
						break;
					}
					if (l <= 2)
					{
						for (int k = i; k <= i + j; k++)
						{
							System.out.print(str.charAt(k));
						}
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}
}

