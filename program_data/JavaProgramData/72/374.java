package <missing>;

public class GlobalMembers
{
	/*
	 * 11.cpp
	 *
	 *  Created on: 2010-11-20
	 *      Author: jsgl
	 */

	public static int Main()
	{
		int a;
		int b;
		int[][] x = new int[22][22];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ;i <= a + 1; i++)
		{
				for (int j = 0;j <= b + 1;j++)
				{
					x[i][j] = -1;
				}
		}
		for (int i = 1 ;i <= a; i++)
		{
			for (int j = 1;j <= b;j++)
			{
				x[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		//cout<<x[4][0]<<endl;
	//	for ( int i=1 ;i<=a; i++ )
	//			for ( int j=1;j<=b;j++ )
	//				cout<<x[i][j];
		for (int k = 1 ;k <= a; k++)
		{
				for (int l = 1;l <= b;l++)
				{
					if ((x[k][l] >= x[k - 1][l]) && (x[k][l] >= x[k + 1][l]) && (x[k][l] >= x[k][l - 1]) && (x[k][l] >= x[k][l + 1]))
					{
						//cout<<x[k][l]<<endl;
						System.out.print(k - 1);
						System.out.print(' ');
						System.out.print(l - 1);
						System.out.print("\n");
					}
				}
		}
		return 0;
	}

}

