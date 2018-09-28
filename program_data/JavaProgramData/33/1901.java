package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[10000][255];
	public static void Main(String[] args)
	{
		int n;
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
				a[i] = tempVar2.charAt(0);
			}
			int l = 0;
			l = String.valueOf(a[i]).length();
			for (j = 0;j < l;j++)
			{
				if (a[i][j] == 'A')
				{
					a[i][j] = 'T';
				}
				else if (a[i][j] == 'T')
				{
					a[i][j] = 'A';
				}
				else if (a[i][j] == 'G')
				{
					a[i][j] = 'C';
				}
				else if (a[i][j] == 'C')
				{
					a[i][j] = 'G';
				}
			}
		System.out.printf("%s\n",a[i]);
		}
	}


}

