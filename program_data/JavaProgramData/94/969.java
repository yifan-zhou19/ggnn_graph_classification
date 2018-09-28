package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[500];
		int i;
		for (i = 0;i < N;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int d; //d???
		int p = 0;
		int[] b = new int[500]; //??????
		for (i = 0;i < N;i++)
		{
			d = a[i] % 2;
			if (d == 1)
			{
				b[p++] = a[i]; //??????
			}
		}
		int m;
		int n;
		int x;
		for (m = 0;m < p - 1;m++) //????
		{
			for (n = 0;n < p - 1 - m;n++)
			{
				if (b[n] > b[n + 1])
				{
					x = b[n];
				 b[n] = b[n + 1];
				 b[n + 1] = x;
				}
			}
		}
		for (n = 0;n < p - 1;n++)
		{
			System.out.print(b[n]);
			System.out.print(",");
		}
		System.out.print(b[p - 1]);
		System.in.read();
		System.in.read();
		return 0;
	}
}

