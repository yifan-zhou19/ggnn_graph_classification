package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m1;
		int m2;
		int i;
		int t;
		int d;
		double a;
		double b;
		String dna1 = new String(new char[501]);
		String dna2 = new String(new char[501]);
		t = 0;
		d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		System.in.read();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			dna1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			dna2 = tempVar3.charAt(0);
		}
		m1 = dna1.length();
		m2 = dna2.length();
		if (m1 != m2)
		{
			System.out.print("error");
			d = 1;
		}
		else
		{
			for (i = 0;i < m1;i++)
			{
				if (dna1.charAt(i) == dna2.charAt(i))
				{
					t = t + 1;
				}
			}
		}
		b = 1.000000 * t / m1;
		if (d == 0)
		{
			for (i = 0;i < m1;i++)
			{
			if ((dna1.charAt(i) != 'A') && (dna1.charAt(i) != 'T') && (dna1.charAt(i) != 'C') && (dna1.charAt(i) != 'G'))
			{
				System.out.print("error");
			d = 1;
			break;
			}
			}
		}
		if (d == 0)
		{
			for (i = 0;i < m2;i++)
			{
			if ((dna2.charAt(i) != 'A') && (dna2.charAt(i) != 'T') && (dna2.charAt(i) != 'C') && (dna2.charAt(i) != 'G'))
			{
				System.out.print("error");
			}
			}
		}
		if ((m1 == m2) && (d == 0))
		{
			if (b > a)
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

