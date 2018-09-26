package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int n;
		int c;
		int d;
		int p;
		int i;
		int j = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = 1;p <= n;p++)
		{
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
			c = a.length();
			d = b.length();
			for (i = 1;i <= d;i++)
			{
				if (b.charAt(d - i) <= a.charAt(c - i))
				{
					a = tangible.StringFunctions.changeCharacter(a, c - i, a.charAt(c - i) - b.charAt(d - i) + 48);
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, c - i, a.charAt(c - i) - b.charAt(d - i) + 58);
					if (a.charAt(c - 1 - i) > 48)
					{
						a.charAt(c - 1 - i)--;
					}
					else
					{
						t = i;
						while (a.charAt(c - 1 - t) == 48)
						{
							a = tangible.StringFunctions.changeCharacter(a, c - 1 - t, 9 + 48);
							t++;
						}
						a.charAt(c - 1 - t)--;
					}
				}
			}
			while (a.charAt(j) == 48)
			{
				j++;
			}
			for (;j < c;j++)
			{
				System.out.printf("%c",a.charAt(j));
			}
			j = 0;
			System.out.print("\n");
		}
	}

}

