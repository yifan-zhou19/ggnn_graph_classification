package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int num = 0;
		int[][] k = new int[1000][1000];
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
					  k[i][j] = Integer.parseInt(tempVar2);
				  }
			  }
		}
		for (i = 0;i < n;i++)
		{
			  for (j = 0;j < n;j++)
			  {
				  if (k[i][j] == 0)
				  {
					  while (k[i][j + 1] == 255)
					  {
						  j++;
						  num++;
					  }

					  if (k[i][j + 1] == 0)
					  {
						  break;
					  }

				  }
			  }
		}
		System.out.printf("%d\n",num);
		return 0;
	}
}

