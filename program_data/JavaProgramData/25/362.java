package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[1000];
		int up;
		int add;
		int i;
		int k;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[0] = 1;
		if (n == 0)
		{
			System.out.print(1);
			return 0;
		}
		up = 0;
		while (n > 0)
		{
			add = 0;
			for (i = 0; i <= up; i++)
			{
				k = (num[i] * 2 + add) / 10;
				num[i] = (num[i] * 2 + add) % 10;
				add = k;
			}
			if (add != 0)
			{
				num[++up] = add;
			}
			n--;
		}
		for (i = up; i >= 0; i--)
		{
			System.out.print(num[i]);
		}
		return 0;
	}

}

