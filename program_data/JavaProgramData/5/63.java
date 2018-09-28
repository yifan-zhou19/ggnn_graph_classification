package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static String b = new String(new char[100]);
	public static String c = new String(new char[100]);
	public static int Main()
	{
		int sum = 0;
		double m;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
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
		int x;
		int y;
		x = a.length(),y = b.length();
		a = tangible.StringFunctions.changeCharacter(a, x, '\0');
		b = tangible.StringFunctions.changeCharacter(b, y, '\0');
		if (x != y)
		{
			System.out.print("error");
			return 0;
		}
		int i;
		for (i = 0;i < x;i++)
		{
			if (a.charAt(i) == 'A')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, 'A');
			}
			else if (a.charAt(i) == 'T')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, 'T');
			}
			else if (a.charAt(i) == 'C')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, 'C');
			}
			else if (a.charAt(i) == 'G')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, 'G');
			}
			else
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < x;i++)
		{
			if (b.charAt(i) == c.charAt(i))
			{
				sum++;
			}
		}
		s = 1.0 * sum / x;
		if (s >= m)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}












}

