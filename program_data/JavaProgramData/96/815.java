package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1100]);
		String stre = new String(new char[1100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		int a = str.length();
		int l = (str.charAt(0) - '0');
		int t;
		int i;
		int j;
		int x = 0;
		int y;
		if (((a == 2) && (str.charAt(1) - '0') < 3 && (str.charAt(0) - '0') == 1) || (a == 1))
		{
			System.out.print("0");
			System.out.printf("\n%s",str);
		}
		else if ((a > 2) || (a == 2 && (str.charAt(0) - '0') * 10 + (str.charAt(1) - '0') >= 13))
		{
		for (i = 0;i < a - 1;i++)
		{
			t = l % 13;
			stre = tangible.StringFunctions.changeCharacter(stre, i, l / 13 + '0');
			l = t * 10 + str.charAt(i + 1) - '0';
		}
		stre = tangible.StringFunctions.changeCharacter(stre, a - 1, l / 13 + '0');
		for (i = 0;i < a;i++)
		{
			if ((stre.charAt(i) - '0') != 0)
			{
				x++;
			}
			if (x != 0)
			{
				System.out.printf("%c",stre.charAt(i));
			}
		}
		y = l % 13;
		System.out.printf("\n%d",y);
		}

		return 0;
	}


}

