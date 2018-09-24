package <missing>;

public class GlobalMembers
{
	public static int f(int x, int y)
	{
		int j;
		int k;
		int t = 0;
		int m = 0;
		for (j = 2;j < x;j++)
		{
			if (x % j == 0)
			{
				t++;
			}
		}
			if (t == 0)
			{
				return 1; //?????,??1
			}
			else
			{
				for (k = y;k <= (int)Math.sqrt((double)x);k++)
				{
					if (x % k == 0)
					{
						m = m + f(x / k, k);
					}
				}
				 return (m + 1);
			}
	}
	public static int Main()
	{
		int n;
		int a;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(a, 2));
			System.out.print("\n");
		}
		return 0;
	}

}

