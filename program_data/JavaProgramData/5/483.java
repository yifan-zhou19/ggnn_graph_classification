package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m = 0;
		int k = 1;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		double x;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
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
		if (a.length() != b.length())
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < a.length();i++)
			{
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T') || (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T'))
				{
					System.out.print("error");
					k = 0;
					break;
				}
				else if (a.charAt(i) == b.charAt(i))
				{
					m++;
				}
			}
			if (k != 0)
			{
				  y = 1.0 * m / a.length();
				if (y > x)
				{
					System.out.print("yes");
				}
				else if (y < x || y == x)
				{
					   System.out.print("no");
				}
			}
		}
		return 0;
	}
}

