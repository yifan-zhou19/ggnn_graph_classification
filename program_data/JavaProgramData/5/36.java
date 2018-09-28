package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double x;
		String dna1 = new String(new char[500]);
		String dna2 = new String(new char[500]);
		int i;
		int j = 0;
		int l1;
		int l2;
		int c = 0;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		dna1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		dna2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l1 = dna1.length();
		l2 = dna2.length();
		if (l1 != l2)
		{
			System.out.print("error");
			c = 1;
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				if (dna1.charAt(i) != 'A' && dna1.charAt(i) != 'T' && dna1.charAt(i) != 'G' && dna1.charAt(i) != 'C')
				{
					System.out.print("error");
					c = 1;
					break;
				}
				else if (dna2.charAt(i) != 'A' && dna2.charAt(i) != 'T' && dna2.charAt(i) != 'G' && dna2.charAt(i) != 'C')
				{
					System.out.print("error");
					c = 1;
					break;
				}
			}
		}
		if (c == 0)
		{
			for (i = 0;i < l1;i++)
			{
				if (dna1.charAt(i) == dna2.charAt(i))
				{
					j = j + 1;
				}
			}
			x = j * 1.0 / l1;
			if (x > a)
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

