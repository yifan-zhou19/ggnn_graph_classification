package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int i = 1;
		int n = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (System.in.read() != '\n')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			i++;
			n++;
		}
		int[] b = new int[1000];
		i = 1;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[0] = Integer.parseInt(tempVar3);
		}
		while (System.in.read() != '\n')
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
			i++;
		}

		int j;
		int max = 0;
		for (j = 1;j <= 1000;j++)
		{
			int sum = 0;
			for (i = 0;i < n;i++)
			{
				if (a[i] <= j != 0 && b[i]> j)
				{
					sum++;
				}
			}
			if (sum > max)
			{
				max = sum;
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

