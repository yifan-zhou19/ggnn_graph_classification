package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] jjd = new char[1000][256];
		int[] len = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				jjd[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(jjd[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < len[i];j++)
			{
				if (jjd[i][j] == 'A')
				{
					jjd[i][j] = 'T';
				}
				else
				{
					if (jjd[i][j] == 'T')
					{
						jjd[i][j] = 'A';
					}
					else
					{
						if (jjd[i][j] == 'G')
						{
							jjd[i][j] = 'C';
						}
						else
						{
						if (jjd[i][j] == 'C')
						{
							jjd[i][j] = 'G';
						}
						}
					}
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%s\n", jjd[i]);
		}
		System.out.printf("%s", jjd[n - 1]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(len);
		return 0;
	}
}

