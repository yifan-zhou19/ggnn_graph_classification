package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[30]);
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		k = c.length();
		System.out.printf("%d",k);
		for (i = 0;i < k;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, '\0');
		}

		while (scanf("%s",c) != EOF)
		{
			k = c.length();
			System.out.printf(",%d",k);
			for (i = 0;i < k;i++)
			{
			c = tangible.StringFunctions.changeCharacter(c, i, '\0');
			}
		}
	}

}

