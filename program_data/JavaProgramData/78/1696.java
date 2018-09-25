package <missing>;

public class GlobalMembers
{
	/*
	 * 333333.cpp
	 *
	 *  Created on: 2010-11-20
	 *      Author: jsgl
	 */
	public static int Main()
	{
		int[] W = new int[4]; //?????????????
		int Mz;
		int Mq;
		int Ms;
		int Ml;
		int s;
		int i;
		int j;
		String X = new String(new char[4]);
		char t;
		for (Mz = 10;Mz <= 50;Mz = Mz + 10) //?????????
		{
			for (Mq = 10;Mq <= 50;Mq = Mq + 10)
			{
				for (Ms = 10;Ms <= 50;Ms = Ms + 10)
				{
					for (Ml = 10;Ml <= 50;Ml = Ml + 10)
					{
						if ((Mz + Mq) == (Ms + Ml) && (Mz + Ml > Ms + Mq) && (Mz + Ms < Mq))
						{
							W[0] = Mz;
							W[1] = Mq;
							W[2] = Ms;
							W[3] = Ml;
						}
					}
				}
			}
		}
		X = tangible.StringFunctions.changeCharacter(X, 0, 'z'); //??????????X[4]
		X = tangible.StringFunctions.changeCharacter(X, 1, 'q');
		X = tangible.StringFunctions.changeCharacter(X, 2, 's');
		X = tangible.StringFunctions.changeCharacter(X, 3, 'l');
		for (i = 0;i < 3;i++) //???????????
		{
			for (j = 0;j < 3 - i;j++)
			{
				if (W[j] < W[j + 1])
				{
					s = W[j + 1];
					W[j + 1] = W[j];
					W[j] = s;
					t = X.charAt(j + 1);
					X = tangible.StringFunctions.changeCharacter(X, j + i, X.charAt(j));
					X = tangible.StringFunctions.changeCharacter(X, j, t);
				}
			}
		}
		for (i = 0;i < 1;i++)
		{
			System.out.print(X.charAt(i));
			System.out.print(" ");
			System.out.print(W[i]);
			System.out.print("\n");
		}
		System.out.print('q');
		System.out.print(" ");
		System.out.print(W[1]);
		System.out.print("\n");
		System.out.print('z');
		System.out.print(" ");
		System.out.print(W[2]);
		System.out.print("\n");
		System.out.print('s');
		System.out.print(" ");
		System.out.print(W[3]);
		System.out.print("\n");









		return 0;
	}


}

