package <missing>;

public class GlobalMembers
{
		public static int N;
		public static int[] a = new int[500];
		public static int t = 0;
		public static int i = 0;
		public static int j = 0;
		public static int k = 0;
		public static int x;
		public static int y;
	public static int Main()
	{

		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < N;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x % 2 == 1)
			{
				a[t] = x; //????
				t++;
			}
		}
		for (j = 0;j < t;j++) //????
		{
			for (k = 0;k < t - j - 1;k++)
			{
				if (a[k] > a[k + 1])
				{
					y = a[k];
					a[k] = a[k + 1];
					a[k + 1] = y;
				}
			}
		}
		for (k = 0;k < t - 1;k++)
		{
			System.out.print(a[k]);
			System.out.print(",");
		}
		System.out.print(a[k]);
		return 0;
	}

}

