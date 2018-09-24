package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] DNA = new char[1000][260];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(DNA[j]) = tempVar2.charAt(0);
			}
		}
		int pd = 0;
		int m;
		for (int t = 0;t < n;t++)
		{
			pd = String.valueOf(DNA[t]).length();
			for (m = 0;m < pd - 1;m++)
			{
				if (DNA[t][m] == 'A')
				{
					System.out.print("T");
				}
				else if (DNA[t][m] == 'T')
				{
					System.out.print("A");
				}
				else if (DNA[t][m] == 'C')
				{
					System.out.print("G");
				}
				else if (DNA[t][m] == 'G')
				{
					System.out.print("C");
				}
			}
			if (DNA[t][pd - 1] == 'A')
			{
				System.out.print("T\n");
			}
			else if (DNA[t][pd - 1] == 'T')
			{
				System.out.print("A\n");
			}
			else if (DNA[t][pd - 1] == 'C')
			{
				System.out.print("G\n");
			}
			else if (DNA[t][pd - 1] == 'G')
			{
				System.out.print("C\n");
			}
		}
		return 0;
	}
}

