package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		final String d = "";
		for (i = 0;i < n;i++)
		{
			final String a = "";
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d = tempVar2.charAt(0);
			}
			for (j = 0;d.charAt(j) != '\0';j++)
			{
				if (d.charAt(j) == 'A')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'T');
				}
				if (d.charAt(j) == 'T')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'A');
				}
				if (d.charAt(j) == 'C')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'G');
				}
				if (d.charAt(j) == 'G')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'C');
				}
			}
			System.out.printf("%s\n",a);
		}
		return 0;
	}

}

