package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[100];
	int i;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = n - 1;i > 0;i--)
	{
	System.out.printf("%d ",a[i]);
	}
	System.out.printf("%d\n",a[i]);
	}


}

