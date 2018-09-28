package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int l;
	   int q = 0;
	   int k1;
	   int k2;
	   int t;
	   int w;
	   int s = 0;
	   int i;

	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i <= n;i++)
	   {
						l = i;
						do
						{
							l = l / 10;
							q++;
						}while (l != 0);
							k2 = i;
							w = 1;
							for (t = 1;t <= q;t++)
							{
											   k1 = k2;
											   k2 = k1 / 10;
											   if ((k1 - 10 * k2) % 7 == 0 && (k1 - 10 * k2) != 0 || i % 7 == 0)
											   {
												   w = 0;
											   }
							}
											   if (w == 1)
											   {
											   s = s + i * i;
											   }
	   }
						System.out.print(s);

						return 0;

	}

}

