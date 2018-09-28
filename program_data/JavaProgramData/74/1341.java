package <missing>;

public class GlobalMembers
{
	public static int huiwen(int n)
	{
		int k = 0;
		int a;
		int b = n;
		while (b != 0)
		{
			a = b % 10;
			k = k * 10 + a;
			b = b / 10;
		}
		if (k == n)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int sushu(int n)
	{
		int i;
		if (n == 2)
		{
			return 1;
		}
		else
		{
			for (i = 2;i <= (n - 1);i++)
			{
				if (n % i == 0)
				{
				return 0;
				}
			}
			return 1;
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
		int i;
		int k = 0;
		int[] s = new int[1000];
		for (i = 0;i <= (n - m);i++)
		{
			if ((huiwen(m + i) == 1) && (sushu(m + i) == 1))
			{
				s[k] = m + i;
				k = k + 1;
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",s[0]);
			for (i = 1;i < k;i++)
			{
				System.out.printf(",%d",s[i]);
			}
		}
	}
}

