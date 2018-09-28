package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		int num;
		int i;
		int same = 0;
		int judge = 1;
		double standard;
		double actual;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			standard = Double.parseDouble(tempVar);
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
			num = a.length();
			for (i = 0;i < num;i++)
			{
				if (((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'G') && (a.charAt(i) != 'C')) || ((b.charAt(i) != 'A') && (b.charAt(i) != 'T') && (b.charAt(i) != 'G') && (b.charAt(i) != 'C')))
				{
					System.out.print("error");
					judge = 0;
					break;
				}
				else
				{
					if (a.charAt(i) == b.charAt(i))
					{
						same++;
					}
				}
			}
			if (judge != 0)
			{
				actual = 1.0 * same / num;
				if (actual > standard)
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

