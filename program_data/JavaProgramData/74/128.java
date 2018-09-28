package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int huiwen = int a;
		int sushu = int b;
		int m;
		int n;
		int i;
		int t = 0;
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
		for (i = m;i <= n;i++)
		{
			if (huiwen(i) == 1 && sushu(i) == 1)
			{
			System.out.printf("%d",i);
			t++;
			break;
			}
		}
		for (i = i + 1;i <= n;i++)
		{
			if (huiwen(i) == 1 && sushu(i) == 1)
			{
				System.out.printf(",%d",i);
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
	}
	public static int huiwen(int a)
	{
		int k;
		int t = 0;
		int s;
		s = a;
		while (a > 0)
		{
			k = a % 10;
			a = a / 10;
			t = t * 10 + k;
		}
		if (s == t)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int sushu(int b)
	{
		int i;
		for (i = 2;i <= b;i++)
		{
			if (b % i == 0)
			{
				break;
			}
		}
		if (b == i)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
}

