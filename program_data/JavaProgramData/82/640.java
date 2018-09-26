package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] count = new int[1000];
		int max = 0;
		int t = 0;
		int m = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] g = new int[n];
	int[] d = new int[n];
	int[] z = new int[n];
	for (i = 0;i < n;i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  g[i] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  d[i] = Integer.parseInt(tempVar3);
	  }
	}
	for (i = 0;i < n;i++)
	{
	   if (g[i] >= 90 && g[i] <= 140 && d[i] >= 60 && d[i] <= 90)
	   {
		z[i] = 1;
	   }
	   else
	   {
		z[i] = 0;
	   }
	}
	for (i = 0;i < n;i++)
	{
	 if (z[i] == 1)
	 {
		count[m]++;
	 }
	 else
	 {
		m++;
		count[m] = 0;
	 }
	 if (i == n - 1)
	 {
		t = m + 1;
	 }
	}
	for (i = 0;i < t;i++)
	{
	 if (count[i] > max)
	 {
	   max = count[i];
	 }
	}
	System.out.printf("%d",max);
	return 0;
	}


}

