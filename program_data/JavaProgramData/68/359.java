package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int k;
		int i;
		int f = int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= a;i = i + 2)
		{
			for (k = 3;k <= i / 2;k = k + 2)
			{
				if (f(k) == 0 && f(i - k) == 0)
				{
					System.out.printf("%ld=%ld+%ld\n",i,k,i - k);
					break;
				}
			}
		}
	}
	public static int f(int x)
	{
		int j;
		int sum;
		sum = 0;
		for (j = 3;j <= Math.floor(Math.sqrt(x));j = j + 2)
		{
			if (x % j == 0)
			{
			sum = 1;
			break;
			}
		}
		return (sum);
	}

}

