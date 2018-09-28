package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double bl;
		double jl;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bl = Double.parseDouble(tempVar);
		}
		String dna1 = new String(new char[501]);
		String dna2 = new String(new char[501]);
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
		int i;
		int k = 0;
		int l;
		int n = 0;
		l = dna1.length();
		for (i = 0;i < l;i++)
		{
			if ((dna1.charAt(i) != 'A' && dna1.charAt(i) != 'G' && dna1.charAt(i) != 'C' && dna1.charAt(i) != 'T') || (dna2.charAt(i) != 'A' && dna2.charAt(i) != 'G' && dna2.charAt(i) != 'C' && dna2.charAt(i) != 'T'))
			{
				k++;
			}
		}
		if (k > 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < l;i++)
			{
				if (dna1.charAt(i) == dna2.charAt(i))
				{
					n++;
				}
			}
			jl = 1.0 * n / (l - 1);
			if (jl > bl)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}



}

