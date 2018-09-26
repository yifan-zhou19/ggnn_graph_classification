package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int n;
	int m;
	int t;
	int[][] a = new int[8][8];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < m;i++)
	{
	   for (j = 0;j < n;j++)
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i][j] = Integer.parseInt(tempVar3);
		   }
	   }
	}
	for (i = 0;i < m;i++)
	{
	k = 0;
	t = 1;
	for (j = 1;j < n;j++)
	{
	   if (a[i][j] > a[i][k])
	   {
		   k = j;
	   }
	}
	for (j = 0;j < m;j++)
	{
	  if (a[j][k] < a[i][k])
	  {
		t = 0;
		break;
	  }
	}
	if (t != 0)
	{
		System.out.printf("%d+%d",i,k);
		System.exit(0);
	}
	}
	System.out.print("No\n");
	}
}

