package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] k = new int[20];
		int[] l = new int[100];
		char[][] bsf = new char[100][20];
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
				bsf[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			j = 0;
			k[i] = 0;
			l[i] = String.valueOf(bsf[i]).length();
			for (j = 0;j < l[i];j++)
			{
				if ((bsf[i][0] == '_') || (bsf[i][0] >= 'a' && bsf[i][0] <= 'z') || (bsf[i][0] >= 'A' && bsf[i][0] <= 'Z'))
				{
					if ((bsf[i][j] == '_') || (bsf[i][j] >= 'a' && bsf[i][j] <= 'z') || (bsf[i][j] >= 'A' && bsf[i][j] <= 'Z') || (bsf[i][j] >= '0' && bsf[i][j] <= '9'))
					{
						k[i]++;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (k[i] == l[i])
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

