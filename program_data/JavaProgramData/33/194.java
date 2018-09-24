package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		int j;
		String a = new String(new char[256]);
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
			len = a.length();
			for (j = 0;j < len;j++)
			{
				switch (a.charAt(j))
				{
				case 65:
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 84);
					break;
				}
				case 84:
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 65);
					break;
				}
				case 71:
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 67);
					break;
				}
				case 67:
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 71);
					break;
				}
				}
			}
			a = a.substring(0, len);
			System.out.printf("%s\n",a);
		}
		return 0;
	}
}

