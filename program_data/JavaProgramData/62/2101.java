package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i;
		int j;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			if (a.charAt(i) == 32 && a.charAt(i - 1) == 32)
			{
				i--;
			}
			if (a.charAt(i) == '\n')
			{
				break;
			}
		}
		for (j = 0;j <= i - 1;j++)
		{
			System.out.printf("%c",a.charAt(j));
		}
		return 0;
	}

}

