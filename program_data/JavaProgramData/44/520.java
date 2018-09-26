package <missing>;

public class GlobalMembers
{
	public static int mi(int s)
	{
		int sum = 1;
		int i;
		for (i = 1;i <= s;i++)
		{
		   sum = sum * 10;
		}
		return sum;
	}
	public static int reserve(int n)
	{
		int[] a = new int[100];
		int i;
		int j;
		for (i = 0;;i++)
		{
			a[i] = n % 10;
			n = n / 10;
			if (n == 0)
			{
				break;
			}
		}
		for (j = 0;i >= 0;i--)
		{
			n = n + a[i] * mi(j);
			j++;
		}
		return n;
	}
	public static int Main()
	{
		int i;
		int num;
		for (i = 1;i <= 6;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(reserve(num));
			System.out.print("\n");
		}

		return 0;
	}

}

