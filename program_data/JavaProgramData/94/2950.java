package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int N;
	int i;
	int j = 0;
	int m = 0;
	int[] sz = new int[500];
	int[] js = new int[500];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	for (i = 0;i < N;i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  sz[i] = Integer.parseInt(tempVar2);
	  }
	 if (sz[i] % 2 != 0)
	 {
	   js[j] = sz[i];
		j++;
		m++;
	 }
	}
	sort(js,js + m);
	for (j = 0;j < m - 1;j++)
	{
	System.out.printf("%d,",js[j]);
	}
	System.out.printf("%d",js[m - 1]);
	return 0;

	}

}

