package <missing>;

public class GlobalMembers
{
	//* * * * * * * * * * * * * * * * * * * * * * * * 
	//*????1000012839_3                         *
	//*???? ????????                    *
	//*?????                                   *
	//*???2010.10.29                             *
	//* * * * * * * * * * * * * * * * * * * * * * * * 
	public static int Main()
	{
		int n; //    i,j??????n???????????k??????????
		int i;
		int j;
		int k;
		int m;
		int[] a = new int[100000]; //    ?????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0, j = 0; m <= n - 1; m++)
		{
			if (a[m] != k) //    ??????k??
			{
				a[j++] = a[m];
				if (j != 1)
				{
					System.out.print(' ');
					System.out.print(a[j - 1]);
				}
				else
				{
					System.out.print(a[j - 1]);
				}
			}

		}
		return 0;
	}






}

