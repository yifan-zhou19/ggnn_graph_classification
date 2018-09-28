package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] arr = new int[100];
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;++i)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		arr[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < n / 2;++i)
	{
	arr[i] ^= arr[n - i - 1];
	arr[n - i - 1] ^= arr[i];
	arr[i] ^= arr[n - i - 1];
	}
	for (i = 0;i < n;++i)
	{
	System.out.printf("%d",arr[i]);
	if (i != n - 1)
	{
	System.out.print(" ");
	}
	}
	return 0;
	}

}

