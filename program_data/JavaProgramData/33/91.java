package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		char[][] zf = new char[1000][1000];
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
				zf[i] = tempVar2.charAt(0);
			}
			j = 0;
			len = String.valueOf(zf[i]).length();
			for (j = 0;j < len;j++)
			{
				switch (zf[i][j])
				{
				case 'A':
					zf[i][j] = 'T';
					break;
				case 'T':
					zf[i][j] = 'A';
					break;
				case 'C':
					zf[i][j] = 'G';
					break;
				case 'G':
					zf[i][j] = 'C';
					break;
				}
			}
			System.out.printf("%s\n",zf[i]);
		}
		return 0;
	}
}

