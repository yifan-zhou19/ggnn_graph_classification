package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double y = 0;
		double m;
		double n;
		double t;
		int i;
		int q = 0;
		String dna1 = new String(new char[501]);
		String dna2 = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
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
		m = dna1.length();
		n = dna2.length();
		if (m == n)
		{
			for (i = 0;i < m;i++)
			{
				if ((dna1.charAt(i) == 'A' || dna1.charAt(i) == 'T' || dna1.charAt(i) == 'C' || dna1.charAt(i) == 'G') && (dna2.charAt(i) == 'A' || dna2.charAt(i) == 'T' || dna2.charAt(i) == 'C' || dna2.charAt(i) == 'G'))
				{
				}
				else
				{
					q = 1;
					break;
				}
			}
			for (i = 0;i < m;i++)
			{
				if (q == 1)
				{
					break;
				}
				else if (dna1.charAt(i) == dna2.charAt(i))
				{
					y++;
				}
				else if (dna1.charAt(i) != dna2.charAt(i))
				{

				}
			}
			t = y / m;
		}
		else if (m != n)
		{
				q = 1;
		}
		if ((t >= a != 0 && a != 0 && q == 0) || (q == 0 && t > a && a == 0))
		{
			System.out.print("yes");
		}
		else if ((t < a) && (a != 0) && (q == 0) || ((q == 0) && (t == 0) && (a == 0)))
		{
			System.out.print("no");
		}
		else if (q == 1)
		{
			System.out.print("error");
		}
		return 0;
	}

}

