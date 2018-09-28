package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int m;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (z = 1;;z++)
		{
			m = n * z + k;
			for (i = 2;i <= n != 0 && m % (n - 1) == 0;i++)
			{
				m = m / (n - 1) * n + k;
			}
			if (i == n + 1)
			{
				System.out.printf("%d",m);
				break;
			}
		}
	}
}

