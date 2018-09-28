package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[] len = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[50][32];
		char[][] b = new char[50][32];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			len[i] = String.valueOf(a[i]).length();

				if (a[i][len[i] - 3] == 'i' && a[i][len[i] - 2] == 'n' && a[i][len[i] - 1] == 'g')
				{
					for (m = 0;m < len[i] - 3;m++)
					{
						b[i][m] = a[i][m];
					}
					b[i][len[i] - 3] == '\0';
					System.out.println(b[i]);
				}
				else if ((a[i][len[i] - 2] == 'e' && a[i][len[i] - 1] == 'r') || (a[i][len[i] - 2] == 'l' && a[i][len[i] - 1] == 'y'))
				{
					for (m = 0;m < len[i] - 2;m++)
					{
						b[i][m] = a[i][m];
					}
					b[i][len[i] - 2] == '\0';
					System.out.println(b[i]);
				}

		}
		return 0;
	}
}

