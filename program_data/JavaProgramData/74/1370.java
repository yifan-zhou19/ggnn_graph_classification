package <missing>;

public class GlobalMembers
{
	public static int huiwen(int a)
	{
		int k;
		int n = 0;
		int m;
		m = a;
		while (m != 0)
		{
			k = m % 10;
			n = n * 10 + k;
			m = m / 10;
		}
		if (n == a)
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
		float l = Math.sqrt(a);
		for (i = 2;i <= l;i++)
		{
			if (a % i == 0)
			{
				break;
			}
		}
		if (i > l)
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
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int a = m;
		while ((huiwen(a) == 0 || sushu(a) == 0) && a <= n)
		{
			a++;
		}
		if (a > n)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",a);
			for (a++;a <= n;a++)
			{
				if (huiwen(a) == 1 && sushu(a) == 1)
				{
				System.out.printf(",%d",a);
				}
			}
		}
	}
}

