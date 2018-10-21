package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String dna = new String(new char[256]);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				dna = tempVar2.charAt(0);
			}
			for (int j = 0;;j++)
			{
				if (dna.charAt(j) == 'A')
				{
					System.out.print("T");
				}
				else if (dna.charAt(j) == 'T')
				{
					System.out.print("A");
				}
				else if (dna.charAt(j) == 'G')
				{
					System.out.print("C");
				}
				else if (dna.charAt(j) == 'C')
				{
					System.out.print("G");
				}
				else if (dna.charAt(j) == '\0')
				{
					break;
				}
			}
			System.out.print("\n");
		}
	}

}

