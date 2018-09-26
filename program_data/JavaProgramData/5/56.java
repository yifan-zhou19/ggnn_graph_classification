package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a = 0;
		int m;
		double n;
		double x;
		String dna1 = new String(new char[501]);
		String dna2 = new String(new char[501]);
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
		for (i = 0;dna1.charAt(i) != '\0';i++)
		{
			if (dna1.charAt(i) != 65 && dna1.charAt(i) != 67 && dna1.charAt(i) != 71 && dna1.charAt(i) != 84)
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;dna2.charAt(i) != '\0';i++)
		{
			if (dna2.charAt(i) != 65 && dna2.charAt(i) != 67 && dna2.charAt(i) != 71 && dna2.charAt(i) != 84)
			{
				System.out.print("error");
				return 0;
			}
		}
		if (dna1.length() != dna2.length())
		{
			System.out.print("error");
		}
		else
		{
			m = dna1.length();
			for (i = 0;dna1.charAt(i) != '\0';i++)
			{
				if (dna1.charAt(i) == dna2.charAt(i))
				{
					a++;
				}
			}
			x = a * 1.0 / (1.0 * m);
			if (x > n)
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

