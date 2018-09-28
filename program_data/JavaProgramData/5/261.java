package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String gene1 = new String(new char[500]);
		String gene2 = new String(new char[500]);
		int i;
		int s = 0;
		double r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			gene1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			gene2 = tempVar3.charAt(0);
		}
		int len1 = gene1.length();
		int len2 = gene2.length();
		int fuhe = 1;
		for (i = 0;i <= len1 - 1;i++)
		{
			if ((gene1.charAt(i) != 'A' && gene1.charAt(i) != 'T' && gene1.charAt(i) != 'C' && gene1.charAt(i) != 'G') || (gene2.charAt(i) != 'A' && gene2.charAt(i) != 'T' && gene2.charAt(i) != 'C' && gene2.charAt(i) != 'G'))
			{
				fuhe = 0;
			}
		}
		if (len1 != len2 || fuhe == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i <= len1 - 1;i++)
			{
				if (gene1.charAt(i) == gene2.charAt(i))
				{
					s += 1;
				}
				else
				{
					s += 0;
				}
			}
			if (1.00 * s / len1 > r)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}

		return 0;
	}
}

