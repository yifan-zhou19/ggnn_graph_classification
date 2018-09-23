package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int cnt;
		int kobe;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cnt = n;

		int[] p = new int[200];
		int[][] a = new int[200][200];
		while (cnt-- != 0)
		{
			int i;
			int j;
			int sum = 0;
			int min;
			kobe = n;
			p = a;
			for (i = 0; i < n;i++)
			{
				for (j = 0; j < n; j++)
				{
					*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (int k = 0; k < n - 1; k++)
			{

				for (i = 0; i < kobe;i++)
				{
						min = 999999999;
						for (j = 0; j < kobe; j++)
						{
							if (*(p[i] + j) < min)
							{
								min = (p[i] + j);
							}
						}
						for (j = 0; j < kobe; j++)
						{
							*(p[i] + j) -= min;
						}
				}
				for (j = 0; j < kobe; j++)
				{
						min = 999999999;
						for (i = 0; i < kobe; i++)
						{
							if (*(p[i] + j) < min)
							{
								min = (p[i] + j);
							}
						}
						for (i = 0; i < kobe; i++)
						{
							*(p[i] + j) -= min;
						}
				}
				sum += *(p[1] + 1);
				for (i = 1;i < kobe;i++)
				{
					for (j = 0; j < kobe; j++)
					{
						*(p[i] + j) = *(p[i + 1] + j);
					}
				}
				for (j = 1; j < kobe;j++)
				{
					for (i = 0;i < kobe;i++)
					{
						*(p[i] + j) = *(p[i] + j + 1);
					}
				}
			kobe--;
			}
			System.out.print(sum);
			System.out.print("\n");
			//for (i=0; i<n; i++)
				//for (j=0; j<n; j++)
					//cout << a[i][j]<<endl;

		}
		return 0;
	}






}

