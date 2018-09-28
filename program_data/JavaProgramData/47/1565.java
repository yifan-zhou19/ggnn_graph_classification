package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int[] z = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		i = 1;
		while (i <= n)
		{
			if (i < n)
			{
				System.out.printf("%d ",z[n - i]);
			}
			else
			{
				System.out.printf("%d",z[n - i]);
			}
			i++;
		}
		return 0;
	}
}

