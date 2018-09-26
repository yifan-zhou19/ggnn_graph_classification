package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int flag = 0;
		int deadend = 0;
		double x;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
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
		for (i = 0;i < a.length();i++)
		{
			if ((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'G') && (a.charAt(i) != 'C'))
			{
				System.out.print("error");
				deadend = 1;
				break;
			}
		}
		if ((a.length() == b.length()) && (deadend == 0))
		{
			for (i = 0;i < a.length();i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					flag++;
				}
			}
			if ((100 * flag / (a.length())) < (100 * x))
			{
				System.out.print("no");
			}
			else
			{
				System.out.print("yes");
			}
		}
		else if ((a.length() != b.length()) && (deadend == 0))
		{
			System.out.print("error");
		}
		return 0;
	}
}

