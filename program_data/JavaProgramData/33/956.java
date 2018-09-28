package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] j = new int[1000];
		int k;
		int l;
		char[][] c = new char[1000][2255];
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
				c[i] = tempVar2.charAt(0);
			}
			j[i] = String.valueOf(c[i]).length();
			for (k = 0;k < j[i];k++)
			{
				if (c[i][k] == 'A')
				{
					c[i][k] = 'T';
				}
				else if (c[i][k] == 'T')
				{
					c[i][k] = 'A';
				}
				else if (c[i][k] == 'C')
				{
					c[i][k] = 'G';
				}
				else if (c[i][k] == 'G')
				{
					c[i][k] = 'C';
				}
			}
			for (l = 0;l < j[i];l++)
			{
	System.out.printf("%c",c[i][l]);
	if (l == j[i] - 1)
	{
		System.out.print("\n");
	}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			l = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}

