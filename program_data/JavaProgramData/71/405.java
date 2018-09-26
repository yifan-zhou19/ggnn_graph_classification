package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int i;
		int a;
		int b;
		int c;
		int d;
		int e;
		int j;
		int x = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m[2] = 28;
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{
			 m[2] = 29;
			}

			d = (b < c)?b:c;
			e = (b > c)?b:c;
			x = 0;
			for (j = d;j < e;j++)
			{
			x = x + m[j];
			}

			if (x % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

