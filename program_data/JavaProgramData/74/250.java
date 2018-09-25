package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int flag = 1;
		int i;
		for (i = 2;i < x / 2 && flag == 1;i++)
		{
			if (x % i == 0)
			{
				flag = 0;
			}
		}
		return (flag);
	}
	public static int huiwen(int x)
	{
		int flag = 1;
		int i;
		int k;
		int[] digit = new int[9];
		for (k = 0;x != 0;k++)
		{
			digit[k] = x % 10;
			x /= 10;
		}
		k = k - 1;
		for (i = 0;i < k;i++,k--)
		{
			if (digit[i] != digit[k])
			{
				break;
			}
		}
		if (i < k)
		{
			flag = 0;
		}
		return (flag);
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
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
		for (i = m;i <= n;i++)
		{
			if (prime(i) != 0 && huiwen(i) != 0)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		if (i > n)
		{
			System.out.print("no");
		}
		for (j = i + 2;j <= n;j = j + 2)
		{
			if (prime(j) != 0 && huiwen(j) != 0)
			{
			System.out.printf(",%d",j);
			}
		}
	}
}

