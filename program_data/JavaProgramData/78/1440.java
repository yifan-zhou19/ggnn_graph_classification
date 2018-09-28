package <missing>;

public class GlobalMembers
{
	/*
	 * shit.cpp
	 *
	 *  Created on: 2012-10-15
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] a = new int[5];
		String b = new String(new char[5]);
		for (z = 1;z < 6;z++)
		{
			for (q = 1;q < 6;q++)
			{
				for (s = 1;s < 6;s++)
				{
					for (l = 1;l < 6;l++)
					{
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							a[1] = z * 10;
							b = tangible.StringFunctions.changeCharacter(b, 1, 'z');
							a[2] = q * 10;
							b = tangible.StringFunctions.changeCharacter(b, 2, 'q');
							a[3] = s * 10;
							b = tangible.StringFunctions.changeCharacter(b, 3, 's');
							a[4] = l * 10;
							b = tangible.StringFunctions.changeCharacter(b, 4, 'l');
							break;
						}
					}
				}
			}
		}
		int j;
		int i;
		int p;
		int e;
		for (j = 1;j <= 3;j++)
		{
			for (i = 1;i <= 4 - j;i++)
			{
				if (a[i] < a[i + 1])
				{
					p = a[i];
					a[i] = a[i + 1];
					a[i + 1] = p;
					e = b.charAt(i);
					  b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
					b = tangible.StringFunctions.changeCharacter(b, i + 1, e);
				}
			}
		}
		for (i = 1;i <= 4;i++)
		{
			System.out.print(b.charAt(i));
			System.out.print(" ");
			System.out.print(a[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

