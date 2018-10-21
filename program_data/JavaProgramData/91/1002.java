package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int i;
		int l;
		for (i = 1;i <= 100;i++)
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
		l = i - 1;
		for (i = 1;i <= l - 1;i++)
		{
			System.out.printf("%c",a.charAt(i) + a.charAt(i + 1));
		}
		System.out.printf("%c",a.charAt(l) + a.charAt(1));
		return 0;
	}
}

