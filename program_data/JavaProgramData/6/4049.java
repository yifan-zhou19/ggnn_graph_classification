package <missing>;

public class GlobalMembers
{
	public static int[][] v = new int[100][100];

	//class mat
	//{
	//public:
	//	int m;
	//	int n;
	//	int **v;
	//
	//public:
	//	mat(int mm,int nn)
	//	{
	//		m=mm;
	//		n=nn;
	//		v=new int*[m];
	//		for(int i=0;i<mm;i++)
	//		{
	//			v[i]=new int[n];
	//		}
	//	}

		public static int sum(int m,int n)
		{

			int su = 0;
			if (n >= 2 && m >= 2)
			{
				for (int i = 0;i < n;i++)
				{
					su += v[0][i];
					su += v[m - 1][i];
				}
				for (int i = 1;i < m - 1;i++)
				{
					su += v[i][0];
					su += v[i][n - 1];
				}
			}
			else if (n >= 2 && m == 1)
			{
				for (int i = 0;i < n;i++)
				{
					su += v[0][i];
				}
			}
			else if (m >= 2 && n == 1)
			{
				for (int i = 0;i < n;i++)
				{
					su += v[i][0];
				}
			}
			else
			{
				su = v[0][0];
			}
			return su;
		}
	//};



	public static int Main()
	{
		int times;
		times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));



		for (int k = 0;k < times;k++)
		{
			int a;
			int b;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			for (int i = 0;i < a;i++)
			{
				for (int j = 0;j < b;j++)
				{
					v[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			System.out.print(sum(a, b));
			System.out.print("\n");
		}
	}
}

