package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int t = 0;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((a - 90) * (a - 140) <= 0 && (b - 60) * (b - 90) <= 0)
			{
			 t += 1;
			}
			else
			{
				t = 0;
			}
			if (t > m)
			{
				m = t;
			}
		}
		System.out.print(m);
		System.out.print("\n");

		return 0;
	}

}

