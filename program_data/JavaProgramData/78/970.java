package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int z;
		int q;
		int s;
		int l;
		int t;
		int j;
		int[] a = new int[4];

		char[] b = {0, '\0', '\0', '\0'};
		char p;

		for (z = 1;z < 6;z++)

		{

			for (q = 1;q < 6;q++)

			{

				for (s = 1;s < 6;s++)

				{

					for (l = 1;l < 6;l++)
					{

						if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q)

						{

							a[0] = z;

							a[1] = q;

							a[2] = s;

							a[3] = l;

							b[0] = 'z';

							b[1] = 'q';

							  b[2] = 's';

							 b[3] = 'l';

							for (i = 0;i < 4;i++)

							{

								for (j = i + 1;j < 4;j++)

								{

									 if (a[i] < a[j])

									 {
											t = a[i];

											a[i] = a[j];

											a[j] = t;

											p = b[i];

											b[i] = b[j];

											b[j] = p;

									 }

								}

							}

						}
					}

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
