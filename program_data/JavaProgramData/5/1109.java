package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		double c;
		double s;
		char m;
		char n;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		s = 0.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			m = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(null, 1);
		if (tempVar4 != null)
		{
			n = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b = tempVar5.charAt(0);
		}
		if (a.length() != b.length())
		{
			System.out.print("error");
			return 0;
		}
		else
		{
			k = a.length();
			for (i = 0;i < k;i++)
			{
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
			if (a.charAt(i) == b.charAt(i))
			{
				s++;
			}
			}
		if (s * 1.0 / a.length() >= c)
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

}

