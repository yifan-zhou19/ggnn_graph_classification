package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] num = new int[n];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		num[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 1;i < n;i++)
	{
	System.out.printf("%d ",num[n - i]);
	}
	System.out.printf("%d",num[0]);
	return 0;
	}

}

