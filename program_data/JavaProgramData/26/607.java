package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int k = -1;
		while (scanf("%c", c) != EOF)
		{
			if (!Character.isWhitespace(c))
			{
				k = -1;
			}
				else
				{
				k++;
				}
			if (Character.isWhitespace(c) && k != 0)
			{
				continue;
			}
			System.out.printf("%c", c);
		}
		return 0;
	}

}
