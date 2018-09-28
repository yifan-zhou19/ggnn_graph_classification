package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] z = new char[1000][256];
		for (int i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					z[i] = tempVar2.charAt(0);
				}
				for (int j = 0;j < String.valueOf(z[i]).length();j++)
				{
						if (z[i][j] == 'A')
						{
						  z[i][j] = 'T';
						}
						else if (z[i][j] == 'T')
						{
						  z[i][j] = 'A';
						}
						if (z[i][j] == 'C')
						{
						  z[i][j] = 'G';
						}
						else if (z[i][j] == 'G')
						{
						  z[i][j] = 'C';
						}
				}
		}
		for (int i = 0;i < n;i++)
		{
			   System.out.printf("%s\n",z[i]);
		}
		return 0;
	}
}

