package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m = 0;
		int s;
		double n;
		double x;
		String one = new String(new char[500]);
		String two = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			one = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			two = tempVar3.charAt(0);
		}
		s = one.length();
		if (one.length() != two.length())
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;one.charAt(i) != '\0';i++)
			{
				if ((one.charAt(i) != 'A' && one.charAt(i) != 'G' && one.charAt(i) != 'T' && one.charAt(i) != 'C') || (two.charAt(i) != 'A' && two.charAt(i) != 'T' && two.charAt(i) != 'C' && two.charAt(i) != 'G'))
				{
					s = 0;
				}
				else
				{
					if (one.charAt(i) == two.charAt(i))
					{
						m++;
					}
				}
			}
			x = 1.0 * m / s;
			if (s == 0)
			{
				System.out.print("error");
			}
			else if (x > n)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

