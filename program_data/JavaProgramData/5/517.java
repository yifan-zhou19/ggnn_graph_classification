package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[501]);
	public static String b = new String(new char[501]);
	public static int Main()
	{
		double n;
		double d = 0;
		int e = 0;
		int i;
		int k = 1;
		int lena;
		int lenb;
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
		lena = (int)a.length();
		lenb = (int)b.length();
		for (i = 0;a.charAt(i);i++)
		{
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C') || lena != lenb)
			{
			 d = -1;
			 break;
			}
			else if (a.charAt(i) == b.charAt(i))
			{
				e++;
			}
		}
		if (d == 0)
		{
			d = 1.0 * e / i;
		}
		if (d > n)
		{
			System.out.print("yes");
		}
		if (d <= n != 0 && d >= 0)
		{
			System.out.print("no");
		}
		if (d < 0)
		{
			System.out.print("error");
		}
	return 0;
	}
}

