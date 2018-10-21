package <missing>;

public class GlobalMembers
{
	/*
	 * ???020.cpp
	 * Created on: 2012-10-14
	 * Author: ???
	 * ??????
	 */
	public static int Main()
	{
		int A; //??A B C???
		int B;
		int C;
		for (A = 1;A <= 3;A++)
		{ //??A???
			for (B = 1;B <= 3;B++)
			{ //??B???
				if (A != B)
				{ //?A B C????
					C = 6 - A - B; //??C???
					if ((B > A) + (C == A) + A == 3 && (A > B) + (A > C) + B == 3 && (C > B) + (B > A) + C == 3)
					{ //??????
						char[] m = {'A', 'B', 'C'}; //?????????X
						char x;
						int[] a = {A, B, C}; //???????i j t
						int i;
						int j;
						int t;
						for (j = 0;j < 2;j++) //???2???
						{
							for (i = 0;i < 2 - j;i++) //????2-j???
							{
							if (a[i] > a[i + 1])
							{ //??????????
								t = a[i];
								a[i] = a[i + 1];
								a[i + 1] = t; //?????????????
								x = m[i];
								m[i] = m[i + 1];
								m[i + 1] = x;
							} //?????????
							}
						}
								System.out.print(m[0]);
								System.out.print(m[1]);
								System.out.print(m[2]);
					}
				}
			}
		}

	return 0;
	}

}
