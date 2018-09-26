package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4];
		int w1;
		int w2;
		int w3;
		int w4;
		int i;
		int j;
		int k;
		int h;
		int t;
		char[] b = {'z', 'q', 's', 'l'};
		char c;
		for (i = 1;i <= 5;i++)
		{
			w1 = i;
			for (j = 1;j <= 5;j++)
			{
				w2 = j;
				for (k = 1;k <= 5;k++)
				{
					w3 = k;
					for (h = 1;h <= 5;h++)
					{
						w4 = h;
						if (((w1 + w2) == (w3 + w4)) && ((w1 + w4) > (w2 + w3)) && ((w1 + w3) < w2))
						{
							a[0] = w1;
							a[1] = w2;
							a[2] = w3;
							a[3] = w4;
						}
					}
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
		 for (j = i + 1;j < 4;j++)
		 {
			if (a[i] < a[j])
			{
				t = a[i];
				a[i] = a[j];
				a[j] = t;
				c = b[i];
				b[i] = b[j];
				b[j] = c;
			}
		 }
		}
		for (i = 0;i < 4;i++)
		{
		System.out.print(b[i]);
		System.out.print(" ");
		System.out.print(a[i] * 10);
		System.out.print("\n");
		}
		return 0;
	}
}
