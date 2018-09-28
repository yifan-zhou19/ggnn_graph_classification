package <missing>;

public class GlobalMembers
{
	/***************************************
	*file 4.cpp               **************
	*author ???              ************
	*date 2013-11-1                 ********
	*description  ????           *******
	****************************************/

	public static int Main()
	{
		int[][] a = new int[5][5];
		int i; //?????????
		int j;
		int k;
		int l;

		//????
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[] b = new int[5]; //?????????????????????????
		int[] c = new int[5];
		int m;

		//????????????
		for (i = 0; i < 5; i++)
		{
			m = a[i][0], b[i] = 0;
			for (j = 1; j < 5; j++)
			{
				if (a[i][j] > m)
				{
					m = a[i][j];
					b[i] = j;
				}
			}
		}

		//????????????
		for (j = 0; j < 5; j++)
		{
			m = a[0][j];
			c[j] = 0;
			for (i = 1; i < 5; i++)
			{
				if (a[i][j] < m)
				{
					m = a[i][j];
					c[j] = i;
				}
			}
		}

		for (i = 0; i < 5; i++)
		{
			if (c[b[i]] == i) //???i???????????????????i(??i,b[i]????)
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(b[i] + 1);
				System.out.print(" ");
				System.out.print(a[i][b[i]]);
				System.out.print("\n");
				break;
			}
		}
		if (i == 5)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}



}

