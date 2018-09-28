package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double m;
		int i;
		int k = 0;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
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
			int p = 1;
		for (i = 0;i < a.length();i++)
		{
			if ((a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G') && (b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'C' || b.charAt(i) == 'G'))
			{
				 if (a.charAt(i) == b.charAt(i))
				 {
					 k++;
				 }
			}
			else
			{
				p = 0;
				System.out.print("error");
				break;
			}
		}
		if (p == 1)
		{
		m = (double)k / a.length();
		if (m > n)
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

