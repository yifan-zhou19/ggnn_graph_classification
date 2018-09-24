package <missing>;

public class GlobalMembers
{
	//****************************************************************
	// ????1000012789_2.cpp                                      *
	// ???wusy                                                    *
	// ???10?27                                                  *
	// ???????????                                        *
	//****************************************************************
	public static int Main()
	{
		int n; //????????????
		int[] a = new int[100001];
		int k;
		int q;
		int count1 = 0;
		int count2 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i <= n - 1; i++) //??????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (a[0] != k) //??1???k????a[0]
		{
			System.out.print(a[0]);

			for (int j = 1; j <= n - 1; j++) //??????k??
			{
				if (a[j] == k) //???
				{
					for (int e = j; e <= n - 1; e++) //????????
					{
					a[e] = a[e+1];
					}

					count1++; //????1
					j--; //j-1?????
				}
			}
				for (int f = 1; f <= n - count1 - 1; f++) //????????n-count1-1
				{
					System.out.print(" ");
					System.out.print(a[f]);
				}
		}

		if (a[0] == k) //??1??k?
		{
			for (int m = 1; m <= n - 1; m++) //?????????????k
			{
				if (a[m] != k) //??k?
				{
					q = m;
					break; //q???????
				}
			}
			System.out.print(a[q]);

			for (int t = q + 1; t <= n - 1; t++) //???a[0]!=k???,????
			{
				if (a[t] == k)
				{
					for (int h = t; h <= n - 1; h++)
					{
						a[h] = a[h + 1];
					}

						count2++;
						t--;
				}
			}
			for (int o = q + 1; o <= n - count2 - 1; o++) //??????n-count2-1
			{
				System.out.print(" ");
				System.out.print(a[o]);
			}
		}
		return 0;
	}




}

