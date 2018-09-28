package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int back = 0;
		int flag = 0;
		if (n >= 0 && n <= 9)
		{
			back = n;
		}
		else
		{
			if (n < 0)
			{
				flag = 1;
				n = -n;
			}
			while (n >= 1)
			{
				back = back * 10 + n % 10;
				n = n / 10;
			}
		}
		if (flag == 0)
		{
			return back;
		}
		else
		{
			return -back;
		}
	}
	public static int Main()
	{
		int i;
		int[] a = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",reverse(a[i]));
		}
		return 0;
	}
}

