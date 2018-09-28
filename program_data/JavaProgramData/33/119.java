package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] b = new int[1000];
		char[][] u = new char[1000][256];
		char a = 'A';
		char t = 'T';
		char g = 'G';
		char c = 'C';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				u[i] = tempVar2.charAt(0);
			}
		}
			for (i = 0;i < n;i++)
			{
				b[i] = String.valueOf(u[i]).length();
				for (j = 0;j < b[i];j++)
				{
			if (u[i][j] == 'A')
			{
				u[i][j] = 'T';
			}
			else if (u[i][j] == 'T')
			{
				u[i][j] = 'A';
			}
				else if (u[i][j] == 'C')
				{
				u[i][j] = 'G';
				}
			else if (u[i][j] == 'G')
			{
				u[i][j] = 'C';
			}
				}
			}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%s\n",u[i]);
		}
	return 0;
	}
}

