package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char[][] b = new char[1000][1000];
		int n;
		int i;
		int j;
		int[] len = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			len[i] = a.length();
			for (j = 0;j < len[i];j++)
			{
				if (a.charAt(j) == 'A')
				{
					b[i][j] = 'T';
				}
				if (a.charAt(j) == 'T')
				{
					b[i][j] = 'A';
				}
				if (a.charAt(j) == 'C')
				{
					b[i][j] = 'G';
				}
				if (a.charAt(j) == 'G')
				{
					b[i][j] = 'C';
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < len[i];j++)
			{
				System.out.printf("%c",b[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}


}

