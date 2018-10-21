package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String sz = new String(new char[256]);
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
				sz = tempVar2.charAt(0);
			}
			for (j = 0;sz.charAt(j);j++)
			{
				if (sz.charAt(j) == 'A')
				{
					sz = tangible.StringFunctions.changeCharacter(sz, j, sz.charAt(j) + 19);
				}
				else if (sz.charAt(j) == 'T')
				{
					sz = tangible.StringFunctions.changeCharacter(sz, j, sz.charAt(j) - 19);
				}
				else if (sz.charAt(j) == 'G')
				{
					sz = tangible.StringFunctions.changeCharacter(sz, j, sz.charAt(j) - 4);
				}
				else if (sz.charAt(j) == 'C')
				{
					sz = tangible.StringFunctions.changeCharacter(sz, j, sz.charAt(j) + 4);
				}
			}
			System.out.printf("%s\n",sz);
		}
		return 0;
	}




}

