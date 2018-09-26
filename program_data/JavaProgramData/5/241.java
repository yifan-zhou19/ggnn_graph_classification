package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double bl;
		int n1;
		int n2;
		int i;
		int k = 0;
		int sum = 0;
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
		n1 = dna1.length();
		n2 = dna2.length();
		if (n1 != n2)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < n1;i++)
			{
				if (dna1.charAt(i) != 'A' && dna1.charAt(i) != 'G' && dna1.charAt(i) != 'C' && dna1.charAt(i) != 'T')
				{
					k = 1;
					break;
				}
				if (dna2.charAt(i) != 'A' && dna2.charAt(i) != 'G' && dna2.charAt(i) != 'C' && dna2.charAt(i) != 'T')
				{
					k = 1;
					break;
				}
				if (dna1.charAt(i) == dna2.charAt(i))
				{
					sum++;
				}
			}
			if (k == 0)
			{
				bl = (double)sum / n1;
				if (bl > a)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
			}
			else
			{
				System.out.print("error");
			}
		}
	return 0;
	}
}

