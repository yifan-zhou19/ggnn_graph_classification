package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int t;
	int[][] a = new int[100][2];
	int[] b = new int[101];
	b[0] = 0;
	k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	  for (j = 0;j < 2;j++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i][j] = Integer.parseInt(tempVar2);
	  }
	  }
	}
	for (i = 0;i < n;i++)
	{
		k = i + 1;
		if (90 <= a[i][0] != 0 && a[i][0] <= 140 && 60 <= a[i][1] != 0 && a[i][1] <= 90)
		{
		b[k] = b[k - 1] + 1;
		}
		else
		{
		b[k] = 0;
		}
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n - i;i++)
	{
	 if (b[i] > b[i + 1])
	 {
	 t = b[i];
	 b[i] = b[i + 1];
	 b[i + 1] = t;
	 }
	}
	}
	System.out.printf("%d",b[n]);
	return 0;
	}
}

