package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int l;
		int m;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;n > 0;n--)
		{
			i = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			l = b.length();
			m = a.length();
			while (i <= l)
			{
				if (a.charAt(m - i) >= b.charAt(l - i))
				{
					a = tangible.StringFunctions.changeCharacter(a, m - i, a.charAt(m - i) - b.charAt(l - i) + 48);
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, m - i, a.charAt(m - i) + 58 - b.charAt(l - i));
					a = tangible.StringFunctions.changeCharacter(a, m - i - 1, a.charAt(m - i - 1) - 1);
				}
				i++;
			}
			for (i = m - l - 1;m >= 0;m--)
			{
				if (a.charAt(i) < '0')
				{
					a.charAt(i) += 10;
					a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - 1);
				}
				else
				{
					break;
				}
			}
			System.out.printf("%s\n",a);
		}
	}
}

