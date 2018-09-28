package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double j;
		int n;
		int m;
		int b = 0;
		int c = 1;
		int i;
		int q;
		String s1 = new String(new char[510]);
		String s2 = new String(new char[510]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s2 = tempVar3.charAt(0);
		}
		n = s1.length();
		m = s2.length();
		if (n != m)
		{
			c = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (s1.charAt(i) != 'A' && s1.charAt(i) != 'T' && s1.charAt(i) != 'C' && s1.charAt(i) != 'G')
			{
				c = 0;
				break;
			}
		}
		for (q = 0;q < m;q++)
		{
			if (s2.charAt(q) != 'A' && s2.charAt(q) != 'T' && s2.charAt(q) != 'C' && s2.charAt(q) != 'G')
			{
				c = 0;
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s1.charAt(i) == s2.charAt(i))
			{
				b++;
			}
		}
		j = (double)b / n;
		if (c == 1)
		{
			if (j >= a)
			{
				System.out.print("yes");
			}
			else
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

