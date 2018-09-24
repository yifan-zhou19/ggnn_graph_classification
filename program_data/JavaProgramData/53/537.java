package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][2];
		int n;
		int i;
		int j;
		int kai;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n - 1;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i][0] = Integer.parseInt(tempVar2);
		}
		a[i][1] = 0;
	}

	for (i = 0;i <= n - 1;i++)
	{
					   for (j = i + 1;j <= n - 1;j++)
					   {
					   if (a[i][0] == a[j][0])
					   {
					   a[j][1] = 1;
					   }
					   }
	}
	for (i = 0,kai = 0;i <= n - 1;i++)
	{
							 if (a[i][1] == 0 && kai == 0)
							 {
								 System.out.printf("%d",a[i][0]);
								 kai = 1;
								 continue;
							 }
							 if (a[i][1] == 0 && kai == 1)
							 {
							 System.out.printf(",%d",a[i][0]);
							 }
	}


	   return 0;
	}



}

