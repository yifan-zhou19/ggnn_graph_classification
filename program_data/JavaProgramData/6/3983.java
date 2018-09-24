package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int Main()
	{
	  int k;
	  int m;
	  int n;
	  int sum;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  while (k-- != 0)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		sum = 0;
		for (i = 0;i < m;i++)
		{
		for (j = 0;j < n;j++)
		{
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   a[i][j] = Integer.parseInt(tempVar4);
		   }
		   if (i == 0 || i == m - 1 || j == 0 || j == n - 1)
		   {
		   sum += a[i][j];
		   }
		}
		}

		System.out.printf("%d\n",sum);
	  }
		 return 0;
	}

}

