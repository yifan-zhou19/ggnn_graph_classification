package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int i;
		int m;
		int[] re = new int[10];
		if (n > 0)
		{
			for (m = 0;n != 0;m++)
			{
				re[m] = n % 10;
				n = n / 10;
			}
			for (i = 0,n = 0;i < m;i++)
			{
				n = n * 10 + re[i];
			}
			for (i = 0;i < 10;i++)
			{
				re[i] = 0;
			}
		}
		if (n == 0 || n == -0)
		{
			n = 0;
		}
		if (n < 0)
		{
			n = -n;
			for (m = 0;n != 0;m++)
			{
				re[m] = n % 10;
				n = n / 10;
			}
			for (i = 0,n = 0;i < m;i++)
			{
				n = n * 10 + re[i];
			}
			n = n * (-1);
			for (i = 0;i < 10;i++)
			{
				re[i] = 0;
			}
		}
		return (n);
	}
	public static void Main()
	{
		int i;
		int[] s = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",reverse(s[i]));
		}
	}

}

