package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double rate;
		double result;
		int p = 2;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate = Double.parseDouble(tempVar);
		}
		String dna1 = new String(new char[510]);
		String dna2 = new String(new char[510]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			dna1 = tempVar2.charAt(0);
		}
		scanf("\n");
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			dna2 = tempVar3.charAt(0);
		}
			for (int i = 0;i < dna1.length();i++)
			{
			if ((dna1.charAt(i) != 'A' && dna1.charAt(i) != 'T' && dna1.charAt(i) != 'C' && dna1.charAt(i) != 'G') || (dna2.charAt(i) != 'A' && dna2.charAt(i) != 'T' && dna2.charAt(i) != 'C' && dna2.charAt(i) != 'G'))
			{
				p = 0;
				break;
			}
			}
		if (dna1.length() != dna2.length())
		{
			p = 0;
		}

		if (p == 2)
		{
			for (int i = 0;i < dna1.length();i++)
			{
				if (dna1.charAt(i) == dna2.charAt(i))
				{
					num++;
				}
			}
			result = 1.0 * num / dna1.length();
			if (result >= rate)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		if (p == 0)
		{
			System.out.print("error");
		}
		return 0;
	}
}

