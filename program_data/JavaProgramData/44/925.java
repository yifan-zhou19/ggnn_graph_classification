package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] a = new int[6];
		int reverse = int num;
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
	}
		public static int reverse(int num)
		{
			int i;
			int[] x = new int[5];
			int y = 0;
			int a;
			int j;
			for (i = 0;i < 5;i++)
			{
				 x[i] = num % 10;
				 num = (num - x[i]) / 10;
			}
			for (i = 4;i >= 0;i--)
			{
				if (x[i] != 0)
				{
					a = i;
					break;
				}
			}
			for (i = a;i >= 0;i--)
			{
				for (j = 0;j <= i;j++)
				{
				x[a - i] = x[a - i] * 10;
				}
				y = y + x[a - i];
			}
			y = y / 10;
			if (num < 0)
			{
				y = -y;
			}
			else
			{
				y = y;
			}
			return (y);

		}

}

