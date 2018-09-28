package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int n = 0;
		int j = 0;
		int t;
		int[] shuzi = new int[100];
		for (j = 1;j < 100;j++)
		{
			shuzi[j] = 0;
		}
		if (num > 0)
		{
			t = num;
			while (num != 0) //?????
			{
				num = num / 10;
				n++;
			}
			num = t;
			for (j = 1;j <= n;j++) //?????
			{
				shuzi[j] = num % 10;
				num = num / 10;
			}
			for (j = 1;j <= n;j++) //?????
			{
				num = shuzi[j] + num * 10;
			}
		}
		if (num < 0)
		{
			t = num;
			while (num != 0)
			{
				num = num / 10;
				n++;
			}
			num = -t;
			for (j = 1;j <= n;j++)
			{
				shuzi[j] = num % 10;
				num = num / 10;
			}
			for (j = 1;j <= n;j++)
			{
				num = shuzi[j] + num * 10;
			}
			num = (-1) * num;
		}
		return num;
	}
	public static int Main()
	{
		int[] a = new int[7]; //????????
		int i = 0;
		for (i = 1;i <= 6;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = reverse(a[i]); //????????
		}
		for (i = 1;i <= 6;i++)
		{
			System.out.print(a[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

