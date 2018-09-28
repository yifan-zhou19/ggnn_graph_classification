package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		double n;
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
		int k = a.length();
		int l = b.length();
		int x = 0;
		int y = 0;
		int mm = 0;
		for (mm = 0;mm < k;mm++)
		{
			if (a.charAt(mm) != 'A' && a.charAt(mm) != 'T' && a.charAt(mm) != 'G' && a.charAt(mm) != 'C')
			{
				x = 1;
			}
		}
		for (mm = 0;mm < l;mm++)
		{
			if (b.charAt(mm) != 'A' && b.charAt(mm) != 'T' && b.charAt(mm) != 'G' && b.charAt(mm) != 'C')
			{
				y = 1;
			}
		}
		if (k != l || x == 1 || y == 1)
		{
			System.out.print("error");
		}


		else
		{
		int i = 0;
		int p = 0;
		int q = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			q++;
			if (a.charAt(i) == b.charAt(i))
			{
				p++;
			}
		}
		double c = (double)p / q;
		if (c > n)
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

