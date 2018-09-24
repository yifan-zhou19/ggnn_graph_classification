package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int n;
		int k;
		String dna = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				dna = tempVar2.charAt(0);
			}
			a = dna.length();
			if (k != 0)
			{
				System.out.print("\n");
			}
			for (i = 0;i < a;i++)
			{
				if (dna.charAt(i) == 'A')
				{
					System.out.printf("%c",'T');
				}
				else if (dna.charAt(i) == 'T')
				{
					System.out.printf("%c",'A');
				}
				else if (dna.charAt(i) == 'C')
				{
					System.out.printf("%c",'G');
				}
				else if (dna.charAt(i) == 'G')
				{
					 System.out.printf("%c",'C');
				}
			}
		}
	return 0;
	}

}

