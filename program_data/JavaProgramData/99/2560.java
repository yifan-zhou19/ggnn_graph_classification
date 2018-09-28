package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	int n;
	int i;
	int[] sz = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   sz[i] = Integer.parseInt(tempVar2);
	   }
	}
	for (i = 0;i < n;i++)
	{
	   if (sz[i] <= 18)
	   {
	   a++;
	   }
	   else if (sz[i] >= 19 && sz[i] <= 35)
	   {
	   b++;
	   }
	   else if (sz[i] >= 36 && sz[i] <= 60)
	   {
	   c++;
	   }
	   else if (sz[i] > 60)
	   {
	   d++;
	   }
	}
	System.out.printf("1-18: %.2lf%%\n",a * 100.0 / n);
	System.out.printf("19-35: %.2lf%%\n",b * 100.0 / n);
	System.out.printf("36-60: %.2lf%%\n",c * 100.0 / n);
	System.out.printf("Over60: %.2lf%%\n",d * 100.0 / n);
	return 0;
	}
}

