package <missing>;

public class GlobalMembers
{
	public static int huiwen(int a)
	{
		int b = 0;
		int t;
		t = a;
		while (a != 0)
		{
			b = b * 10 + a % 10;
			a /= 10;
		}
		if (t == b)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int sushu(int a)
	{
		int i;
		if (a == 2)
		{
			return (1);
		}
		for (i = 2;i < Math.sqrt(a) + 1;i++)
		{
			if (a % i == 0)
			{
				return (0);
			}
		}
		return (1);
	}
	public static void Main()
	{
		int n;
		int m;
		int t = 0;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (k = m;k <= n;k++)
		{
			if (huiwen(k) == 1 && sushu(k) == 1)
			{
				System.out.printf("%d",k);
				t++;
				break;
			}
		}
		for (i = k + 1;i <= n;i++)
		{
			if (huiwen(i) == 1 && sushu(i) == 1)
			{
				System.out.printf(",%d",i);
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
	}




}

