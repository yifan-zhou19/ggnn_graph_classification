package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1002]);
		int i;
		int j;
		for (i = 1;i <= 1000;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, ' ');
		}
		for (i = 1;i <= 1000;i++)
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
		for (i = 1;i <= 1000;i++)
		{
			if (a.charAt(i) != ' ')
			{
				System.out.printf("%c",a.charAt(i));
				break;
			}
		}
		for (j = i + 1;j <= 999;j++)
		{
			if ((a.charAt(j) != ' ' || (a.charAt(j) == ' ' && a.charAt(j + 1) != ' ')) && (a.charAt(i) >= 32 && a.charAt(i) <= 122))
			{
				System.out.printf("%c",a.charAt(j));
			}
		}
		return 0;
	}

}

