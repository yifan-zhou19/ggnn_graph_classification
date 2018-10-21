package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a = 1;
		int b = 1;
		double n;
		double p = 0.0;
		double q;
		String d1 = new String(new char[500]);
		String d2 = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d2 = tempVar3.charAt(0);
		}

		if (d1.length() != d2.length())
		{
			a = 0;
		}
		if (a == 1)
		{
			for (i = 0;d1.charAt(i) != '\0';i++)
			{
				if ((d1.charAt(i) == 'A' || d1.charAt(i) == 'T' || d1.charAt(i) == 'C' || d1.charAt(i) == 'G') && (d2.charAt(i) == 'A' || d2.charAt(i) == 'T' || d2.charAt(i) == 'C' || d2.charAt(i) == 'G'))
				{
					b = 1;
				}
				else
				{
					b = 0;
					break;
				}
			}
		}
		if (a == 0 || b == 0)
		{
			System.out.print("error");
		}

		if (a == 1 && b == 1)
		{
			for (i = 0;d1.charAt(i) != '\0';i++)
			{
				if (d1.charAt(i) == d2.charAt(i))
				{
					p += 1.0;
				}
			}
			q = p / (d1.length());
			if (q > n)
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

