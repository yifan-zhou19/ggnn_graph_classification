package <missing>;

public class GlobalMembers
{
	public static int function(int m,int n)
	{
		int sum = 0;
		if (m == 0 || m == 1 || n == 1)
		{
		return 1;
		}
		else if (m < 0)
		{
		return 0;
		}
		else
		{
			sum = sum + function(m, n - 1) + function(m - n, n);
		}
		return sum;
	}


	public static void Main()
	{
		int t;
		int i;
		int[] M = new int[20];
		int[] N = new int[20];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= t - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				N[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i <= t - 1;i++)
		{
			System.out.printf("%d\n",function(M[i], N[i]));
		}
	}

}

