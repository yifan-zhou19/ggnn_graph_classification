package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void m(int a,int b);
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		m(n, k);
		return 0;
	}

	public static void m(int a,int b)
	{
		int i;
		int j;
		int k;
		int m = 0;
		int sum;
		for (j = 1;m < a - 1;j++)
		{
			sum = j * (a - 1);
			k = 0;
			while (k < a)
			{
				if ((sum * a / (a - 1) + b) % (a - 1) == 0)
				{
					sum = sum * a / (a - 1) + b;
					k++;
					m = k;
					if (k == a - 1)
					{
						System.out.printf("%d",sum * a / (a - 1) + b);
					}
				}
				else
				{
					break;
				}
			}
		}
	}
}

