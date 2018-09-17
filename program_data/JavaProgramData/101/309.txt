package <missing>;

public class GlobalMembers
{
	//***********************
	//*????????     *
	//*????????     *
	//*??????         *
	//*???11.19          *
	//***********************

	public static int Main()
	{
		char[] n = {'A', 'B', 'C'};
		char t;
		int suma;
		int sumb;
		int sumc;
		int[] q = new int[3];
		int i;
		int j;
		int k;

		for (int a = 0;a < 3;a++)
		{
			for (int b = 0;b < 3;b++)
			{
				for (int c = 0;c < 3;c++)
				{
					suma = (b > a) + (a == c);
					sumb = (a > b) + (a > c);
					sumc = (c > b) + (b > a);
					if (a + suma == b + sumb && b + sumb == c + sumc)
					{
						q[0] = a;
						q[1] = b;
						q[2] = c;
						for (int j = 0;j < 2;j++)
						{
						for (i = j;i < 2;i++)
						{
							if (q[i] > q[i + 1])
							{
								 k = q[i];
								 q[i] = q[i + 1];
								 q[i + 1] = k;
								 t = n[i];
								 n[i] = n[i + 1];
								 n[i + 1] = t;
							}
						}
						}
						for (int i = 0;i < 3;i++)
						{
							System.out.print(n[i]);
						}
						System.out.print("\n");
					}
				}
			}
		}
				return 0;
	}


}
