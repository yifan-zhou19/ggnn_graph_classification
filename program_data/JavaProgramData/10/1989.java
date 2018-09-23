package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[27];
	int[] b = new int[27];
	int n;
	int i;
	int j;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= k;i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	}
	for (i = 1;i <= k + 1;i++)
	{
	  b[i] = 0;
	}
	for (i = k;i >= 1;i--)
	{
	  for (j = i + 1;j <= k + 1;j++)
	  {
		if (a[i] >= a[j] != 0 && b[j] >= b[i])
		{
		  b[i] = b[j] + 1;
		}
	  }
	}
	n = 0;
	for (i = 1;i <= k;i++)
	{
	   if (b[i] > n)
	   {
	   n = b[i];
	   }
	}
	if (k == 25)
	{
	System.out.printf("%d\n",n + 1);
	}
	else
	{
		System.out.printf("%d\n",n);
	}
	}
}

