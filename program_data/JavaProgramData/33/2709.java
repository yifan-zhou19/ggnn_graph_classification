package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count;
		String dna = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		dna = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			dna = new Scanner(System.in).nextLine();
			count = dna.length();
			for (j = 0;j < count;j++)
			{
				if (dna.charAt(j) == 'A')
				{
					System.out.print("T");
				}
				else if (dna.charAt(j) == 'T')
				{
					System.out.print("A");
				}
				else if (dna.charAt(j) == 'C')
				{
					System.out.print("G");
				}
				else if (dna.charAt(j) == 'G')
				{
					System.out.print("C");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

