package <missing>;

public class GlobalMembers
{
	public static int huiwen(int n)
	{
		int[] a = new int[11];
		int i = 0;
		while (n != 0)
		{
			a[i] = n % 10;
			i++;
			n = n / 10;
		}
		int j;
		for (j = 0;j < i / 2;j++)
		{
			if (a[j] != a[i - 1 - j])
			{
				return 0;
			}
		}
		return 1;
	}
	public static int sushu(int n)
	{
		int i;
		for (i = 2;i <= (int)Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
			return 1;
	}
	public static void Main()
	{
		int i;
		int count = 0;
		int m;
		int n;
		int temp;
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
		if (m > n)
		{
			temp = m;
			m = n;
			n = temp;
		}
		for (i = m;i <= n;i++)
		{
			if (huiwen(i) != 0 && sushu(i) != 0)
			{
				System.out.printf("%ld",i);
				count++;
				break;
			}
		}
		if (count == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i++;i <= n;i++)
			{
				if (huiwen(i) != 0 && sushu(i) != 0)
				{
					System.out.printf(",%ld",i);
				}
			}
		}
	}
}

