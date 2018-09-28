package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int l;
		int n;
		double d;
		double b;
		String x = new String(new char[501]);
		String y = new String(new char[501]);


		a = 0;
		l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = tempVar3.charAt(0);
		}
		n = x.length();

		if (x.length() != y.length())
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if ((x.charAt(i) != 'A' && x.charAt(i) != 'T' && x.charAt(i) != 'G' && x.charAt(i) != 'C') || (y.charAt(i) != 'A' && y.charAt(i) != 'T' && y.charAt(i) != 'G' && y.charAt(i) != 'C'))
				{
				   System.out.print("error");
				   a = 1;
				   break;
				}
				else
				{
					if (x.charAt(i) == y.charAt(i))
					{
						l++;
					}
				}
			}

			if (a == 0)
			{
				b = (double)l / (double)n;

				if (b >= d)
				{
					System.out.print("yes");
				}
				else if (b < d)
				{
					System.out.print("no");
				}

			}
		}


	return 0;
	}
}

