package <missing>;

public class GlobalMembers
{
	public static int su(int k)
	{
		int i;
		int t;
	t = 1;
	for (i = 2;i < k;i++)
	{
		if (k % i == 0)
		{
			t = 0;
		break;
		}
	}
	return (t);
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
	k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 2;i < n - 1;i++)
	{
		if (su(i) == 1 && su(i + 2) == 1)
		{
		k = 1;
	System.out.printf("%d %d\n",i,i + 2);
		}
	}
	if (k == 0)
	{
	System.out.print("empty");
	}
	return 0;
	}


}

