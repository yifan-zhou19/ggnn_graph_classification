package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int n;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	int[] a = new int[100];
	int i;
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	int pos = n - m;
	for (i = 0;i < n - 1;i++)
	{
	System.out.printf("%d ",a[(pos + i) % n]);
	}
	System.out.printf("%d\n",a[(pos + i) % n]);
	}


}

