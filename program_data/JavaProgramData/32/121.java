//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
		char[][] a = new char[50][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 2 * n - 2;i = i + 2)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i + 1] = tempVar3.charAt(0);
			}
			System.out.print("\n");
		}
		for (i = 0;i <= 2 * n - 2;i = i + 2)
		{
			for (j = 0;a[i][j] != '\0';j++)
			{
				;
			}
			for (k = 0;a[i + 1][k] != '\0';k++)
			{
				;
			}
			if (j > k)
			{
				for (l = j - 1;l >= j - k;l = l - 1)
				{
					a[i + 1][l] = a[i + 1][l - j + k];
				}
				for (l = j - k - 1;l >= 0;l = l - 1)
				{
					a[i + 1][l] = 48;
				}
				for (l = j - 1;l >= 0;l = l - 1)
				{
					if (a[i][l] >= a[i + 1][l])
					{
						a[i][l] = a[i][l] - a[i + 1][l] + 48;
					}
					else
					{
						a[i][l] = a[i][l] + 10 - a[i + 1][l] + 48;
						a[i][l - 1] = a[i][l - 1] - 1;
					}
				}
				if (a[i][0] != 48)
				{
				for (l = 0;l <= j - 1;l++)
				{
					System.out.printf("%c",a[i][l]);
				}
				}
				else
				{
					for (l = 0;a[i][l] == 48;l++)
					{
						;
					}
					for (m = 0;m <= j - 1 - l;m++)
					{
						a[i][m] = a[i][m + l];
						System.out.printf("%c",a[i][m]);
					}
				}
				System.out.print("\n");
			}

			if (j < k)
			{
				System.out.print("-");
				for (l = k - 1;l >= k - j;l = l - 1)
				{
					a[i][l] = a[i][l - k + j];
				}
				for (l = k - j - 1;l >= 0;l = l - 1)
				{
					a[i][l] = 48;
				}
				for (l = k - 1;l >= 0;l = l - 1)
				{
					if (a[i + 1][l] >= a[i][l])
					{
						a[i + 1][l] = a[i + 1][l] - a[i][l] + 48;
					}
					else
					{
						a[i + 1][l] = a[i + 1][l] + 10 - a[i][l] + 48;
						a[i + 1][l - 1] = a[i + 1][l - 1] - 1;
					}
				}
				if (a[i + 1][0] != 48)
				{
				   for (l = 0;l <= k - 1;l++)
				   {
					   System.out.printf("%c",a[i + 1][l]);
				   }
				}
				else
				{
					for (l = 0;a[i + 1][l] == 48;l++)
					{
						;
					}
					for (m = 0;m <= k - 1 - l;m++)
					{
						a[i + 1][m] = a[i + 1][m + l];
						System.out.printf("%c",a[i + 1][m]);
					}
				}
				System.out.print("\n");
			}
			if (j == k)
			{
				for (l = 0;l <= j - 1;l++)
				{
					if (a[i][l] - a[i + 1][l] != 0)
					{
						break;
					}
				}
				if (l == j)
				{
					System.out.print("0");
				}
				else
				{
					for (l = j;l >= 1;l = l - 1)
					{
						a[i][l] = a[i][l - 1];
					}
					a[i][0] = 49;
					for (l = j;l >= 1;l = l - 1)
					{
						a[i + 1][l] = a[i + 1][l - 1];
					}
					a[i + 1][0] = 48;
					for (l = j;l >= 0;l = l - 1)
					{
						if (a[i][l] >= a[i + 1][l])
						{
							a[i][l] = a[i][l] - a[i + 1][l] + 48;
						}
						else
						{
							a[i][l] = a[i][l] + 10 - a[i + 1][l] + 48;
							a[i][l - 1] = a[i][l - 1] - 1;
						}
					}
					if (a[i][0] == 49)
					{
						if (a[i][1] != 48)
						{
						for (l = 1;l <= j;l++)
						{
							System.out.printf("%c",a[i][l]);
						}
						}
						else
						{
							 for (l = 1;a[i][l] == 48;l++)
							 {
								 ;
							 }
							for (m = 0;m <= j - l;m++)
							{
								a[i][m] = a[i][m + l];
								System.out.printf("%c",a[i][m]);
							}
						}
					}
					else
					{
						a[i + 1][0] = 49;
						for (l = 1;l <= j;l++)
						{
							a[i + 1][l] = 48;
						}
						for (l = j;l >= 1;l = l - 1)
						{
							if (a[i + 1][l] >= a[i][l])
							{
								a[i + 1][l] = a[i + 1][l] - a[i][l] + 48;
							}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


