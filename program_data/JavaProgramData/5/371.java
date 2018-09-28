package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int c;
		int d;
		double n;
		String xl1 = new String(new char[500]);
		String xl2 = new String(new char[500]);
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			xl1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			xl2 = tempVar3.charAt(0);
		}
		a = xl1.length();
		b = xl2.length();
		if (a != b)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < a;i++)
			{
				if ((xl1.charAt(i) != 'A' && xl1.charAt(i) != 'T' && xl1.charAt(i) != 'G' && xl1.charAt(i) != 'C') || (xl2.charAt(i) != 'A' && xl2.charAt(i) != 'T' && xl2.charAt(i) != 'G' && xl2.charAt(i) != 'C'))
				{
					System.out.print("error");
					d = 0;
					break;
				}
				else
				{
					if (xl1.charAt(i) == xl2.charAt(i))
					{
						c++;
					}
				}
			}
				if (1.0 * c / a > n && d != 0)
				{
					 System.out.print("yes");
				}
				else if (1.0 * c / a <= n != 0 && d != 0)
				{
					  System.out.print("no");
				}

		}

		return 0;
	}
}

