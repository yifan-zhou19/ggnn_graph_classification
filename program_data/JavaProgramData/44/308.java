package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int b;
		int c = 0;
		int i;
		int j;
		for (i = 0;;i++)
		{
			b = num % 10;
			num = num / 10;
			c = 10 * c + b;
			if (num == 0)
			{
				break;
			}

		}
		return c;
	}
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		int k;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			k = reverse(a[i]);
			System.out.printf("%d\n",k);
		}
		return 0;
	}

}

