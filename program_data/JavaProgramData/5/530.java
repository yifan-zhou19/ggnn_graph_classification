package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
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
		int d = 0;
		int i;
		int p = 0;
		int m = dna1.length();
		int l = dna2.length();
		for (i = 0;dna1.charAt(i) || dna2.charAt(i);i++)
		{
			if (m != l)
			{
				d = 1;
				break;
			}
			if (dna1.charAt(i) != 'A' && dna1.charAt(i) != 'T' && dna1.charAt(i) != 'C' && dna1.charAt(i) != 'G')
			{
				d = 2;
				break;
			}
			if (dna2.charAt(i) != 'A' && dna2.charAt(i) != 'T' && dna2.charAt(i) != 'C' && dna2.charAt(i) != 'G')
			{
				d = 3;
				break;
			}
			if (dna1.charAt(i) != dna2.charAt(i))
			{
				p++;
			}
		}
		double q = 1 - p / m;
		if (d != 0)
		{
			System.out.print("error");
		}
		if (q > b && d == 0)
		{
			System.out.print("yes");
		}
		else if (d == 0 && q <= b)
		{
			System.out.print("no");
		}
		return 0;
	}
}

