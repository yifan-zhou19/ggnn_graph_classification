package <missing>;

public class GlobalMembers
{
	// ??????.cpp : Defines the entry point for the console application.
	//


	public static void Main(String[] args)
	{
		String zfc = new String(new char[120]);
		char cha;
		char i;
		char j;
		char len;
		while (scanf("%s",zfc) != EOF)
		{
			cha = 0;
			len = zfc.length();
			System.out.printf("%s\n",zfc);
			for (i = 0;i < len;i++)
			{
				if (zfc.charAt(i) != '(' && zfc.charAt(i) != ')')
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, i, ' ');
				}
				if (zfc.charAt(i) == ')')
				{
					for (j = i - 1;j >= 0;j--)
					{
						if (zfc.charAt(j) == '(')
						{
							zfc = tangible.StringFunctions.changeCharacter(zfc, j, ' ');
							zfc = tangible.StringFunctions.changeCharacter(zfc, i, ' ');
							break;
						}
					}
					if (j < 0)
					{
						zfc = tangible.StringFunctions.changeCharacter(zfc, i, '?');
					}
				}
			}
			for (i = 0;i < len;i++)
			{
				if (zfc.charAt(i) == '(')
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, i, '$');
				}
			}
			System.out.println(zfc);
		}
	}


}

