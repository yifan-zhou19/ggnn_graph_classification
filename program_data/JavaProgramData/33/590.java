package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	String sz = new String(new char[500]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz = tempVar2.charAt(0);
		}
		for (k = 0;sz.charAt(k) != '\0';k++)
		{
			if (sz.charAt(k) == 'A')
			{
				sz = tangible.StringFunctions.changeCharacter(sz, k, 'T');
			}
			else if (sz.charAt(k) == 'T')
			{
				sz = tangible.StringFunctions.changeCharacter(sz, k, 'A');
			}
			else if (sz.charAt(k) == 'G')
			{
				sz = tangible.StringFunctions.changeCharacter(sz, k, 'C');
			}
			else if (sz.charAt(k) == 'C')
			{
				sz = tangible.StringFunctions.changeCharacter(sz, k, 'G');
			}
		}
		sz = tangible.StringFunctions.changeCharacter(sz, k, '\0');
		System.out.printf("%s\n",sz);
	}
		return 0;
	}

}

