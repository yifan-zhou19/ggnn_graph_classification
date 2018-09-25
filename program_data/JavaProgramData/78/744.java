package <missing>;

public class GlobalMembers
{
	/*
	 * weight.cpp
	 *
	 *  Created on: 2013-10-25
	 *      Author: Mac
	 */



	public static int Main()
	{
		int z; //define ????  and output sequence
		int q;
		int s;
		int l;
		for (z = 10; z <= 50; z += 10)
		{
			for (q = 10; q <= 50; q += 10)
			{
				if (q != z)
				{
					for (s = 10; s <= 50; s += 10)
					{
						if (s != q && s != z)
						{
							for (l = 10; l <= 50; l += 10)
							{
								if (l != z && l != q && l != s)
								{
								//	cout << "test" << endl;
									if ((z + q == s + l) + (z + l > s + q) + (z + s < q) == 3)
									{
										z = 10000 * z + 'z';
										q = 10000 * q + 'q';
										s = 10000 * s + 's';
										l = 10000 * l + 'l';

										//cout <<z<<' '<<q<<' '<<s<<' '<<l<<endl;

											int[] a = new int[5];
											int i;
										a[1] = z;
										a[2] = q;
										a[3] = s;
										a[4] = l;

										//for (i = 1; i <= 4; i++)
										//cout << a[i]<<' ' ;
										//cout << endl;

										sort(a + 1, a + 5);
										for (i = 4; i > 0; i--)
										{
										System.out.print((char)(a[i] % 10000));
										System.out.print(' ');
										System.out.print(a[i] / 10000);
										System.out.print("\n");
										}

									}


								}
							}
						}
					}
				}
			}
		}
		return 0;
	}

}
