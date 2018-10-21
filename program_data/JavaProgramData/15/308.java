package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] str = new int[500][500];
		int len1 = 0;
		int len2 = 0;
		int t1;
		int t2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		   for (j = 0;j < n;j++)
		   {
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						str[i][j] = Integer.parseInt(tempVar2);
					}
		   }
		}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (str[i][j] == 0)
					{
						t1 = i;
						t2 = j;
						while (str[t1++][t2] == 0)
						{
							len1++;
						}
						while (str[t1 - 2][t2++] == 0)
						{
							len2++;
						}
						System.out.printf("%d\n",(len1 - 2) * (len2 - 2));
						 break;
					}
				}
				if (j < n)
				{
					break;
				}
			}

		return 0;
	}
}

