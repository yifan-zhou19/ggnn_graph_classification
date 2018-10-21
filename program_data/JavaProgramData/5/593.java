package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int p;
		double n;
		double m = 0;
		double b;
		String d = new String(new char[501]);
		String f = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			f = tempVar3.charAt(0);
		}
		l = d.length();
		p = f.length();
		if (l != p)
		{
			System.out.print("error");

				   return 0;
		}
		for (i = 0;d.charAt(i);i++)
		{
			if (!(d.charAt(i) == 'A' || d.charAt(i) == 'T' || d.charAt(i) == 'G' || d.charAt(i) == 'C'))
			{
				System.out.print("error");

				return 0;
			}
		}
		for (i = 0;f.charAt(i);i++)
		{
			if (!(f.charAt(i) == 'A' || f.charAt(i) == 'T' || f.charAt(i) == 'G' || f.charAt(i) == 'C'))
			{
				System.out.print("error");

				return 0;
			}
		}
		for (i = 0;d.charAt(i);i++)
		{
			if (d.charAt(i) == f.charAt(i))
			{
				m++;
			}
		}
		b = m / l;
		if (b >= n)
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

