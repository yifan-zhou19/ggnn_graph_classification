package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String zf = new String(new char[300]);
		String pd = new String(new char[300]);
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
			zf = tempVar2.charAt(0);
		}
		int l = zf.length();
		for (j = 0;j < l;j++)
		{
			if (zf.charAt(j) == 'A')
			{
				pd = tangible.StringFunctions.changeCharacter(pd, j, 'T');
				continue;
			}
			if (zf.charAt(j) == 'T')
			{
			pd = tangible.StringFunctions.changeCharacter(pd, j, 'A');
	continue;
			}
			if (zf.charAt(j) == 'C')
			{
				pd = tangible.StringFunctions.changeCharacter(pd, j, 'G');
				continue;
			}
			if (zf.charAt(j) == 'G')
			{
				pd = tangible.StringFunctions.changeCharacter(pd, j, 'C');
				continue;
			}
		}
		pd = tangible.StringFunctions.changeCharacter(pd, zf.length(), '\0');
			System.out.printf("%s\n",pd);
	}

	return 0;
	}




}

