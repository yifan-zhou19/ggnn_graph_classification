package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int d = 0;
		int p = 0;
		double b;
		String dna1 = new String(new char[501]);
		String dna2 = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Double.parseDouble(tempVar);
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
		for (i = 0;dna1.charAt(i) && dna2.charAt(i);i++)
		{
			if (m != n)
			{
				d++;
				break;
			}
			if (dna1.charAt(i) != 'A' && dna1.charAt(i) != 'T' && dna1.charAt(i) != 'C' && dna1.charAt(i) != 'G')
			{
				d++;
				break;
			}
			if (dna2.charAt(i) != 'A' && dna2.charAt(i) != 'T' && dna2.charAt(i) != 'C' && dna2.charAt(i) != 'G')
			{
				d++;
				break;
			}
			if (dna1.charAt(i) == dna2.charAt(i))
			{
				p++;
			}
		}
		if ((p * 1.0 / m) > b && d == 0)
		{
			System.out.print("yes");
		}
		if (d != 0)
		{
			System.out.print("error");
		}
		if ((p * 1.0 / m) <= b != 0 && d == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

