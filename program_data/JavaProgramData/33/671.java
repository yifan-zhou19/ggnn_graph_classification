package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] jj = new char[1000][1001];
		char[][] hb = new char[1000][1001];
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			for (i = 1;i <= n;i++)
			{
				jj[i] = new Scanner(System.in).nextLine();
			}
			for (i = 1;i <= n;i++)
			{
			for (k = 0;jj[i][k] != '\0';k++)
			{
			if (jj[i][k] == 'T')
			{
				hb[i][k] = 'A';
			}
			if (jj[i][k] == 'A')
			{
				hb[i][k] = 'T';
			}
			if (jj[i][k] == 'C')
			{
				hb[i][k] = 'G';
			}
			if (jj[i][k] == 'G')
			{
				hb[i][k] = 'C';
			}
			}
		hb[i][k] = '\0';
			}
			for (i = 1;i <= n;i++)
			{
			System.out.println(hb[i]);
			}
		return 0;
	}

}

