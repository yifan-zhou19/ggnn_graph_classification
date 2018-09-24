package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int[] a = new int[500];
	int i;
	int u = 0;
	int t;
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
			t = Integer.parseInt(tempVar2);
		}
	if (a[t] == 0)
	{
		if (u == 0)
		{
			System.out.printf("%d",t);
		}
		else
		{
			System.out.printf(",%d",t);
		}
		++a[t];
		++u;
	}

	}
	}
}

