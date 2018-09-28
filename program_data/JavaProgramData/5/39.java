package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double t = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String dna1 = new String(new char[600]);
		String dna2 = new String(new char[600]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			dna1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			dna2 = tempVar3.charAt(0);
		}
		int len1 = dna1.length();
		int len2 = dna2.length();
		int flag = 1;
		for (i = 0,j = 0;i < len1,j < len2;i++,j++)
		{
			if (len1 != len2 || dna1.charAt(i) != 'A' && dna1.charAt(i) != 'T' && dna1.charAt(i) != 'C' && dna1.charAt(i) != 'G' || dna2.charAt(j) != 'A' && dna2.charAt(j) != 'T' && dna2.charAt(j) != 'C' && dna2.charAt(j) != 'G')
			{
				System.out.print("error");
				flag = 0;
				break;
			}
			if (dna1.charAt(i) == dna2.charAt(j))
			{
				t++;
			}

		}

		if (flag == 1)
		{
			if (t / len1 > n)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

