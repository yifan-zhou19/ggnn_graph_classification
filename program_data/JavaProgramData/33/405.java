package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int len;
		String z = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a <= n - 1;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z = tempVar2.charAt(0);
			}
			len = z.length();
			for (b = 0;b <= len - 1;b++)
			{
				if (z.charAt(b) == 'A')
				{
					z = tangible.StringFunctions.changeCharacter(z, b, 'T');
					continue;
				}
				if (z.charAt(b) == 'T')
				{
					z = tangible.StringFunctions.changeCharacter(z, b, 'A');
					continue;
				}
				if (z.charAt(b) == 'G')
				{
					z = tangible.StringFunctions.changeCharacter(z, b, 'C');
					continue;
				}
				if (z.charAt(b) == 'C')
				{
					z = tangible.StringFunctions.changeCharacter(z, b, 'G');
					continue;
				}
			}
			System.out.printf("%s\n",z);
		}
		return 0;
	}
}

