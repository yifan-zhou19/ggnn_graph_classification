package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int n;
		int k;
		int l = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			j = Integer.parseInt(tempVar3);
		}
		n = a.length();
		for (k = 0;k < n;k++)
		{
			if (a.charAt(k) >= 'A' && a.charAt(k) <= 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) - 'A' + 10);
			}
			else if (a.charAt(k) >= 'a' && a.charAt(k) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) - 'a' + 10);
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) - '1' + 1);
			}
		}
		for (k = 0;k < n;k++)
		{
			c = c * i + a.charAt(k);
		}
		for (k = 0;;k++)
		{
			b = tangible.StringFunctions.changeCharacter(b, k, c % j);
			if (b.charAt(k) >= 10)
			{
				b = tangible.StringFunctions.changeCharacter(b, k, b.charAt(k) - 10 + 'A');
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, k, b.charAt(k) + '1' - 1);
			}
			c = c / j;
			l = l++;
			if (c == 0)
			{
				break;
			}

		}
		for (k = 0;k < l;k++)
		{
			System.out.printf("%c",b.charAt(l - k - 1));
		}
	}

}

