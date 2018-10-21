package <missing>;

public class GlobalMembers
{
	/*
	 * SaddlePoint.cpp
	 *
	 *  Created on: 2012-11-6
	 *      Author: Cui Zhaoxiong Class4 1200012931
	 */
	public static int Main()
	{
		int[][] a = new int[5][5]; //??5*5??a
		for (int i = 0; i < 5; i++)
		{ //?????a
			for (int j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[][] ex = new int[2][5]; //??2*5??ex?????????????????????????????????????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ex,0,(Integer.SIZE / Byte.SIZE)); //?ex??
		for (int i = 0; i < 5; i++)
		{ //??ex????
			for (int j = 0; j < 5; j++)
			{
				if (a[i][j] > a[i][ex[0][i]])
				{
					ex[0][i] = j;
				}
			}
		}
		for (int i = 0; i < 5; i++)
		{ //???ex????
			for (int j = 0; j < 5; j++)
			{
				if (a[j][i] < a[ex[1][i]][i])
				{
					ex[1][i] = j;
				}
			}
		}
		/*
		 * ????
		for (int i=0;i<5;i++) cout << ex[0][i]<<' ';
		cout <<endl;
		for (int i=0;i<5;i++) cout << ex[1][i]<<' ';
		*/
		int i = 0; //i?????
		for (;i < 5;i++)
		{
			if (ex[1][ex[0][i]] == i)
			{ //???i????????????????i??????(i,ex[0][i])????
				System.out.print(i + 1);
				System.out.print(' ');
				System.out.print(ex[0][i] + 1);
				System.out.print(' ');
				System.out.print(a[i][ex[0][i]]);
				System.out.print("\n");
				break;
			}
		}
		if (i == 5)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

