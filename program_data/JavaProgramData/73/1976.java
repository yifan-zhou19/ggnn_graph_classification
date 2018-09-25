package <missing>;

public class GlobalMembers
{
	//* * * * * * * * * * * * * * * * * * * * * * * * 
	//*????1000012839_1                         *
	//*???? ????                            *
	//*?????                                   *
	//*???2010.11.05                             *
	//* * * * * * * * * * * * * * * * * * * * * * * * 

	public static int Main()
	{
		int i; //    ????i,j,k,m,N?
		int j;
		int k;
		int m;
		int N;
		int max; //    max?min????????????????????
		int min;
		int[][] a = new int[5][5]; //    ???????
		 for (i = 0; i < 5; i++)
		 {
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		 }
		for (i = 0, N = 0; i < 5; i++)
		{
			max = a[i][0]; //    ??????????max;
			k = 0;
			for (j = 1; j < 5; j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					k = j; //    ?????????????j??k?
				}
			}
			min = a[0][k]; //    ???k?????min?
			m = 0;
			for (j = 1; j < 5; j++)
			{
				if (min > a[j][k])
				{
					min = a[j][k];
					m = j; //    ??k?????????j??m?
				}
			}
			if (m == i) //    ???k?????????i???????
			{
				System.out.print(i + 1);
				System.out.print(' ');
				System.out.print(k + 1);
				System.out.print(' ');
				System.out.print(a[i][k]);
				System.out.print("\n");
				N++;
			}
		}
		if (N == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}

		return 0;
	}









}

