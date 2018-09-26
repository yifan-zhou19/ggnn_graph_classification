package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] s = new char[1000][260];
		int n;
		int i;
		int k;
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
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < 255;k++)
			{
				switch (s[i][k])
				{
				case 'A':
					s[i][k] = 'T';
					break;
				case 'T':
					s[i][k] = 'A';
					break;
				case 'C':
					s[i][k] = 'G';
					break;
				case 'G':
					s[i][k] = 'C';
					break;
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

