package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i;
		int n;
		int[] a = new int[20];
		for (i = 1;;i++)
		{
			if ((num / (int)Math.pow(10.0,i)) == 0)
			{
				n = i;
				break;
			}
		}
		for (i = 1;i <= n;i++)
		{
			a[i] = num / (int)Math.pow(10.0,n - i);
			num = num - a[i] * (int)Math.pow(10.0,n - i);
		}
		num = 0;
		for (i = 1;i <= n;i++)
		{
			num = num + a[i] * (int)Math.pow(10.0,i - 1);
		}
		return num;
	}
	public static int Main()
	{
		int[] num = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < 6;i++)
		{
			if (num[i] >= 0)
			{
				System.out.print(reverse(num[i]));
				System.out.print("\n");
			}
			else
			{
				System.out.print(-reverse(-num[i]));
				System.out.print("\n");
			}
		}
		return 0;
	}
}

