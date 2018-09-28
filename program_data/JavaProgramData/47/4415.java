package <missing>;

public class GlobalMembers
{
	/*??????*/
	public static void Main()
	{
	int[] a = new int[100];
	int n;
	int i;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	i = 1;
	while (i <= n)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	i++;
	}
	i = 1;
	while (i <= n / 2)
	{
		b = a[i],a[i] = a[n - i + 1],a[n - i + 1] = b;
		i++;
	}
	i = 1;
	while (i < n)
	{
		System.out.printf("%d ",a[i]);
		i++;
	}
	System.out.printf("%d",a[n]);
	}
}

