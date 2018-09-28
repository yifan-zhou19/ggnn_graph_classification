package <missing>;

public class GlobalMembers
{
	public static void reverse(int n)
	{
		int[] a = new int[12];
		int tmp;
		int i;
		int j;
		int state = 0;
		tmp = (n >= 0)? n:-n;
		for (j = 0;tmp >= 1;j++)
		{
			a[j] = tmp % 10;
			tmp /= 10;
		}
		if (n < 0)
		{
			System.out.print("-");
		}
		for (i = 0;i < j;i++)
		{
			if (state != 0)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
				if (a[i] != 0 && state == 0)
				{
					System.out.printf("%d",a[i]);
					state = 1;
				}
			}
		}
		if (state == 0)
		{
			System.out.print("0");
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		int n;
		int i;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			reverse(n);
		}
		return 0;
	}
}

