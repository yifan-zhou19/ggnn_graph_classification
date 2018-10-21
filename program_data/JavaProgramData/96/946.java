package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		int[] c = new int[100];
		int i;
		int k;
		int m;
		double n;
		a = new Scanner(System.in).nextLine();
		k = a.length();
		for (i = 0;i < k;i++)
		{
			b[i] = a.charAt(i) - 48;
		}
		if (k > 1)
		{
			for (i = 0;i < k - 1;i++)
			{
				m = 10 * b[i] + b[i + 1];
				n = m / 13;
				c[i] = Math.floor(n);
				b[i + 1] = m % 13;
			}
			if (c[0] != 0 || k <= 2)
			{
				System.out.print(c[0]);
			}
			for (i = 1;i < k - 1;i++)
			{
				System.out.print(c[i]);
			}
			System.out.print("\n");
			System.out.print(b[k - 1]);
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(b[0]);
			System.out.print("\n");
		}
		return 0;
	}
}
