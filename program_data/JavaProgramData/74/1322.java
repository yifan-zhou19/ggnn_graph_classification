package <missing>;

public class GlobalMembers
{
	public static int hui(int n)
	{
		int i = 0;
		int N = n;
		for (;n != 0;)
		{
			i = i * 10 + n % 10;
			n = n / 10;
		}

	if (N == i)
	{
		return 1;
	}
		else
		{
			return 0;
		}
	}
	public static int su(int n)
	{
		if (n == 1)
		{
			return 0;
		}
		else if (n == 2)
		{
			return 1;
		}
		else if (n % 2 == 0)
		{
			return 0;
		}
		else
		{
			int i;
			int flag = 1;
			for (i = 3;i < n;i++)
			{
				if (n % i == 0)
				{
				flag = 0;
				break;
				}
			}
			if (flag == 1)
			{
				return 1;
			}
			if (flag == 0)
			{
				return 0;
			}
		}
	}

	public static void Main()
	{
		int min;
		int max;
		int i;
		int[] k = new int[1000];
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			min = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			max = Integer.parseInt(tempVar2);
		}
		for (i = min;i <= max;i++)
		{
			if (hui(i) == 1 && su(i) == 1)
			{
			k[j] = i;
			j++;
			}
		}
			if (j != 0)
			{
		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%d,",k[i]);
		}
		System.out.printf("%d\n",k[j - 1]);
			}
			else
			{
				System.out.print("no\n");
			}
	}

}

