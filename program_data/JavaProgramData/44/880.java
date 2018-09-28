package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int reverse = int;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			if (a >= 0)
			{
			b = reverse(a);
			}
			if (a < 0)
			{
			a = -a;
			b = -reverse(a);
			}
			System.out.printf("%d", b);
					if (i < 5)
					{
						System.out.print("\n");
					}
		}
		return 0;
	}

	public static int reverse(int a)
	{
		int j;
		int b = 0;
		int k;
		int[] c = new int[10];
		for (j = 9;j >= 0;j--)
		{
			c[j] = a % 10;
			a = a / 10;
			if (a == 0)
			{
				break;
			}
		}
		for (k = 9;k >= j;k--)
		{
			b = b * 10 + c[k];
		}
		return b;
	}

}

