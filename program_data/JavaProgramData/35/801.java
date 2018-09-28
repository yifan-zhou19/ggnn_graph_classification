package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int a;
	int b;
	int c;
	int d;
	int e;
	int max;
	int flag;
	int[][] sz = new int[8][8];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < a;i++)
	{
		for (j = 0;j < b;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i][j]) = Integer.parseInt(tempVar3);
			}
		}
	}

	for (i = 0;i < a;i++)
	{
		int max = 0;

		for (j = 0;j < b;j++)
		{

			if (max < sz[i][j])
			{
			max = sz[i][j];
			d = j;
			}
		}
	 flag = 1;

		  for (k = 0;k < a;k++)
		  {
			if (max > sz[k][d])

			{
				   flag = 0;
			   break;
			}
		  }

		  if (flag != 0)
		  {
	   System.out.printf("%d+%d",i,d);

	 break;
		  }


	}
	  if (flag == 0)
	  {
	  System.out.print("No");
	  }



	return 0;
	}

}

