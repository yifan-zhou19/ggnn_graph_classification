package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		int i;
		int j = 0;
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
		int len1 = dna1.length();
		int len2 = dna2.length();
		if (len1 != len2)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < len1;i++)
		{
			if ((dna1.charAt(i) != 'A' && dna1.charAt(i) != 'T' && dna1.charAt(i) != 'G' && dna1.charAt(i) != 'C') || (dna1.charAt(i) != 'A' && dna1.charAt(i) != 'T' && dna1.charAt(i) != 'C' && dna1.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < len1;i++)
		{
			if (dna1.charAt(i) == dna2.charAt(i))
			{
				j++;
			}
		}
		if (1.0 * j / len1 > a)
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

