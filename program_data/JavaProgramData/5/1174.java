package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double xgd;
		double bz;
		int l;
		int i;
		int count;
		String dna1 = new String(new char[110]);
		String dna2 = new String(new char[110]);
		count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bz = Double.parseDouble(tempVar);
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
		l = dna1.length();
		for (i = 0;i < l;i++)
		{
			if (!(dna1.charAt(i) == 'A' || dna1.charAt(i) == 'G' || dna1.charAt(i) == 'C' || dna1.charAt(i) == 'T') || !(dna2.charAt(i) == 'A' || dna2.charAt(i) == 'G' || dna2.charAt(i) == 'C' || dna2.charAt(i) == 'T'))
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < l;i++)
		{
			if (dna1.charAt(i) == dna2.charAt(i))
			{
				count++;
			}
		}
		xgd = 1.0 * count / l;
		if (xgd >= bz)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

