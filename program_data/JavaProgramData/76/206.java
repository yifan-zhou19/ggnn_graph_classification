package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int max = 0;
		int min = 100000;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int flag = 0;
		int[] c = new int[200000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			{
			for (j = 2 * a[i];j <= 2 * b[i] - 1;j = j + 1)
			{
				if (c[j] == 0)
				{
					c[j] = 1;
				}
			}
			if (a[i] < min)
			{
				min = a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		}

		for (j = 2 * min;j <= 2 * max - 1;j = j + 1)
		{
			if (c[j] == 0)
			{
					flag = 1;
			}
		}
		if (flag == 0)
		{
				System.out.printf("%d %d",min,max);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

