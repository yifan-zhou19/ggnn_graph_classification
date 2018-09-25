package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		for (a = 10;a <= 50;a += 10)
		{
			for (b = 10;b <= 50;b += 10)
			{
				for (c = 10;c <= 50;c += 10)
				{
					for (d = 10;d <= 50;d += 10)
					{
					   if (a + b == c + d && (a + d) > (b + c) && (a + c) < b)
					   {
							int[] kg = {a, b, c, d};
							char[] py = {'z', 'q', 's', 'l'};
							int t;
							char k;
							for (int j = 0;j < 3;j++)
							{
								for (int i = 0;i < 3 - j;i++)
								{
								   if (kg[i] < kg[i + 1])
								   {
									 t = kg[i];
									 kg[i] = kg[i + 1];
									 kg[i + 1] = t;
									 k = py[i];
									 py[i] = py[i + 1];
									 py[i + 1] = k;
								   }
								}
							}

						System.out.print(py[0]);
						System.out.print(" ");
						System.out.print(kg[0]);
						System.out.print("\n");
						System.out.print(py[1]);
						System.out.print(" ");
						System.out.print(kg[1]);
						System.out.print("\n");
						System.out.print(py[2]);
						System.out.print(" ");
						System.out.print(kg[2]);
						System.out.print("\n");
						System.out.print(py[3]);
						System.out.print(" ");
						System.out.print(kg[3]);
						System.out.print("\n");
					   }
					}
				}
			}
		}
		   return 0;
	}
}
