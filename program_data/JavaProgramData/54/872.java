package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int c;
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
	 int[] a = new int[100];
	 for (j = 1;;j++)
	 {
	for (i = 0;i < n - 1;i++)
	{
	a[0] = n * j + k;
	a[i + 1] = a[i] * n / (n - 1) + k;
	}
	c = 0;
	while (a[c] % (n - 1) == 0 && c < n)
	{
		c++;
	}
	 if (c >= i)
	 {
		 break;
	 }
	 }
	System.out.printf("%d",a[n - 1]);
	return 0;
	}
}

