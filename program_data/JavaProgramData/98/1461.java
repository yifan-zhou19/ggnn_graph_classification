package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l = 0;
	String a = new String(new char[40]);
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
	j = a.length();
	if (l == 0)
	{
		a = tangible.StringFunctions.changeCharacter(a, j, '\0');
		System.out.printf("%s",a);
		l = l + j + 1;
	}
	else
	{
	if (l + j <= 80)
	{
		a = tangible.StringFunctions.changeCharacter(a, j, '\0');
		System.out.printf(" %s",a);
		l = l + j + 1;
	}
	else
	{
		System.out.printf("\n%s",a);
		l = j + 1;
	}
	}
	}
	return 0;
	}

}

