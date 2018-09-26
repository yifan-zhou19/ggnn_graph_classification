package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int l;
		String a = new String(new char[33]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			if (a.charAt(a.length() - 1) == 'g')
			{
				a = tangible.StringFunctions.changeCharacter(a, a.length() - 3, '\0');
				System.out.printf("%s\n",a);
			}
			if (a.charAt(a.length() - 1) == 'r' || a.charAt(a.length() - 1) == 'y')
			{
				a = tangible.StringFunctions.changeCharacter(a, a.length() - 2, '\0');
				System.out.printf("%s\n",a);
			}
		}
		return 0;
	}

}

