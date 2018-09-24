package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[500]);
		String part = new String(new char[500]);
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		int length = str.length();
		for (int i = 2;i <= length;i++)
		{
			for (int m = 0;m < length - i + 1;m++)
			{
				for (int j = 0;j < i;j++)
				{
					part = tangible.StringFunctions.changeCharacter(part, j, str.charAt(j + m));
				}
				part = tangible.StringFunctions.changeCharacter(part, i, '\0');
				for (k = 0;k < i / 2;k++)
				{
					if (part.charAt(k) != part.charAt(i - k - 1))
					{
						break;
					}
				}
				if (k == i / 2)
				{
					System.out.printf("%s\n",part);
				}
			}
		}
		return 0;
	}
}

