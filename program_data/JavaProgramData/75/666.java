package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int[] c = new int[1001];
		int n;
		int max = 0;
		char sign;
		n = 1;
		a[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sign = System.in.read();
		while (sign == ',')
		{
			n++;
			a[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sign = System.in.read();
		}
		n = 1;
		b[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sign = System.in.read();
		while (sign == ',')
		{
			n++;
			b[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sign = System.in.read();
		}
		for (int i = 1; i <= n; i++)
		{
			for (int j = a[i]; j <= b[i] - 1; j++)
			{
				c[j]++;
			}
		}
		for (int i = 1; i <= 999; i++)
		{
			max = c[i] > max != 0 ? c[i]: max;
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}
}

