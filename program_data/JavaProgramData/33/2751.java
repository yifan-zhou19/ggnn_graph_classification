package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
		int j;
		char[][] s = new char[1000][256];
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
				s[i] = tempVar2.charAt(0);
			}
			a[i] = String.valueOf(s[i]).length();
			for (j = 0;j < a[i];j++)
			{
				if (s[i][j] == 'A')
				{
					s[i][j] = 'T';
				}
				else
				{
					if (s[i][j] == 'T')
					{
						s[i][j] = 'A';
					}
					else
					{
						if (s[i][j] == 'C')
						{
							s[i][j] = 'G';
						}
						else
						{
							s[i][j] = 'C';
						}
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",s[i]);
		}
		return 0;
	}

}

