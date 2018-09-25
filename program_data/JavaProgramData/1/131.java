package <missing>;

public class GlobalMembers
{
	public static int num(int a,int b,int c) //??????????
	{
		int sum = 0; //sum????
		int j;
		if (a > c)
		{
			return 0; //???????????????0
		}
		if (b == 1)
		{
			return 1; //????????????????
		}
		for (j = a;j <= c;j++) //?????????????
		{
			if (c % j == 0)
			{
				sum = sum + num(j, b - 1, c / j);
			}
		}
		return sum;
	}
	public static int Main()
	{
		int k; //e??????
		int n;
		int m;
		int e = 0;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (e < n)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = 0; //k??m????????????????
			int f = m;
			for (i = 2;i <= f;i++)
			{
				if (f % i == 0)
				{
					k++;
					f = f / i;
					i = 1;
				}
			}
			System.out.print(num(1, k, m));
			System.out.print("\n");
			e++;
		}
		return 0;
	}

}

