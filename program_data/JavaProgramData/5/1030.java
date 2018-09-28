package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double k;
		double j;
		int i;
		int o;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Double.parseDouble(tempVar);
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
		int l = a.length();
		int p = b.length();
		o = 0;
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
			{
				p += 500;
			}
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
			{
				p += 500;
			}
			if (a.charAt(i) == b.charAt(i))
			{
				o++;
			}
		}
		if (l != p)
		{
			System.out.print("error");
		}
		else
		{
			j = 1.0 * o / l;
			if (j > k)
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

