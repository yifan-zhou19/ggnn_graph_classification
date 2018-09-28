package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int m;
		int d;
		int sum = 0;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int w0 = w;
		int[] a = new int[14];
		a[1] = a[3] = a[5] = a[7] = a[8] = a[10] = a[12] = 31;
		a[4] = a[6] = a[9] = a[11] = 30;
		a[2] = 28;
		for (m = 1; m <= 12; m++)
		{
			for (int i = 1; i < m; i++)
			{
				sum += a[i];
			}
			sum += 12;
			d = sum % 7;
			w = w + d;
			if (w % 7 == 5)
			{
				System.out.print(m);
				System.out.print("\n");
			}
			sum = 0;
			w = w0;
		}
		return 0;
	}

}

