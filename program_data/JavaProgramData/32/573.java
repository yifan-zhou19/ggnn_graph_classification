package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int x;
		int y;
		int d;
		int n;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}


		for (j = 1;j <= n;j++)
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

				x = a.length();
				y = b.length();
	System.out.print("\n");
				d = x - y;
				k = 0;

				for (i = x - 1;i >= d;i--)
				{
				if (a.charAt(i) < b.charAt(i - d))
				{
						a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - b.charAt(i - d) + 58);
						a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - 1);
						k++;
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - b.charAt(i - d) + 48);
					k++;
				}
				}
				for (i = x - 1;i > 0;i--)
				{
					if (a.charAt(i) < 48)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 10);
						a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - 1);
					}
				}
	if (a.charAt(0) == 48)
	{
	k = 1;
	}
	else
	{
	k = 0;
	}
	for (i = k;i < x;i++)
	{
		System.out.printf("%c",a.charAt(i));
	}
	System.out.print("\n");

		}
	}
}

