package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len1 = 0;
		int len2 = 0;
		int len = 0;
		int flag = 0;
		String dna1 = new String(new char[501]);
		String dna2 = new String(new char[501]);
		double rate;
		double ra;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate = Double.parseDouble(tempVar);
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
		for (i = 0;dna1.charAt(i);i++)
		{
			if ((dna1.charAt(i) == 'A') || (dna1.charAt(i) == 'T') || (dna1.charAt(i) == 'G') || (dna1.charAt(i) == 'C'))
			{
				len1++;
			}
			else
			{
				flag = 1;
				break;
			}
		}
		for (i = 0;dna2.charAt(i);i++)
		{
			if ((dna2.charAt(i) == 'A') || (dna2.charAt(i) == 'T') || (dna2.charAt(i) == 'G') || (dna2.charAt(i) == 'C'))
			{
				len2++;
			}
			else
			{
				flag = 1;
				break;
			}
		}
		if ((len1 != len2) || flag == 1)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
				if (dna1.charAt(i) == dna2.charAt(i))
				{
					len++;
				}
			}
			ra = (double)len / len1;
			if (ra > rate)
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

