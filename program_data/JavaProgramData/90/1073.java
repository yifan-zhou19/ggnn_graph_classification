package <missing>;

public class GlobalMembers
{
	public static int put(int m,int n) //???????????????
	{
		int sum;
		int sum1;
		int sum2 = 0;
		if (n == 1) //???????????????
		{
		sum = 1;
		}
		else
		{
			if (m == 1) //???????????????
			{
		sum = 1;
			}
		else
		{
		if (n > m)
		{
			sum1 = put(m, n - m); //???????????
		}
		else
		{
			if (n == m)
			{
				sum1 = 1;
			}
			else
			{
				sum1 = 0;
			}
		}
		sum2 = put(m - 1, n); //??????????????
		sum = sum1 + sum2;
		}
		}
		return sum; //???????
	}
	public static int Main()
	{
		int i;
		int m;
		int n;
		int k;
		int t;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			t = put(m, n);
			System.out.print(t);
			System.out.print("\n");
		}
		return 0;
	}

}

