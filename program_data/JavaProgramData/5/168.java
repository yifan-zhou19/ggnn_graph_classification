package <missing>;

public class GlobalMembers
{
	// ?????.cpp : Defines the entry point for the console application.
	//

	public static void Main(String[] args)
	{
		String dna1 = new String(new char[600]);
		String dna2 = new String(new char[600]);
		int a;
		int b;
		int i;
		double x = 0;
		double ratio;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ratio = Double.parseDouble(tempVar);
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
		a = dna1.length();
		b = dna2.length();
		if (a != b)
		{
			System.out.print("error");
		}
		for (i = 0;i < a;i++)
		{
			if (dna1.charAt(i) != 'A' && dna1.charAt(i) != 'T' && dna1.charAt(i) != 'G' && dna1.charAt(i) != 'C')
			{
				System.out.print("error");
			}
			if (dna2.charAt(i) != 'A' && dna2.charAt(i) != 'T' && dna2.charAt(i) != 'G' && dna2.charAt(i) != 'C')
			{
				System.out.print("error");
			}
			if (dna1.charAt(i) == dna2.charAt(i))
			{
				x++;
			}
		}
		if (x / a >= ratio)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}


}

