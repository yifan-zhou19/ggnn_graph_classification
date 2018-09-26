package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int m = 0;
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
		i = 1;
		while (m != n - 1)
		{
		z = i * (n - 1);
		for (j = 0;j < n - 1;j++)
		{
			if ((z / (n - 1) * n + k) % (n - 1) == 0)
			{
			z = z / (n - 1) * n + k;
			m += 1;
			}
			else
			{
				m = 0;
				break;
			}
		}
		i++;
		}
		z = z / (n - 1) * n + k;
		System.out.printf("%d",z);
		return 0;
	}
}

