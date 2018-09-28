package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double percent;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		int number = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			percent = Double.parseDouble(tempVar);
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
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if ((a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G') && (b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'C' || b.charAt(i) == 'G'))
			{
			}
			else
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				number++;
			}
		}
		if ((double)number > ((double)a.length()) * percent)
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

