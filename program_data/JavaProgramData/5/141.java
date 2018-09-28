package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sa = 0;
		int m = 0;
		double x;
		double s;
		String a = new String(new char[105]);
		String b = new String(new char[105]);
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
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
				{
					System.out.print("error");
					m = 1;
					break;
				}
			}
			if (m == 0)
			{
			for (i = 0;i < a.length();i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					sa++;
				}
			}
			s = 1.0 * sa / a.length();
		if (s > x)
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

