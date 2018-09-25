package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] sz = new int[MAX_LENGTH];
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(sz[i]) = Integer.parseInt(tempVar2);
		}
	}
	if (sz[0] > sz[1])
	{
		a = sz[0];
		b = sz[1];
	}
	else
	{
		a = sz[1];
		b = sz[0];
	}
	for (i = 2;i < n;i++)
	{
		if (sz[i] > a)
		{
			b = a;
			a = sz[i];
		}
		else
		{
			if (sz[i] > b)
			{
				b = sz[i];
			}
		}
	}
		System.out.printf("%d\n%d",a,b);
		return 0;
	}
}

