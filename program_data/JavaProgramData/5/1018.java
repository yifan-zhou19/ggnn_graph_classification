package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int c;
		int i;
		int j1;
		int j;
		double a;
		double m;
		double n;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s2 = tempVar3.charAt(0);
		}
		if (s1.length() != s2.length())
		{
			System.out.print("error");
			return 0;
		}
		else
		{
			for (i = 0;s1.charAt(i) != '\0';i++)
			{
				if (s1.charAt(i) != 'A' && s1.charAt(i) != 'G' && s1.charAt(i) != 'C' && s1.charAt(i) != 'T' || s2.charAt(i) != 'A' && s2.charAt(i) != 'G' && s2.charAt(i) != 'C' && s2.charAt(i) != 'T')
				{
					System.out.print("error");
					return 0;
				}
				else
				{
					if (s1.charAt(i) == s2.charAt(i))
					{
						c++;
					}
				}
			}
		}
		m = 1.0 * s1.length();
		n = 1.0 * c;
		if (n / m > a)
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

