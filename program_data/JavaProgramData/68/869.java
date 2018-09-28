package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int x;
		int t;
		int q;
		int i;
		int m;
		int n;
		int[] a = new int[25000];
		double j;
		double p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6;i <= n;i = i + 2)
		{
			p = i;
			k = Math.sqrt(p);
			for (j = 3;j <= p;j = j + 2)
			{
				t = Math.sqrt(j);
				q = j;
				for (m = 3;m <= t;m = m + 2)
				{
					if (q % m == 0)
					{
					break;
					}
				}
				if (m > t)
				{
					t = Math.sqrt(p - j);
				q = p - j;
				for (m = 3;m <= t;m = m + 2)
				{
					if (q % m == 0)
					{
					break;
					}
				}
				if (m > t)
				{
					System.out.print(i);
					System.out.print("=");
					System.out.print(j);
					System.out.print("+");
					System.out.print(i - j);
					System.out.print("\n");
				break;
				}
				}
			}
		}
	return 0;
	}
}

