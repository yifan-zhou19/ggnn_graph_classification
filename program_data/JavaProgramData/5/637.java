package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double m = 0;
		String dna1 = new String(new char[MAX + 1]);
		String dna2 = new String(new char[MAX + 1]);
		int len1 = 0;
		int len2 = 0;
		int count = 0;
		int i = 0;
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
		//printf("%d%d",len1,len2);
		if (len1 != len2)
		{
			System.out.print("error");
			return 0;
		}
		if (len1 == len2)
		{
			for (i = 0;i < len1 - 1;i++)
			{
				if ((dna1.charAt(i) != 'A' && dna1.charAt(i) != 'T' && dna1.charAt(i) != 'C' && dna1.charAt(i) != 'G') || (dna2.charAt(i) != 'A' && dna2.charAt(i) != 'T' && dna2.charAt(i) != 'C' && dna2.charAt(i) != 'G'))
				{
					System.out.print("error");
					return 0;
				}
				else if (dna1.charAt(i) != dna2.charAt(i))
				{
					count++;
				}
			}
			//printf("%d",count);
			m = (double)count / len1;
			//printf("%.lf",m);
			if ((1 - m) >= n)
			{
				System.out.print("yes");
			}
			if ((1 - m) < n)
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

