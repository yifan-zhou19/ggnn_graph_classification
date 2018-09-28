package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] b = new int[100];
		int[] d = new int[100];
		char[][] a = new char[100][100];
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
			if (a[i][0] == '_' || (a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z'))
			{
				b[i] = 1;
			}
			else
			{
				b[i] = 0;
			}
		}
		for (c = 0;c < n;c++)
		{
			d[c] = String.valueOf(a[c]).length();
			if (b[c] == 0)
			{
				continue;
			}
			for (i = 0;i < d[c];i++)
			{
					if (a[c][i] == '_' || (a[c][i] >= 'a' && a[c][i] <= 'z') || (a[c][i] >= 'A' && a[c][i] <= 'Z') || (a[c][i] >= '0' && a[c][i] <= '9'))
					{
						b[c] = 1;
					}
					else
					{
						b[c] = 0;
						break;
					}

			}
		}

		for (c = 0;c < n;c++)
		{
			if (b[c] == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}



}

