package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t = 0;
		int s1 = 0;
		int d;
		int s2 = 0;
		int d2 = 80;
		char[][] a = new char[500][41];
		(char)(*p)[41];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		while (t < n)
		{
			d = String.valueOf(a[t]).length();
			t++;
			if (d > d2)
			{
				s2 = t - 2;
				System.out.print(a[s1]);
				for (p = a + s1 + 1; p <= a + s2; p++)
				{
					System.out.print(" ");
					System.out.print(p);
				}
				System.out.print("\n");
				s1 = t - 1;
				d2 = 79 - d;
			}
			else
			{
				d2 = d2 - d - 1;
			}
		}
		if (t - s1 >= 1)
		{
			System.out.print(a[s1]);
			for (p = a + s1 + 1; p <= a + n - 1; p++)
			{
				System.out.print(" ");
				System.out.print(p);
			}
			System.out.print("\n");
		}
		return 0;
	}






}

