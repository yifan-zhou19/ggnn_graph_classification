package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] sz = new int[100];
	for (i = 1;i <= n;i++)
	{
		if (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		else
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
	}
	for (i = n;i >= 1;i--)
	{
		if (i > 1)
		{
			System.out.printf("%d ",sz[i]);
		}
		else
		{
			System.out.printf("%d",sz[i]);
		}
	}

	}


}

