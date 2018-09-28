package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] per = new int[20000][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int k;
		int i;
		int j;
		for (k = 0;;k++)
		{
			   for (j = 0;j <= 1;j++)
			   {
				   String tempVar2 = ConsoleInput.scanfRead();
				   if (tempVar2 != null)
				   {
					   per[k][j] = Integer.parseInt(tempVar2);
				   }
			   }
			if (per[k][0] == 0 && per[k][1] == 0)
			{
			break;
			}
		}
		   int sign = 0;
		   int flag = 0;
		for (k = 0;k <= n - 1;k++)
		{
			for (i = 0;;i++)
			{
				if (per[i][0] == 0 && per[i][1] == 0)
				{
					if (sign == n - 1)
					{
						System.out.printf("%d",k);
						flag++;
						break;
					}
					if (sign < n - 1)
					{
						System.out.print("NOT FOUND");
						break;
					}

				}
				else if (k == per[i][1])
				{
				   sign++;
				}
				else if (k == per[i][0] && (per[i][0] != 0 || per[i][1] != 0))
				{
					break;
				}
			}
			if (k == n - 1 && flag == 0)
			{
			System.out.print("NOT FOUND");
			}
			sign = 0;
		}
	}
}

