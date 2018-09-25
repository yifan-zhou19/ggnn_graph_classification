package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		int f = new int(int,int);
		int[] n = new int[100];
		int sum;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < m;i++)
		{
			sum = f(1, n[i]) + 1;
		System.out.printf("%d\n",sum);
		}

	}


	public static int f(int i,int n)
	{
		int j;
		int k;
		int sum = 0;
		for (j = i;j < (int)Math.sqrt((double)n) + 1;j++)
		{

			k = sum;
			if (j == 1)
			{
				sum = 0;
			}
			else
			{
				if (n % j == 0 && n / j >= j)
				{
				sum = f(j, n / j) + 1;
				}
				else
				{
					sum = 0;
				}
			}
			sum = sum + k;

		}
		return (sum);
	}


}

