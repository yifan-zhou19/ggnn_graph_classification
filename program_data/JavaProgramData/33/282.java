package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int j;
		int i;
		final String a = "";
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
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar2);
			}
			len = String.valueOf(a.charAt(i)).length();
			for (j = 0;j < len;j++)
			{
				if (a.charAt(i)[j] == 'A')
				{
					a.charAt(i)[j] = 'T';
				}
				else if (a.charAt(i)[j] == 'C')
				{
					a.charAt(i)[j] = 'G';
				}
				else if (a.charAt(i)[j] == 'G')
				{
					a.charAt(i)[j] = 'C';
				}
				else if (a.charAt(i)[j] == 'T')
				{
					a.charAt(i)[j] = 'A';
				}
			}
			System.out.printf("%s\n",a.charAt(i));
		}
		return 0;
	}
}

