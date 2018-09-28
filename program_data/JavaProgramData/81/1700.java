package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int m;
	 int n;
	 int[][] a = new int[5][5];
	 for (i = 0;i < 5;i++)
	 {
		for (j = 0;j < 4;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				(a[i][j]) = Integer.parseInt(tempVar);
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(a[i][4]) = Integer.parseInt(tempVar2);
		}
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 n = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 m = Integer.parseInt(tempVar4);
	 }
	 if (m <= 4 && n <= 4)
	 {
	  for (j = 0;j < 5;j++)
	  {
		i = a[n][j];
		a[n][j] = a[m][j];
		a[m][j] = i;
	  }
	for (i = 0;i < 5;i++)
	{
	  for (j = 0;j < 4;j++)
	  {
		System.out.printf("%d ",a[i][j]);
	  }
	  System.out.printf("%d\n",a[i][4]);
	}

	 }
	 else
	 {
	System.out.print("error");
	 }
	return 0;
	}
}

