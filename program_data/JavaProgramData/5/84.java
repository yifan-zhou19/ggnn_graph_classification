package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String dna1 = new String(new char[500]);
		String dna2 = new String(new char[500]);
		double a;
		int t = 0;
		int i;
		int flag = 0;
		int len1;
		int len2;
		double b;
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
		len1 = dna1.length();
		len2 = dna2.length();
		if (len1 == len2)
		{
			for (i = 0;i < len1;i++)
			{
				if ((dna1.charAt(i) == 'A' || dna1.charAt(i) == 'T' || dna1.charAt(i) == 'G' || dna1.charAt(i) == 'C') && (dna2.charAt(i) == 'A' || dna2.charAt(i) == 'T' || dna2.charAt(i) == 'G' || dna2.charAt(i) == 'C'))
				{
					 if (dna1.charAt(i) == dna2.charAt(i))
					 {
						 t++;
					 }
					if (dna1.charAt(i) != dna2.charAt(i))
					{
						continue;
					}
				}
				if ((dna1.charAt(i) != 'A' && dna1.charAt(i) != 'T' && dna1.charAt(i) != 'G' && dna1.charAt(i) != 'C') || (dna2.charAt(i) != 'A' && dna2.charAt(i) != 'T' && dna2.charAt(i) != 'G' && dna2.charAt(i) != 'C'))
				{
					 flag = 1;
					 break;
				}
			}
			if (flag == 0)
			{
				 b = (double)t / len1;
				 if (b > a)
				 {
					 System.out.print("yes");
				 }
				 if (b <= a)
				 {
					 System.out.print("no");
				 }
			}
		}
		if (len1 != len2)
		{
			System.out.print("error");
		}
		if (flag == 1)
		{
			System.out.print("error");
		}
		return 0;
	}

}

