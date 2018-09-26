package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int len;
		char[][] zfcsz = new char[1000][256];
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
				zfcsz[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(zfcsz[i]).length();
			for (k = 0;k < len;k++)
			{
				if (zfcsz[i][k] == 'A')
				{
					zfcsz[i][k] = 'T';
				}
				else if (zfcsz[i][k] == 'T')
				{
					zfcsz[i][k] = 'A';
				}
				else if (zfcsz[i][k] == 'G')
				{
					zfcsz[i][k] = 'C';
				}
				else if (zfcsz[i][k] == 'C')
				{
					zfcsz[i][k] = 'G';
				}
			}
		}
		int m = 0;
		for (i = 0;i < n;i++)
		{
			if (m == 0)
			{
				System.out.printf("%s",zfcsz[i]);
				m++;
			}
			else
			{
				System.out.printf("\n%s",zfcsz[i]);
				m++;
			}
		}
		return 0;
	}

}

