package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String string = "";
		final String subString = "";
		final String replacement = "";
		int i = 0;
		int j = 0;
		int k = 0;
		char c = '\0';
		while (c != '\n')
		{
			c = System.in.read();
			if (c != '\n')
			{
				String[i] = c;
				i++;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			subString = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			replacement = tempVar2.charAt(0);
		}
		for (i = 0;i < String.length();i++)
		{
			if (String[i] == subString.charAt(0))
			{
				k = i;
				for (j = 0;j < subString.length();j++,k++)
				{
					if (subString.charAt(j) != string.charAt(k))
					{
						break;
					}
				}
				if (j == subString.length())
				{
					k = i;
					for (j = 0;j < replacement.length();j++,k++)
					{
						String[k] = replacement.charAt(j);
					}
					break;
				}
			}
		}
		System.out.printf("%s\n",String);
		return 0;
	}

}

