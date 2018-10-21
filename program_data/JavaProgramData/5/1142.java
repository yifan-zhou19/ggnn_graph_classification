package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k = 0;
		int len;
		int panduan = 0;
		double r;
		double n;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
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
		len = a.length();
		if (len != b.length())
		{
			panduan = 1;
		}
		else
		{
		for (i = 0;i < len;i++)
		{
			if ((a.charAt(i) != 'T' && a.charAt(i) != 'A' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C'))
			{
				panduan = 1;
				break;
			}
			if (a.charAt(i) == b.charAt(i))
			{
				k++;
			}
		}
		r = 1.0 * k / len;
		}
		if (panduan == 1)
		{
			System.out.print("error");
		}
		else
		{
			if (r > n)
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

