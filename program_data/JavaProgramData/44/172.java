package <missing>;

public class GlobalMembers
{
		public static int reverse(int num)
		{
			int m;
			int d = 0;
			m = num;
			while (m != 0)
			{
					   d = d * 10 + m % 10;
					   m = m / 10;
			}
			return d;
		}
		public static int Main()
		{
		int i;
		int j;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int c;
		for (i = 0;i < 6;i++)
		{
						String tempVar = ConsoleInput.scanfRead();
						if (tempVar != null)
						{
							a[i] = Integer.parseInt(tempVar);
						}
		}
		for (i = 0;i < 6;i++)
		{
						if (a[i] >= 0)
						{
						b[i] = reverse(a[i]);
						}
						else
						{
						j = 0 - a[i];
						c = reverse(j);
						b[i] = 0 - c;
						}
		}
		for (i = 0;i < 6;i++)
		{
						System.out.printf("%d\n",b[i]);
		}
		System.in.read();
		System.in.read();
		System.in.read();
		}

}

