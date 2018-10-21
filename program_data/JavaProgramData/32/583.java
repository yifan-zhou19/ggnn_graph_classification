package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int c;
		int d;
		int j;
		int k;
		int x;
		int y;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String s = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
			for (j = c - 1,k = d - 1;k >= 0;k--,j--)
			{
			s = tangible.StringFunctions.changeCharacter(s, j, a.charAt(j) - b.charAt(k) + 48);
			}
			for (x = 0;x < c - d;x++)
			{
			s = tangible.StringFunctions.changeCharacter(s, x, a.charAt(x));
			}
			for (y = c - 1;y >= 0;y--)
			{
			if (s.charAt(y) >= 48 && s.charAt(y) <= 57)
			{
			s = tangible.StringFunctions.changeCharacter(s, y, s.charAt(y));
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, y, s.charAt(y) + 10);
				s = tangible.StringFunctions.changeCharacter(s, y - 1, s.charAt(y - 1) - 1);
			}
			}
			for (x = 0;x <= c - 1;x++)
			{
			System.out.printf("%c",s.charAt(x));
			}
			System.out.print("\n\n");
		}







	}
}

