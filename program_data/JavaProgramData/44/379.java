package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int r = 0;
		int m;
		int n = 1;
		int s = 1;
		int i = 0;
		int j = 1;
		int a;
		int C = 1;
		if (num < 0)
		{
			num = -num;
			C = 0;
		}
		while (s != 0)
		{
			j = j * 10;
			s = num / j;
			i++; //i?num???
		}
		for (m = i; m > 0; m--)
		{
			j = j / 10;
			r = r + (num / j) * n;
			n = n * 10;
			a = num / j;
			num = num - a * j;

		}
		if (C == 0)
		{
			r = -r;
		}
		return r;
	}
	public static int Main()
	{
		int i = 0;
		int[] a = new int[6];

		for (i = 0; i < 6; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}

		for (i = 0; i < 6; i++)
		{
			System.out.printf("%d\n", reverse(a[i]));
		}
		return 0;
	}
}

