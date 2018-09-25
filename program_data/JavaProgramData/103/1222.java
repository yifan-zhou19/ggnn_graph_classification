package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1002]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int i;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) > 'Z')
			{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			}
		}
		int l = 1;
		for (i = 1;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == a.charAt(i - 1))
			{
			l++;
			}
		else
		{
			System.out.printf("(%c,%d)",a.charAt(i - 1),l);
			l = 1;
		}
		}
		System.out.printf("(%c,%d)",a.charAt(i - 1),l);

	}


}

