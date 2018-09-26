package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int l;
		String z = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)


		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z = tempVar2.charAt(0);
			}
			l = z.length();
		for (i = 0;i < l;i++)
		{
			if (z.charAt(i) == 'A')
			{
				z = tangible.StringFunctions.changeCharacter(z, i, 'T');
			}
			else
			{
				if (z.charAt(i) == 'T')
				{
					z = tangible.StringFunctions.changeCharacter(z, i, 'A');
				}
				else
				{
					if (z.charAt(i) == 'C')
					{
						z = tangible.StringFunctions.changeCharacter(z, i, 'G');
					}
					else
					{
						z = tangible.StringFunctions.changeCharacter(z, i, 'C');
					};
				};
			};
		}

		System.out.printf("%s\n",z);
		}
	return 0;
	}
}

