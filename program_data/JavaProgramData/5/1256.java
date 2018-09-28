package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b = 0;
		double c = 0;
		double l1 = 0;
		double l2 = 0;
		int i;
		int t = 0;
		String m = new String(new char[501]);
		String n = new String(new char[501]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = tempVar3.charAt(0);
		}

		l1 = m.length();
		l2 = n.length();

		if (l1 != l2)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0; i < l1; i++)
			{
				if ((m.charAt(i) == 'A' || m.charAt(i) == 'T' || m.charAt(i) == 'C' || m.charAt(i) == 'G') && (n.charAt(i) == 'A' || n.charAt(i) == 'T' || n.charAt(i) == 'C' || n.charAt(i) == 'G'))
				{
					t++;
				}
			}

			if (t != l1)
			{
				System.out.print("error\n");
			}
			else
			{
				b = l1;
				for (i = 0; i < l1; i++)
				{
					if (m.charAt(i) == n.charAt(i))
					{
						c++;
					}
				}

				if (c / b > a)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}
		}
		return 0;
	}

}

