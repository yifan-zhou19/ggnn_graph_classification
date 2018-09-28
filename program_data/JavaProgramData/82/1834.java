package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int t = 0;
		int l = 0;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((a >= 90) && (a <= 140) && (b >= 60) && (b <= 90))
			{
				t = t + 1;
				if (i < n)
				{
				continue;
				}
				else if (t > l)
				{
					l = t;
					break;
				}
				else
				{
				break;
				}
			}
			else
			{
				if (t > l)
				{
					l = t;
					t = 0;
				}
				else
				{
					t = 0;
				}
			}
		}
		System.out.print(l);
		System.out.print("\n");
		return 0;
	}
}

