package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double r;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Double.parseDouble(tempVar);
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
		int s1;
		int s2;
		int y = 1;
		int m = 0;
		s1 = a.length();
		s2 = b.length();
		if (s1 != s2)
		{
			System.out.print("error");
		}
		else
		{
			for (int i = 0;a.charAt(i);i++)
			{
				if ((a.charAt(i) == 'A' || a.charAt(i) == 'G' || a.charAt(i) == 'C' || a.charAt(i) == 'T') && (b.charAt(i) == 'A' || b.charAt(i) == 'G' || b.charAt(i) == 'C' || b.charAt(i) == 'T'))
				{
					if (a.charAt(i) == b.charAt(i))
					{
						m++;
					}
				}
				else
				{
					System.out.print("error");
					y = 0;
					break;

				}
			}
			if (m * 1.0 / s1 > r && y == 1)
			{
				System.out.print("yes");
			}
			else if (y == 1)
			{
				System.out.print("no");
			}
		}




	return 0;
	}
}

