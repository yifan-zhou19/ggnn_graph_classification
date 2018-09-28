package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int m;
		  int n;
		  int su = int a;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 6;i <= n;i = i + 2)
		  {
							 for (j = 3;j <= n;j = j + 2)
							 {
												if (su(j) != 0 && su(i - j) != 0)
												{
													System.out.printf("%d=%d+%d\n",i,j,i - j);
												break;
												}
							 }
		  }

	}
	public static int su(int a)
	{
		int i;
		int k;
		k = Math.sqrt(a);
		for (i = 3;i <= k;i = i + 2)
		{
		if (a % i == 0)
		{
		return 0;
		}
		}
		return 1;
	}

}

