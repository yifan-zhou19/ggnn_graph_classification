package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zfcx = new char[1000][256];
		char[][] zfcy = new char[100][256];
		int i = 0;
		int n;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfcx[i] = tempVar2.charAt(0);
			}
			m = String.valueOf(zfcx[i]).length();
			for (k = 0;k <= m;k++)
			{
				if (zfcx[i][k] == 'A')
				{
					zfcy[i][k] = 'T';
				}
				if (zfcx[i][k] == 'T')
				{
					zfcy[i][k] = 'A';
				}
				if (zfcx[i][k] == 'C')
				{
					zfcy[i][k] = 'G';
				}
				if (zfcx[i][k] == 'G')
				{
					zfcy[i][k] = 'C';
				}
				if (zfcx[i][k] == '\0')
				{
					zfcy[i][k] = '\0';
				}
			}
			System.out.printf("%s\n",zfcy[i]);
			i++;
		}
		return 0;
	}

}

