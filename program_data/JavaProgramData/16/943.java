package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[5]);
		int i;
		int j;
		for (i = 0; i < 5; i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			if (a.charAt(i) == '\n')
			{
				for (j = i; j < 5; j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, '\0');
				}
				break;
			}
		}
		for (i = 4; i >= 0; i--)
		{
			if (a.charAt(i) != '\0')
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
	}
}

