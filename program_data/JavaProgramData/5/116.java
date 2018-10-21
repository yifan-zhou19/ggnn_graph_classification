package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e = 0;
		int k;
		int m = 0;
		double x;
		double y;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
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
		n = a.length();
		k = b.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				e++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G')
			{
				m++;
			}
			if (b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'C' || b.charAt(i) == 'G')
			{
				m++;
			}
		}
		y = e * 1.0 / n;
		if (n == k && m == n + k)
		{
			if (y >= x)
			{
				System.out.print("yes");
			}
				 else if (y < x)
				 {
					 System.out.print("no");
				 }
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}
}

