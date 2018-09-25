package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int c = 0;
		int flag = 0;
		int[] x = new int[80000];
		int[] y = new int[80000];
		int[] z = new int[80000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			z[i] = 1;
		}
		for (int i = 0;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			if (0 == x[i] && 0 == y[i])
			{
				c = i;
				break;
			}
		}
		for (int i = 0;i < c;i++)
		{
			z[x[i]] = z[x[i]] - 1;
			z[y[i]] = z[y[i]] + 1;
		}
		for (int i = 0;i < n;i++)
		{
			if (z[i] == n)
			{
				System.out.printf("%d",i);
				flag = 1;
			}
		}
		if (flag == 0)
		{
		System.out.print("NOT FOUND");
		}
	//printf("0");
	}
}

