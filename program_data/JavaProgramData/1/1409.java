package <missing>;

public class GlobalMembers
{
	public static int num;

	public static int wrh(int n, int r, int[] b, int y, int a)
	{
		int i;
		for (i = y;i <= a / 2;i++)
		{
			if (r % i == 0)
			{
				b[n] = i;
				int now = 1;
				int j;
				for (j = 1;j <= n;j++)
				{
					now = now * b[j];
				}
				if (now == a)
				{
					num++;
					break;
				}
				if (now > a)
				{
					break;
				}
				else
				{
					wrh(n + 1, r / i, b, i, a);
				}
			}
		}
		return 0;
	}

	public static int Main()
	{

		int s;
		int a;
		int[] b = new int[200];
		s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (s > 0)
		{
			num = 0;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			wrh(1, a, b, 2, a);
			System.out.print(num + 1);
			System.out.print("\n");
			s--;
		}
		return 0;
	}

}

