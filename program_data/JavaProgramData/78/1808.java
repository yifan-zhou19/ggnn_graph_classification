package <missing>;

public class GlobalMembers
{
	/*
	 *????weight.cpp
	 *??????
	 *?????2012-10-15
	 *??????
	 */



	public static int Main()
	{
		int i; // ???? a[]???? w[]????
		int j;
		int t;
		int z = 0;
		int q = 1;
		int s = 2;
		int l = 3;
		int[] a = new int[4];
		int[] w = new int[4];
		char ch;
		char[] name = {'z', 'q', 's', 'l'};
		for (w[z] = 10;w[z] <= 50;w[z] += 10) // ????
		{
			for (w[q] = 10;w[q] <= 50;w[q] += 10)
			{
				for (w[s] = 10;w[s] <= 50;w[s] += 10)
				{
					for (w[l] = 10;w[l] <= 50;w[l] += 10)
					{
						if (w[z] + w[q] == w[s] + w[l] && w[z] + w[l] > w[s] + w[q] && w[z] + w[s] < w[q]) // ??
						{
							a[z] = (w[z] < w[q]) + (w[z] < w[s]) + (w[z] < w[l]); // ????
							a[q] = (w[q] < w[z]) + (w[q] < w[s]) + (w[q] < w[l]);
							a[s] = (w[s] < w[z]) + (w[s] < w[q]) + (w[s] < w[l]);
							a[l] = (w[l] < w[z]) + (w[l] < w[q]) + (w[l] < w[s]);
							for (i = 0;i < 4;i++) // ??
							{
								for (j = i + 1;j < 4;j++)
								{
									if (a[i] > a[j])
									{
										t = a[i];
										a[i] = a[j];
										a[j] = t; // ??
										t = w[i];
										w[i] = w[j];
										w[j] = t;
										ch = name[i];
										name[i] = name[j];
										name[j] = ch;
									}
								}
							}
							for (i = 0;i < 4;i++) // ??
							{
								System.out.print(name[i]);
								System.out.print(' ');
								System.out.print(w[i]);
								System.out.print("\n");
							}
							return 0;
						}
					}
				}
			}
		}
		return 0;
	}
}
