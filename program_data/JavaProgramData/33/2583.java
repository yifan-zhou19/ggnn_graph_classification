package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zifu = new String(new char[256]);
		char[][] trans = new char[10000][256];
		int a;
		int b;
		int c;
		int d;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a < n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zifu = tempVar2.charAt(0);
			}
			for (b = 0;zifu.charAt(b) != '\0';b++)
			{
				if (zifu.charAt(b) == 'A')
				{
					trans[a][b] = 'T';
				}
				if (zifu.charAt(b) == 'T')
				{
					trans[a][b] = 'A';
				}
				if (zifu.charAt(b) == 'C')
				{
					trans[a][b] = 'G';
				}
				if (zifu.charAt(b) == 'G')
				{
					trans[a][b] = 'C';
				}
			}
		}
		for (a = 0;a < n;a++)
		{
			System.out.printf("%s\n",trans[a]);
		}
		return 0;
	}
}

