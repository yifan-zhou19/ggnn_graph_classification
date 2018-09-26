package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static int reverse(int num)
	{
		int[] a = new int[10];
		int i;
		int c = 0;
		int k = 0;
		int h = 1;
		if (num > 0)
		{
			for (i = 1;i <= 9;i++)
			{
				k = k + 1;
				a[i] = num % 10;
				num = num / 10;
				if (num == 0)
				{
					break;
				}
			}
			for (i = k;i >= 1;i--)
			{
				c = c + a[i] * h;
				h = h * 10;
			}
		}
		else
		{
			if (num == 0)
			{
				c = 0;
			}
			else
			{
				num = (-1) * num;
				for (i = 1;i <= 9;i++)
				{
				   k = k + 1;
				   a[i] = num % 10;
				   num = num / 10;
				   if (num == 0)
				   {
					   break;
				   }
				}
				for (i = k;i >= 1;i--)
				{
				   c = c + a[i] * h;
				   h = h * 10;
				}
				c = (-1) * c;
			}
		}
		return c;
	}

	public static int Main()
	{
		int reverse = int num;
		int[] a = new int[7];
		int n;
		int i;

		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		System.out.printf("%d",reverse(a[1]));
		for (i = 2;i <= 6;i++)
		{
			System.out.printf("\n%d",reverse(a[i]));
		}
		return 0;
	}
}

