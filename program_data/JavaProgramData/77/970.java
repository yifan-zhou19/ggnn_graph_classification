package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		char boy;
		char girl;
		int i;
		int j;
		int len;
		int end = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		len = c.length();
		boy = c.charAt(0);
		for (i = 1;i < len;i++)
		{
			if (c.charAt(i) != boy)
			{
				girl = c.charAt(i);
			}
		}


		while (true)
		{
			for (i = 0;i < len;i++)
			{
				if (c.charAt(i) == boy)
				{
					for (j = i + 1;j < len;j++)
					{
						if (c.charAt(j) == ' ')
						{
							continue;
						}
						if (c.charAt(j) == girl)
						{
							System.out.printf("%d %d\n",i,j);
							c = tangible.StringFunctions.changeCharacter(c, i, ' ');
							c = tangible.StringFunctions.changeCharacter(c, j, ' ');
							i = 0;
							break;
						}
						if (c.charAt(j) == boy)
						{
							break;
						}
					}
				}
			}
			for (i = 0;i < len;i++)
			{
				if (c.charAt(i) == ' ')
				{
					end++;
						if (end == len)
						{
							return 0;
						}
				}
				if (i == len - 1 && end < len)
				{
					end = 0;
				}
			}
		}
		return 0;

	}
}

