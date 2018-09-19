package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		String a = new String(new char[6]);
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			if (a.charAt(i) == '\n')
			{
				break;
			}
		}
		for (j = i - 1;j > -1;j--)
		{
			System.out.printf("%c",a.charAt(j));
		}
	}
}

