package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double per;
		double SUM;
		double sum = 0;
		int len;
		String DNA = new String(new char[500]);
		String dna = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			per = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			DNA = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			dna = tempVar3.charAt(0);
		}
		SUM = DNA.length();
		len = dna.length();
		if (SUM != len)
		{
			System.out.print("error\n");
			return 0;
		}
		for (int j = 0;j < SUM;j++)
		{
			if (DNA.charAt(j) != 'A' && DNA.charAt(j) != 'T' && DNA.charAt(j) != 'C' && DNA.charAt(j) != 'G')
			{
				System.out.print("error\n");
				return 0;
			}
			if (dna.charAt(j) != 'A' && dna.charAt(j) != 'T' && dna.charAt(j) != 'C' && dna.charAt(j) != 'G')
			{
				System.out.print("error\n");
				return 0;
			}
		}

		for (int i = 0;i < SUM;i++)
		{
			if (DNA.charAt(i) == dna.charAt(i))
			{
				sum++;
			}
		}
		SUM = sum / SUM;
		if (SUM > per)
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
		return 0;
	}

}

