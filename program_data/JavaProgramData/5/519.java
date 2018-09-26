package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int b;
		int c = 0;
		int d = 0;
		double x;
		double y = 0;
		String s = new String(new char[501]);
		String z = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			z = tempVar3.charAt(0);
		}
		for (i = 0;i < 501;i++)
		{
			if (s.charAt(i) == '\0')
			{
				break;
			}
			if ((s.charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'G' && s.charAt(i) != 'C') || (z.charAt(i) != 'A' && z.charAt(i) != 'T' && z.charAt(i) != 'C' && z.charAt(i) != 'G'))
			{
				c = 1;
			}
		}
		for (j = 1;j < 501;j++)
		{
			if (s.charAt(j) == '\0')
			{
				break;
			}
		}
		a = j;
		for (j = 1;j < 501;j++)
		{
			if (z.charAt(j) == '\0')
			{
				break;
			}
		}
		b = j;
		if (c == 1 || a != b)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < a;i++)
		{
			if (s.charAt(i) == z.charAt(i))
			{
				d++;
			}
		}
		y = (d - 1) * 1.0 / (a - 1);
		if (y >= x)
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

