package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz = new int[10];
	int[] sz1 = {100, 50, 20, 10, 5, 1};
	int a;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 6;i++)
	{
	System.out.printf("%d\n",a / sz1[i]);
	a = a % sz1[i];
	}
	return 0;
	}
}

