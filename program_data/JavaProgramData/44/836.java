package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void re(int n);
		int n;
		int i;
		for (i = 0;i < 6;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		re(n);
		}
	}
	public static void re(int n)
	{
		int[] c = new int[10];
		int h = 1;
		int sum = 0;
		int i;
		int j;
		if (n < 0)
		{
			System.out.print("-");
			n = -n;
		}
		for (i = 0;n != 0;i++)
		{
			c[i] = n % 10;
			n /= 10;
		}
		for (j = 0;j < i;j++)
		{
			sum += (c[i - j - 1] * h);
			h *= 10;
		}
		System.out.printf("%d\n",sum);
	}

}

