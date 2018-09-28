package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int k;
	int[] x = new int[100];
	int i;
	int cas;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	x[0] = 0;
	for (m = 1;x[0] == 0;m++)
	{
	 x[n] = (n - 1) * m;
	 cas = 0;
	 for (i = n;i >= 1 && cas == 0;i--)
	 {
	  if (x[i] % (n - 1) == 0)
	  {
	   x[i - 1] = x[i] * n / (n - 1) + k;
	  }
	  else
	  {
	   cas = 1;
	  }
	 }
	}
	System.out.printf("%d",x[0]);
	}
}

