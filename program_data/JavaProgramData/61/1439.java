package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int a;
	int[] sz = new int[20];
	int[] r = new int[100];
	sz[0] = 0;
	sz[1] = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 0;j < n;j++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = Integer.parseInt(tempVar2);
	  }
		for (i = 2;i <= a;i++)
		{
			sz[i] = sz[i - 1] + sz[i - 2];
		}
	  r[j] = sz[a];
	}
	for (j = 0;j < n;j++)
	{
		if (j == 0)
		{
			System.out.printf("%d",r[j]);
		}
	 else
	 {
		 System.out.printf("\n%d",r[j]);
	 }
	}
	return 0;
	}
}

