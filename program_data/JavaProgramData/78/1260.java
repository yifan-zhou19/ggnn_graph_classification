package <missing>;

public class GlobalMembers
{
	//*******************************************
	//*@file:8.cpp                              *
	//*@author:??? 1200012894                *
	//*@date:2012.10.11                         *
	//*@function:????????               *
	//*******************************************

	public static int Main()
	{

		//??z, q, s, l??????????????
		int z;
		int q;
		int s;
		int l;

		//??conditioni(i = 1,2,3)??????3????????
		int condition1;
		int condition2;
		int condition3;

		/*sum??conditioni(i = 1, 2, 3)???
		  t?m???????age?label?????*/
		int sum;
		int t;
		int m;

		/*?????????????????
		  ?????????*/
		 for (z = 10; z <= 50; z = z + 10)
		 {
			for (q = 10; q <= 50; q = q + 10)
			{
				for (s = 10; s <= 50; s = s + 10)
				{
					for (l = 10; l <= 50; l = l + 10)
					{
						condition1 = ((z + q) == (s + l));
						condition2 = ((z + l) > (s + q));
						condition3 = ((z + s) < q);
						sum = condition1 + condition2 + condition3;
						if (sum == 3)
						{
							//????????????
							int[] age = {z, q, s, l};
							char[] label = {'z', 'q', 's', 'l'};

							//??????????????????????
							for (int i = 0; i < 3; i++)
							{
								for (int j = 0; j < 3 - i; j++)
								{
									if (age[j] < age[j + 1])
									{
										t = age[j];
										age[j] = age[j + 1];
										age[j + 1] = t;
										m = label[j];
										label[j] = label[j + 1];
										label[j + 1] = m;
									}

								}
							}

							//???????????????????
							for (int j = 0; j <= 3; j++)
							{
							System.out.print(label[j]);
							System.out.print(" ");
							System.out.print(age[j]);
							System.out.print("\n");
							}
						}
					}
				}
			}
		 }
		return 0;
	}
}
