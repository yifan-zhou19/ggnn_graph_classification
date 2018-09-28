package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int t;
		String a = new String(new char[6]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;i < 6;i++)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
			j = j + 1;
		}
		for (i = 0;i <= (j - 1) / 2;i++)
		{
			t = a.charAt(j - 1 - i);
			a = tangible.StringFunctions.changeCharacter(a, j - 1 - i, a.charAt(i));
			a = tangible.StringFunctions.changeCharacter(a, i, t);
		}
		for (i = 0;i <= j;i++)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
			System.out.printf("%c",a.charAt(i));
		}
		return 0;
	}
}

