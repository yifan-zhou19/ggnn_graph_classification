package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : national8.cpp
	// Author      : 1300012911
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int Main()
	{
		int[] weight = new int[6]; //??
		String name = new String(new char[6]); //??????
		int z; //z,q,s,l:??????
		int q;
		int s;
		int l;
		int i;
		int renshu;
		for (i = 1;i <= 5;i++)
		{
			weight[i] = i * 10;
			name = tangible.StringFunctions.changeCharacter(name, i, ' ');
		} //???
		for (z = 1;z <= 5;z++) //??
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if ((z != q) && (z != s) && (q != s) && (z != l) && (q != l) && (s != l)) //????
						{
							if (((weight[z] + weight[q]) == (weight[s] + weight[l])) && ((weight[z] + weight[l]) > (weight[s] + weight[q])) && ((weight[z] + weight[s]) < weight[q]))
							{
								//???????
								name = tangible.StringFunctions.changeCharacter(name, z, 'z'); //??????
								name = tangible.StringFunctions.changeCharacter(name, q, 'q');
								name = tangible.StringFunctions.changeCharacter(name, s, 's');
								name = tangible.StringFunctions.changeCharacter(name, l, 'l');
								renshu = 0; //??????
								for (i = 5;i >= 1;i--) //??
								{
									  if (name.charAt(i) != ' ')
									  {
											 renshu++;
											 if (renshu < 4)
											 {
											System.out.print(name.charAt(i));
											System.out.print(' ');
											System.out.print(weight[i]);
											System.out.print("\n");
											 }
											 else
											 {
												 System.out.print(name.charAt(i));
												 System.out.print(' ');
												 System.out.print(weight[i]);
											 }
									  }
										  else
										  {
											  ;
										  }
								}
							}
							else
							{
								;
							}
						}
						else
						{
							;
						}
					}
				}
			}
		}
		return 0;
	}

}

