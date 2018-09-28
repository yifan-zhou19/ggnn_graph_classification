package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
		int n;
		int i;
		int j;
		int k;
		int p;
		int c1;
		int c2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			c1 = 0;
			c2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			for (;(a.charAt(c1) <= 58) && (a.charAt(c1) >= 48);c1++)
			{
			}
			for (;(b.charAt(c2) <= 58) && (b.charAt(c2) >= 48);c2++)
			{
			}
			k = 0;
			for (i = c1 - c2;i < c1;i++)
			{
				if (a.charAt(i) - b.charAt(k) >= 0)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - b.charAt(k) + 48);
				}
				else if (a.charAt(i) - b.charAt(k) < 0)
				{
					for (p = i - 1;a.charAt(p) == 48;p--)
					{
						a = tangible.StringFunctions.changeCharacter(a, p, a.charAt(p) + 9);
					}
					if (a.charAt(p) != 48)
					{
						a = tangible.StringFunctions.changeCharacter(a, p, a.charAt(p) - 1);
					}
					else
					{
					}
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - b.charAt(k) + 48 + 10);
				}
				k++;
			}
			System.out.printf("%s\n",a);
		}

	}

}

