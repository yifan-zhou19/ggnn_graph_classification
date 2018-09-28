package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int[] M = new int[20];
		int[] N = new int[20];
		int i;
		int K;
		int Apples_Set = new int(int a,int b);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}


		for (i = 1;i <= t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				N[i] = Integer.parseInt(tempVar3);
			}

		}

		for (i = 1;i <= t;i++)
		{
			K = Apples_Set(M[i], N[i]);
			System.out.printf("%d\n",K);
		}

	}

	public static int Apples_Set(int a, int b)
	{
		if ((a < 1) || (b < 1))
		{
			return 0;
		}
		if ((a == 1) || (b == 1))
		{
			return 1;
		}
		if (a < b)
		{
			return Apples_Set(a, a);
		}
		if (a == b)
		{
			return Apples_Set(a, b - 1) + 1;
		}
		return Apples_Set(a, b - 1) + Apples_Set(a - b, b);
	}

}

