package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int rev;

		if (n == 0)
		{
			rev = 0;
		}
		if (n < 0)
		{
			n = (-1) * n;
			rev = reverse(n) * (-1);
		}
		else
		{
			for (rev = 0;n != 0;)
			{
				rev = n % 10 + 10 * rev;
				n /= 10;
			}
		}
		return rev;
	}
	public static int Main()
	{
		int[] n = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",reverse(n[i]));
		}
		return 0;
	}
}

