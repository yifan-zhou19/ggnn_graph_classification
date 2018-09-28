package <missing>;

public class GlobalMembers
{
	public static String line = new String(new char[101]);
	public static void Main()
	{
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			line = tempVar.charAt(0);
		}
		char boy = line.charAt(0);
		for (i = 1;i < line.length();i++)
		{
			if (line.charAt(i) == boy)
			{
				continue;
			}
			else if (line.charAt(i) != ' ')
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (line.charAt(j) == boy)
					{
						System.out.printf("%d %d\n",j,i);
						line = tangible.StringFunctions.changeCharacter(line, j, line[i] = ' ');
						break;
					}
				}
			}
		}
	}
}

