package <missing>;

public class GlobalMembers
{
	public static int su(int x)
	{
		int i;
		int j = 0;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
			return (0);
			j = 1;
			break;
			}
		}
		if (j == 0)
		{
			return (1);
		}
	}

	public static int hui(int x)
	{
		int i;
		int j;
		int y = 0;
		int p;
		p = x;
		while (x > 0)
		{
		  y = (10 * y + x % 10);
		  x = x / 10;
		}
		if (p == y)
		{
			return (1);
		}
		 else
		 {
			 return (0);
		 }
	}


	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int sum = 0;
		int[] s = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = a;i <= b;i++)
		{
			if (hui(i) == 1 && su(i) == 1)
			{
				sum++;
				s[sum] = i;
			}
		}
		if (sum == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 1;i < sum;i++)
			{
				System.out.printf("%ld,",s[i]);
			}
			System.out.printf("%ld\n",s[sum]);
		}
	}

}

