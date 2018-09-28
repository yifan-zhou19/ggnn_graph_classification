package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int[] a = new int[1000];
	a[0] = 1;
	a[1] = 1;
	for (i = 2;i < 900;i++)
	{
		a[i] = a[i - 1] + a[i - 2];
	}
	int n;
	int t;
	int j;
	float sum;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 0;j < n;j++)
	{
	  sum = 0F;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  t = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i < t;i++)
	  {
		  sum = sum + (float)(a[i + 2]) / (float)(a[i + 1]);
	  }
	  System.out.printf("%.3f\n",sum);
	}
	}

}

