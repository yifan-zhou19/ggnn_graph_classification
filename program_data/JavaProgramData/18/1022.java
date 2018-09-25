package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[200][200];
	public static int minhang(int hang,int geshu)
	{
		int i;

		int min = (*(a + hang) + 1);
		for (i = 1;i <= geshu;i++)
		{
			if (*(*(a + hang) + i) < min)
			{
				min = (*(a + hang) + i);
			}
		}
		return min;
	}
	public static int minlie(int lie,int geshu)
	{
		int i;
		int min = (*(a + 1) + lie);
		for (i = 1;i <= geshu;i++)
		{
			if (*(*(a + i) + lie) < min)
			{
				min = (*(a + i) + lie);
			}
		}
		return min;
	}
	public static int Main()
	{


		int n;
		int x;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (x = 1;x <= n;x++)
		{

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));

			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}

			}
			int sum = 0;
			for (int m = 0;m < n - 1;m++)
			{
				for (int mm = 1;mm <= n - m;mm++)
				{
					int Minhang = minhang(mm, n - m);
					for (i = 1;i <= n - m;i++)
					{
					*(*(a + mm) + i) = *(*(a + mm) + i) - Minhang;
					}

				}
				for (int mm = 1;mm <= n - m;mm++)
				{
					int Minlie = minlie(mm, n - m);
					for (i = 1;i <= n - m;i++)
					{
					*(*(a + i) + mm) = *(*(a + i) + mm) - Minlie;
					}

				}


				sum += *(*(a + 2) + 2);
				for (int ii = 1;ii <= n - m;ii++)
				{
					for (i = 3;i <= n - m;i++)
					{
					*(*(a + ii) + i - 1) = *(*(a + ii) + i);
					}

				}
				for (int ii = 1;ii <= n - m;ii++)
				{
					for (i = 3;i <= n - m;i++)
					{
					*(*(a + i - 1) + ii) = *(*(a + i) + ii);
					}

				}

			}
			System.out.print(sum);
			System.out.print("\n");




		}



		return 0;


	}

}

