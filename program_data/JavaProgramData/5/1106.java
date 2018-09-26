package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k1;
		int k2;
		int q;
		int i;
		int w;
		int sum = 0;
		double n;
		double r;
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
		k1 = dna1.length();
		k2 = dna2.length();
		if (k1 != k2)
		{
				  System.out.print("error");
				  return 0;
		}
		else
		{
			for (i = 0;i < k1;i++)
			{
							 q = dna1.charAt(i);
							 w = dna2.charAt(i);
							 if ((q == 65 || q == 84 || q == 67 || q == 71) && (w == 65 || w == 84 || w == 67 || w == 71))
							 {
									if (q == w)
									{
											sum++;
									}
							 }
							 else
							 {
								 System.out.print("error");
								 return 0;
							 }
			}
		}
		r = 1.0 * sum / k1;
		if (r > n)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

