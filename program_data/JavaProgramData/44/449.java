package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int x = 0;
		int y = 0;
		int k = 0;
		if (num == 0)
		{
		return 0;
		}
		System.out.print("\n");
		while (num > 0)
		{
			x = num % 10;
			y = y * 10 + x;
			num = num / 10;
			if (num == 0)
			{
			break;
			}
		}
		return y;
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
			if (n[i] >= 0)
			{
				reverse(n[i]);
				System.out.printf("%d\n",reverse(n[i]));
			}
			else
			{
				reverse(-n[i]);
				System.out.printf("-%d\n",reverse(-n[i]));
			}
		}
	}
}

