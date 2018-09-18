package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] a = new int[1000][1000];
	 int j;
	 int i;
	 int m;
	 int n;
	 int l;
	 int b;
	 int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		l = Integer.parseInt(tempVar);
	}
	for (j = 0;j < l;j++)
	{
	 for (i = 0;i < l;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[j][i] = Integer.parseInt(tempVar2);
	  }
	 }
	}
	for (j = 0;j < l;j++)
	{
	 for (i = 0;i < l;i++)
	 {
	if (a[j][i] == 0)
	{
		b = j;
		j = l;
	break;
	}
	 }
	}
	for (m = l - 1;m >= 0;m--)
	{
	for (n = l - 1;n >= 0;n--)
	{
	if (a[m][n] == 0)
	{
		k = m;
		m = -1;
	break;
	}
	}
	}
	System.out.printf("%d",(k - b - 1) * (n - i - 1));


	return 0;
	}

}

