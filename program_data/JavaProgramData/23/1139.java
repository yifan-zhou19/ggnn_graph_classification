package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int m = 1;
		char s;
		final String a = "";
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			if (s = System.in.read() == '\n')
			{
				break;
			}

		}
		System.out.printf("%s",a.charAt(i));
		for (j = i - 1;j >= 0;j--)
		{
			System.out.printf(" %s",a.charAt(j));
		}
		return 0;
	}
}

