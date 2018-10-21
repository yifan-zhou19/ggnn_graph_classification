package <missing>;

public class GlobalMembers
{
	public static void complement(String chain)
	{
		int j;
		for (j = 0;j < chain.length();j++)
		{
			if (chain[j].equals('A'))
			{
				chain[j] = 'T';
			}
			else if (chain[j].equals('T'))
			{
				chain[j] = 'A';
			}
			else if (chain[j].equals('C'))
			{
				chain[j] = 'G';
			}
			else if (chain[j].equals('G'))
			{
				chain[j] = 'C';
			}
		}
	}

	public static int Main()
	{
		int n;
		String chain = new String(new char[256]);
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				chain = tempVar2.charAt(0);
			}
			complement(chain);
			System.out.printf("%s\n",chain);
		}

		return 0;
	}

}

