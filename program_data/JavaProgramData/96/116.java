package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[99]);
		int x;
		int y;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		if (l == 1)
		{
			System.out.print("0\n");
		System.out.printf("%c",a.charAt(0));
		}
		else
		{
			for (int i = 1;i < l;i++)
			{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - '0');
			a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - '0');
			b = tangible.StringFunctions.changeCharacter(b, i - 1, (a.charAt(i) + a.charAt(i - 1) * 10) / 13 + '0');
			a = tangible.StringFunctions.changeCharacter(a, i, (a.charAt(i) + a.charAt(i - 1) * 10) % 13 + '0');
			}
		b = b.substring(0, l - 1);
		if (b.charAt(0) == '0' && b.charAt(1) != 0)
		{
					for (int j = 0;j < l;j++)
					{
						b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
					}
		}
		a = tangible.StringFunctions.changeCharacter(a, l - 1, a.charAt(l - 1) - '0');
		System.out.printf("%s\n",b);
		System.out.printf("%d",a.charAt(l - 1));
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

