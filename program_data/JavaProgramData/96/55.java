package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		int[] b = new int[110];
		String c = new String(new char[110]);
		int i;
		int l;
		int s;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		for (i = 0;i < l;i++)
		{
			b[i] = a.charAt(i) - '0';
		}
		if (l == 1)
		{
			System.out.print("0\n");
			System.out.printf("%d\n",b[0]);
			return (0);
		}
		if (l == 2 && b[0] == 1 && b[1] <= 2)
		{
			System.out.print("0\n");
			System.out.printf("%d%d\n",b[0],b[1]);
			return (0);
		}
		else
		{
			if (b[0] == 1 && b[1] <= 2)
			{
				s = b[0] * 100 + b[1] * 10 + b[2];
				c = tangible.StringFunctions.changeCharacter(c, 0, s / 13 + '0');
				y = s % 13;
				for (i = 3;i < l;i++)
				{
					s = y * 10 + b[i];
					c = tangible.StringFunctions.changeCharacter(c, i - 2, s / 13 + '0');
					y = s % 13;
				}
				c = tangible.StringFunctions.changeCharacter(c, l - 2, '\0');
				System.out.printf("%s\n",c);
				System.out.printf("%d\n",y);
			}
			else
			{
				s = b[0] * 10 + b[1];
				c = tangible.StringFunctions.changeCharacter(c, 0, s / 13 + '0');
				y = s % 13;
				for (i = 2;i < l;i++)
				{
					s = y * 10 + b[i];
					c = tangible.StringFunctions.changeCharacter(c, i - 1, s / 13 + '0');
					y = s % 13;
				}
				c = tangible.StringFunctions.changeCharacter(c, l - 1, '\0');
				System.out.printf("%s\n",c);
				System.out.printf("%d\n",y);
			}
		}
	}
}

