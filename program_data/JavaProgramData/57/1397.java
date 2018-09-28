package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[500]);
		int i;
		int n;
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
			if (sz.charAt(sz.length() - 1) == 'r')
			{
				sz = tangible.StringFunctions.changeCharacter(sz, sz.length() - 2, '\0');
			}
		   if (sz.charAt(sz.length() - 1) == 'y')
		   {
			   sz = tangible.StringFunctions.changeCharacter(sz, sz.length() - 2, '\0');
		   }
		   if (sz.charAt(sz.length() - 1) == 'g')
		   {
			   sz = tangible.StringFunctions.changeCharacter(sz, sz.length() - 3, '\0');
		   }
		  System.out.printf("%s\n",sz);
		}
		return 0;
	}

}

