package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int s = 0;
		int j = 1;
		double r;
		String d1 = new String(new char[501]);
		String d2 = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			d1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d2 = tempVar3.charAt(0);
		}
		if (d1.length() != d2.length())
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < d1.length();i++)
			{
				if (d1.charAt(i) != 'A' && d1.charAt(i) != 'C' && d1.charAt(i) != 'G' && d1.charAt(i) != 'T' && d2.charAt(i) != 'A' && d2.charAt(i) != 'G' && d2.charAt(i) != 'C' && d2.charAt(i) != 'T')
				{
					j = 0;
					System.out.print("error");
					break;
				}
				else if (d1.charAt(i) == d2.charAt(i))
				{
					s++;
				}
			}
			if (j == 1)
			{
				if (1.0 * s / d1.length() > r)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
			}
		}
		return 0;
	}
}

