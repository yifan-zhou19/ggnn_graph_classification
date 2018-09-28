package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
	int n;
	int k;
	int m;
	int a;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (a = n + k;a > 0;a++)
	{
	   m = a;
	   for (b = 1;(m - k) % n == 0 && b <= n;b++)
	   {
		   m = m - (m - k) / n - k;
	   }
	   if (b == n + 1 && m > 0)
	   {
		   break;
	   }
	}
	System.out.printf("%d",a);
	}

}

