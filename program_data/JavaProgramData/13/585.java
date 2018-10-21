package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[20000];
	int n;
	int i;
	int c;
	int j;
	int k = 0;
	int p;
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
		c = Integer.parseInt(tempVar2);
	}
	p = 1;
	for (j = 0;j < k;j++)
	{
	 if (a[j] == c)
	 {
		 p = 0;
	 }
	}
	if (p != 0)
	{
		a[k] = c;
		k++;
	}
	}
	for (i = 0;i < k - 1;i++)
	{
	System.out.printf("%d ",a[i]);
	}
	System.out.printf("%d",a[i]);
	}
}

