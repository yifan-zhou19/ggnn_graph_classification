package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double xgl;
		double e;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		double cd1;
		double cd2;
		int i;
		double js = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			xgl = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}

		cd1 = a.length();
		cd2 = b.length();

		if (cd1 != cd2)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < cd1;i++)
		{
			if ((a.charAt(i) == 'A' && b.charAt(i) == 'A') || (a.charAt(i) == 'T' && b.charAt(i) == 'T') || (a.charAt(i) == 'C' && b.charAt(i) == 'C') || (a.charAt(i) == 'G' && b.charAt(i) == 'G'))
			{
				js++;
			}
			else if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
		}
		e = js / cd1;
		if (e > xgl)
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

