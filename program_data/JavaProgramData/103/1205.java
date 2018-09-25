package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int i;
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			}
		}
		int t = 1;
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == a.charAt(i + 1))
			{
				t++;
			}
			else
			{
				System.out.printf("(%c,%d)",a.charAt(i),t);
				t = 1;
			}
		}

	}
}

