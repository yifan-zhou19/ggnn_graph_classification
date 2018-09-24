package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double k;
		double h = 0;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int i;
		int n;
		int m;
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
		n = a.length();
		m = b.length();
		if (n != m)
		{
			System.out.print("error");
		}
		else
		{
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C')
			{
				System.out.print("error");
				break;
			}
			else if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
			{
				System.out.print("error");
				break;
			}
			else
			{
				if (a.charAt(i) == b.charAt(i))
				{
					h++;
				}
			}
		}
		h = h * 1.0 / n;
		if (h > k)
		{
			System.out.print("yes");
		}
		else if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
		{
			System.out.print("no");
		}
		}
		return 0;
	}
}

