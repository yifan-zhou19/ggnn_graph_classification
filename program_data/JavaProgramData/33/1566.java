package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] zfcsz = new char[N][256];
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
				(zfcsz[i]) = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;zfcsz[i][j] != '\0';j++)
			{
				if (zfcsz[i][j] == 'A')
				{
					zfcsz[i][j] = 'T';
				}
				else if (zfcsz[i][j] == 'T')
				{
					zfcsz[i][j] = zfcsz[i][j] + 'A'-'T';
				}
				else if (zfcsz[i][j] == 'C')
				{
					zfcsz[i][j] = zfcsz[i][j] + 'G'-'C';
				}
				else if (zfcsz[i][j] == 'G')
				{
					zfcsz[i][j] = zfcsz[i][j] + 'C'-'G';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",zfcsz[i]);
		}
		return 0;
	}
}

