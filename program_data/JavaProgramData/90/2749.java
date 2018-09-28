package <missing>;

public class GlobalMembers
{
	public static int M;
	public static int N;

	public static int apple(int num,int m)
	{
		int i;
		int a;
		int sum = 0;
		if (num == 0)
		{
			return sum;
		}


		else
		{
			if (m > num)
			{
			for (i = num;i > 0;i--)
			{
				a = m - i;
				sum += apple(i, a);
			}
			}
			else
			{
				sum += 1;
				num = m - 1;
				sum += apple(num, m);
			}
			return sum;
		}
	}





	public static int Main()
	{
		int t;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}

		for (i = 0;i < t;i++)
		{
		int total = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			M = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			N = Integer.parseInt(tempVar3);
		}

		total = apple(N, M);

		System.out.printf("%d\n",total);
		}

		return 0;
	}



}

