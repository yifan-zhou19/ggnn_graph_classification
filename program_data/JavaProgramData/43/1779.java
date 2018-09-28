package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[N];
		int m;
		int i;
		int j;
		int test;
		int number = 0;
		for (i = 3;i <= N;i++)
		{
			test = 1;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					test = 0;
				}
			}
			if (test != 0)
			{
				number = number + 1;
				a[number - 1] = i;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < number;i++)
		{
			for (j = i;j < number;j++)
			{
				if (a[i] + a[j] == m)
				{
					System.out.printf("%d %d\n",a[i],a[j]);
				}
			}
		}
		return 0;
	}
}

