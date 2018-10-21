package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[25];
	public static int n;
	public static int changdu(int i)
	{
		int j;
		int max;
		max = 0;
		if (i == n - 1)
		{
		max = 0;
		}
		for (j = i + 1;j < n;j++)
		{
			if (a[j] <= a[i])
			{
			if (changdu(j) > max)
			{
			max = changdu(j);
			}
			}
		}
		return (max + 1);

	}
	public static int Main()
	{
		int max;
		int i;
		max = 0;

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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (changdu(i) > max)
			{
			max = changdu(i);
			}
		}
		System.out.printf("%d",max);

	}

}

