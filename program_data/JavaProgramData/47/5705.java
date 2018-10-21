package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int[] num = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	i = 0;
	while (i < n)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num [i] = Integer.parseInt(tempVar2);
		}
		i++;
	}
	i = n - 1;
	while (i > 0)
	{
		System.out.printf("%d ",num [i]);
		i--;
	}
	System.out.printf("%d",num [0]);
	return 0;
	}

}

