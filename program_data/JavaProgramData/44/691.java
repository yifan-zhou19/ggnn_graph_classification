package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{

		int rvs = 0;
		int i;
		int j;
		int[] a = new int[100];
		int numz;
		if (num == 0)
		{
			rvs = 0;
		}
		else
		{
			if (num < 0)
			{
				numz = 0 - num;
			}
			else
			{
				numz = num;
			}
			for (i = 0;;i++)
			{
				a[i] = numz % 10;
				numz /= 10;
				if (numz < 1)
				{
					break;
				}
			}
			for (j = 0;j < i + 1;j++)
			{
				rvs *= 10;
				rvs += a[j];
			}
			if (num < 0)
			{
				rvs *= (-1);
			}

		}
		return rvs;
	}
	public static int Main()
	{
		int n;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(n));
		}
		return 0;
	}
}

