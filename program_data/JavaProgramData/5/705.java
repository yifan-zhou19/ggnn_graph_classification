package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int count = 0;
		double bl;
		String a = new String(new char[508]);
		String b = new String(new char[508]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bl = Double.parseDouble(tempVar);
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
		for (i = 0;a.charAt(i) != 0;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;b.charAt(i) != 0;i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;a.charAt(i);i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				count++;
			}
		}
		if ((1.0 * count / (a.length())) > bl)
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

