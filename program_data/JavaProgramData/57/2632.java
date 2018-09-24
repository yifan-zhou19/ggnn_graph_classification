package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int t;
		int n;
		int l;
		int k;
		String a = new String(new char[30]);
		String b = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < 30;j++)
		{
			a = tangible.StringFunctions.changeCharacter(a, j, '\0');
		}
		for (j = 0;j < 1000;j++)
		{
			b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		}
		for (i = 0,k = 0;i < n;i++)
		{
			for (j = 0;j < 30;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, '\0');
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();
			if (a.charAt(l - 1) == 'r' && a.charAt(l - 2) == 'e')
			{
				for (j = k,t = 0;t < l - 2;j++,t++)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(t));
				}
				b = tangible.StringFunctions.changeCharacter(b, j, '\n');
				k = k + l - 1;
			}
			else if (a.charAt(l - 1) == 'y' && a.charAt(l - 2) == 'l')
			{
				for (j = k,t = 0;t < l - 2;j++,t++)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(t));
				}
				b = tangible.StringFunctions.changeCharacter(b, j, '\n');
				k = k + l - 1;
			}
			else if (a.charAt(l - 1) == 'g' && a.charAt(l - 2) == 'n' && a.charAt(l - 3) == 'i')
			{
				for (j = k,t = 0;t < l - 3;j++,t++)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(t));
				}
				b = tangible.StringFunctions.changeCharacter(b, j, '\n');
				k = k + l - 2;
			}
			else
			{
				for (j = k,t = 0;t < l;j++,t++)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(t));
				}
				b = tangible.StringFunctions.changeCharacter(b, j, '\n');
				k = k + l + 1;
			}
		}
				System.out.printf("%s",b);
	}
}

