package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[256]);
		String ans = new String(new char[256]);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			for (int j = 0;j <= 255;j++)
			{
				if (zfc.charAt(j) == 'A')
				{
					ans = tangible.StringFunctions.changeCharacter(ans, j, 'T');
				}
				if (zfc.charAt(j) == 'T')
				{
					ans = tangible.StringFunctions.changeCharacter(ans, j, 'A');
				}
				if (zfc.charAt(j) == 'G')
				{
					ans = tangible.StringFunctions.changeCharacter(ans, j, 'C');
				}
				if (zfc.charAt(j) == 'C')
				{
					ans = tangible.StringFunctions.changeCharacter(ans, j, 'G');
				}
				if (zfc.charAt(j) == '\0')
				{
					ans = tangible.StringFunctions.changeCharacter(ans, j, '\0');
				}
			}
			System.out.printf("%s\n",ans);
		}
		return 0;
	}

}

