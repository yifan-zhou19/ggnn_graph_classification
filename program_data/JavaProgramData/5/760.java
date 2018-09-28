package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		double j;
		String a = new String(new char[2000]);
		String b = new String(new char[2000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			j = Double.parseDouble(tempVar);
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
			return 0;
		}
		else
		{
			n = a.length();
			for (i = 0;i < n;i++)
			{
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
				{
					System.out.print("error");
					return 0;
				}
			}
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					m++;
				}
			}
			if (1.0 * m / n > j)
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

