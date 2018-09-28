package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] input = new char[10000][300];
		char[][] output = new char[10000][300];
		int n;
		int i;
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
				input[i] = tempVar2.charAt(0);
			}
			int m = String.valueOf(input[i]).length();
			  for (int j = 0;j < m;j++)
			  {
				if (input[i][j] == 'A')
				{
					output[i][j] = 'T';
				}
				else if (input[i][j] == 'T')
				{
					output[i][j] = 'A';
				}
				else if (input[i][j] == 'C')
				{
					output[i][j] = 'G';
				}
				else if (input[i][j] == 'G')
				{
					output[i][j] = 'C';
				}
			  }
			System.out.printf("%s\n",output[i]);
		}
		System.in.read();
		System.in.read();
			return 0;
	}
}

