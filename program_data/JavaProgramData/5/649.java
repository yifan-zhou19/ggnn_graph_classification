package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double e = 0;
		int i;
		int d = 0;
		int f;
		int g;
		String b = new String(new char[500]);
		String c = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		f = b.length();
		g = c.length();
		if (f != g)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < f;i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < g;i++)
		{
			if (c.charAt(i) != 'A' && c.charAt(i) != 'T' && c.charAt(i) != 'G' && c.charAt(i) != 'C')
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < f;i++)
		{
			if (b.charAt(i) == c.charAt(i))
			{
				d++;
			}
		}
		e = 1.0 * d / g;



		if (e >= a)
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

