package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double x;
		double n;
		int i;
		int k = 0;
		int s = 0;
		int len1;
		int len2;
		int j = 0;
		String a = new String(new char[10]);
		String dna1 = new String(new char[510]);
		String dna2 = new String(new char[510]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		dna1 = new Scanner(System.in).nextLine();
		dna2 = new Scanner(System.in).nextLine();
		len1 = dna1.length();
		len2 = dna2.length();
		if (len1 != len2)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;dna1.charAt(i) != '\0';i++)
			{
				if ((dna1.charAt(i) != 'A' && dna1.charAt(i) != 'G' && dna1.charAt(i) != 'C' && dna1.charAt(i) != 'T') || (dna2.charAt(i) != 'A' && dna2.charAt(i) != 'G' && dna2.charAt(i) != 'C' && dna2.charAt(i) != 'T'))
				{
					 System.out.print("error");
					 j++;
					 break;
				}
				else
				{
					if (dna1.charAt(i) == dna2.charAt(i))
					{
						k++;
					}
					s++;
				}
			}
			if (j == 0)
			{
				x = 1.0 * k / s;
				if (x > n)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
			}
		}
		return 0;
	}

}

