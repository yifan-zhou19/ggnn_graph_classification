package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String w1 = new String(new char[256]);
		String w2 = new String(new char[256]);
		int n;
		int m;
		int i;
		int j = 0;
		int A = 1;
		double a;
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			w2 = tempVar3.charAt(0);
		}
		n = w1.length();
		m = w2.length();
		if (n != m)
		{
			System.out.print("error");
		}
		if (n == m)
		{
			for (i = 0;i < n;i++)
			{
				if ((w1.charAt(i) == 'A' && w2.charAt(i) == 'A') || (w1.charAt(i) == 'G' && w2.charAt(i) == 'G') || (w2.charAt(i) == 'T' && w1.charAt(i) == 'T') || (w2.charAt(i) == 'C' && w1.charAt(i) == 'C'))
				{
					j++;
				}
				if ((w1.charAt(i) != 'A' && w1.charAt(i) != 'T' && w1.charAt(i) != 'G' && w1.charAt(i) != 'C') || (w2.charAt(i) != 'A' && w2.charAt(i) != 'T' && w2.charAt(i) != 'G' && w2.charAt(i) != 'C'))
				{
					A = 0;
				}
			}
			c = (double)j / n;
		if (A == 0)
		{
			System.out.print("error");
		}
		else if (A == 1 && c > a)
		{
			System.out.print("yes");
		}
		else if (A == 1 && c <= a)
		{
			System.out.print("no");
		}
		}
		return 0;
	}
}

