package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int start1;
		int start2;
		int end1;
		int end2;
		int n;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int flag = 0;
		start1 = 0;
		start2 = 0;
		end1 = 0;
		end2 = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
				if (sz[i][j] == 0 && flag == 0)
				{
					flag = 1;
					start1 = i + 1;
					start2 = j + 1;
				}
				if (sz[i][j] == 0)
				{
					end1 = i;
					end2 = j;
				}
			}
		}
		   //printf("%d %d %d %d\n",start1,start2,end1,end2);
		   s = (end1 - start1) * (end2 - start2);
		   System.out.printf("%d\n",s);
		   return 0;
	}
}

