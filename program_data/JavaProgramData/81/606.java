package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int jiaohuan(int[][] str)
	{
		int i;
		int j;
		int t;
	  if (n < 5 && m < 5)
	  {
		  for (i = 0;i < 5;i++)
		  {
		  t = str[m][i];
		  str[m][i] = str[n][i];
		  str[n][i] = t;
		  }
	 return 1;
	  }
	  else
	  {
		  return 0;
	  }
	}

	public static int Main()
	{
		int[][] str = new int[5][5];
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i][j] = Integer.parseInt(tempVar);
			}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (jiaohuan(str) == 1)
		{
			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 5;j++)
			{
			if (j == 0)
			{
				System.out.printf("%d",str[i][j]);
			}
		else
		{
			System.out.printf(" %d",str[i][j]);
		}
			}
		System.out.print("\n");
			}
		}
		if (jiaohuan(str) == 0)
		{
			System.out.print("error");
		}
	}


}

