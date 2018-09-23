package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int n = num;
		int numcas = num;

		int[][] a = new int[301][301];
		while (num-- != 0)
		{
			int s = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
			for (int i = 0; i < numcas; i++)
			{
			for (int j = 0; j < numcas; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			}

			n = numcas;
			while (true)
			{

				if (n == 0)
				{
					System.out.print(s);
					System.out.print("\n");
					break;
				}


				for (int j = 0; j < n ; j++)
				{
					int min = 1000000;
					for (int k = 0;k < n; k++)
					{
						if (a[j][k] < min)
						{
							min = a[j][k];
						}
					}
					for (int i = 0; i < n; i++)
					{
						a[j][i] -= min;
					}
				}
								/*	for (int j = 0; j < n; j++) {
				for (int i = 0; i < n; i++) 
				{
					cout << a[j][i] << " ";
				}
				cout << endl;
				}*/
				for (int j = 0; j < n ; j++)
				{
					int min = 1000000;
					for (int k = 0;k < n; k++)
					{
						if (a[k][j] < min)
						{
							min = a[k][j];
						}
					}
					for (int i = 0; i < n; i++)
					{
						a[i][j] -= min;
					}
				}



				s += a[1][1];

				for (int j = 0; j < n; j++)
				{
				for (int i = 1; i < n; i++)
				{
					a[j][i] = a[j][i + 1];
				}
				}
				for (int j = 0; j < n - 1; j++)
				{
				for (int i = 1; i < n; i++)
				{
					a[i][j] = a[i + 1][j];
				}
				}
				n--;
			}
		}

		return 0;
	}

}

