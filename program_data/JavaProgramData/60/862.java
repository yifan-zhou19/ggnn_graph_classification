package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int i;
		int e = 0;
		for (i = 1;i < a;i++)
		{
			if (a % i == 0)
			{
				e++;
			}
		}
		if (e == 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}


	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int m = 0;
		int[] sz = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (sushu(i) != 0)
			{
				sz[j] = i;
				j++;
			}
		}
		for (i = 0;i < j;i++)
		{
			if (sz[i + 1] - sz[i] == 2)
			{
				m++;
				System.out.printf("%d",sz[i]);
				System.out.printf(" %d\n",sz[i + 1]);
			}
		}
		if (m == 0)
		{
			System.out.print("empty\n");
		}

		return 0;


	}


}

