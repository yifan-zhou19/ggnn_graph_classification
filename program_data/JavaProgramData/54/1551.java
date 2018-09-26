package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double t1;
		int t2;
		int b = 0;
		for (int i = 1; ; i++)
		{
			t1 = i;
			b = 0;
			for (int j = 1;j <= n ; j++)
			{
				t1 = n * t1 / (n - 1) + k;
				t2 = Math.floor(t1);
				//cout <<t1 << "  " << t2 << endl;
				if (t1 != t2)
				{
					break;
				}
				else
				{
					b++;
				}

			}
			if (b == n)
			{
				System.out.print(t2);
				System.out.print("\n");
				return 0;
			}
		}

	}
}

