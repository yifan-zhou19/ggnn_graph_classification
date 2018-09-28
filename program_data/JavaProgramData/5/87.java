package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int time = 0;
		double p;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		final String c = "ATCG";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Double.parseDouble(tempVar);
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
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != c.charAt(0) && a.charAt(i) != c.charAt(1) && a.charAt(i) != c.charAt(2) && a.charAt(i) != c.charAt(3))
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != c.charAt(0) && a.charAt(i) != c.charAt(1) && a.charAt(i) != c.charAt(2) && a.charAt(i) != c.charAt(3))
			{
				System.out.print("error");
				return 0;
			}
		}
		if (a.length() != b.length())
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				time++;
			}
		}
		if (p < (double)time / a.length() || p == (double)time / a.length())
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

