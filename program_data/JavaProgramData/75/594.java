package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1001];
		int[] y = new int[1001];
		int[] t = new int[1001];
		int i;
		int j;
		int k;
		int m = 0;
		char a = ',';
		for (i = 1 ; a == ',' ; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = System.in.read();
		}
		a = ',';
		for (i = 1 ; a == ',' ; i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = System.in.read();
		}
		System.out.print(i - 1);
		System.out.print(" ");
		for (j = 1; j < i; j++)
		{
			for (k = x[j]; k < y[j]; k++)
			{
				t[k] = t[k] + 1;
			}
		}
		for (int l = 1; l <= 1000; l++)
		{
			if (t[l] > m)
			{
				m = t[l];
			}
		}
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}
}

