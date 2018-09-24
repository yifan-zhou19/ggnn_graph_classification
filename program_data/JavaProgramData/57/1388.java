package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[1000][256];
	public static char[][] b = new char[1000][256];
	public static int Main()
	{
		int[] len = new int[1000];
		int n = 0;
		int i;
		int j;
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
				a[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < len[i];j++)
			{
				if (a[i][len[i] - 1] == 'r' && a[i][len[i] - 2] == 'e')
				{
					a[i][len[i] - 2] = 0;
				}
				else if (a[i][len[i] - 1] == 'g' && a[i][len[i] - 2] == 'n' && a[i][len[i] - 3] == 'i')
				{
					a[i][len[i] - 3] = 0;
				}
				else if (a[i][len[i] - 1] == 'y' && a[i][len[i] - 2] == 'l')
				{
					a[i][len[i] - 2] = 0;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
				System.out.printf("%s\n",a[i]);
		}
		return 0;

	}
}

