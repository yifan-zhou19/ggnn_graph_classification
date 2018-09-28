package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] xl = new char[1000][256];
		char[][] hb = new char[1000][256];
		int i;
		int m;
		int n;
		int[] cd = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xl[m] = tempVar2.charAt(0);
			}
			cd[m] = String.valueOf(xl[m]).length();
		}
		for (m = 0;m < n;m++)
		{
			for (i = 0;i < cd[m];i++)
			{
				switch (xl[m][i])
				{
				case'A':
				hb[m][i] = 'T';
					break;
				case'T':
				hb[m][i] = 'A';
					break;
				case'C':
				hb[m][i] = 'G';
					break;
				case'G':
				hb[m][i] = 'C';
					break;
				default:
					1;
				}
			}
			hb[m][i] = '\0';
		}
		for (m = 0;m < n;m++)
		{
			System.out.printf("%s\n",hb[m]);
		}
		return 0;
	}
}

