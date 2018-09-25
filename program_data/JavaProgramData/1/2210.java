package <missing>;

public class GlobalMembers
{
	public static int fenjie(int a,int b)
	{
		int i;
		int sign = 0;
		int k = 0;
		if (a < b)
		{
			return 0;
		}
		else if (a == b)
		{
			return 1;
		}
		else
		{
			for (i = 2;i <= a - 1;i++)
			{
				if (a % i == 0)
				{
					sign = 1;
				}
			}
			if (sign != 1)
			{
				return 1;
			}
			else
			{
				for (i = b;i <= a;i++)
				{
					if (a % i == 0)
					{
						k += fenjie(a / i, i);
					}
				}
				k += 1;
				return k;
			}
		}
	}


	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int k;
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
				k = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",fenjie(k, 2));
		}
		return 0;
	}

}

