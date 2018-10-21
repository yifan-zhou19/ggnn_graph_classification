package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		int n;
		int i;
		int j;
		int k;
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
		k = a.length();
		for (j = k - 1;j >= 0;j--)
		{
			if (a.charAt(k - 1) == 'r' || a.charAt(k - 1) == 'y')
			{
			a = tangible.StringFunctions.changeCharacter(a, k - 1, '\0');
			a = tangible.StringFunctions.changeCharacter(a, k - 2, '\0');
				System.out.printf("%s\n",a);
			}
			if (a.charAt(k - 1) == 'g')
			{
					a = tangible.StringFunctions.changeCharacter(a, k - 1, '\0');
			a = tangible.StringFunctions.changeCharacter(a, k - 2, '\0');
			a = tangible.StringFunctions.changeCharacter(a, k - 3, '\0');
			System.out.printf("%s\n",a);
			}
		}

	}
	}
}

