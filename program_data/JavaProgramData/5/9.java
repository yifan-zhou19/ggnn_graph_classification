package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len1;
		int len2;
		int i;
		int x;
		double n;
		double result = 0;
		double result1;
		String dna1 = new String(new char[500]);
		String dna2 = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
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
		len1 = dna1.length();
		len2 = dna2.length();
		if (len1 != len2)
		{
			System.out.print("error");
			return 0;
		}
		if (len1 == len2)
		{
			for (i = 0;i < len1;i++)
			{
				if (((dna1.charAt(i) == 'A') || (dna1.charAt(i) == 'T') || (dna1.charAt(i) == 'C') || (dna1.charAt(i) == 'G')) && ((dna2.charAt(i) == 'A') || (dna2.charAt(i) == 'T') || (dna2.charAt(i) == 'C') || (dna2.charAt(i) == 'G')))
				{
					x = 1;
				}
				else
				{
					x = 0;
					break;
				}
			}
		}
		if (x == 0)
		{
			System.out.print("error");
			return 0;
		}
		if (x == 1)
		{
		for (i = 0;i < len1;i++)
		{
			if (dna1.charAt(i) != dna2.charAt(i))
			{
				result++;
			}
		}
		result1 = (double)1 - (result / len1);
		if ((result1) > n)
		{
			System.out.print("yes");
		}
		if ((result1) <= n)
		{
			System.out.print("no");
		}
		}
		return 0;
	}


}

