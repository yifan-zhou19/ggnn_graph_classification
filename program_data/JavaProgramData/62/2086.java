package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[101]);
		char i;
		char j = 1;
		char k;
		for (j = 1;;j++)
		{
			c = tangible.StringFunctions.changeCharacter(c, j, System.in.read());
			if (c.charAt(j) == '\n')
			{
				break;
			}
		}
		for (i = 1;i <= j;i++)
		{
			if (c.charAt(i) == ' ')
			{
				for (k = i + 1;;k++)
				{
					if (c.charAt(k) == ' ')
					{
						c = tangible.StringFunctions.changeCharacter(c, k, 1);
					}
					else
					{
						break;
					}
				}
			}
		}
		for (k = 1;k <= j;k++)
		{
			if (c.charAt(k) != 1)
			{
				System.out.print(c.charAt(k));
			}
		}
		return 0;
	}
}

