package <missing>;

public class GlobalMembers
{
	/*
	 * b.cpp
	 *
	 *  Created on: 2012-10-22
	 *      Author: user
	 */

	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							break;
						}
					}
					if (z + q == s + l && z + l > s + q && z + s < q)
					{
						break;
					}
				}
				if (z + q == s + l && z + l > s + q && z + s < q)
				{
					break;
				}
			}
			if (z + q == s + l && z + l > s + q && z + s < q)
			{
				break;
			}
		}
	int[] a = new int[4];
	int i;
	int j;
	int t;
	String b = new String(new char[5]);
	char u;
	a[1] = z;
	a[2] = q;
	a[3] = s;
	a[4] = l;
	b = tangible.StringFunctions.changeCharacter(b, 1, 'z');
	b = tangible.StringFunctions.changeCharacter(b, 2, 'q');
	b = tangible.StringFunctions.changeCharacter(b, 3, 's');
	b = tangible.StringFunctions.changeCharacter(b, 4, 'l');
	for (j = 1;j < 4;j++)
	{
		for (i = 0;i < 4 - j;i++)
		{
			if (a[i] > a[i + 1])
			{
				t = a[i];
				a[i] = a[i + 1];
				a[i + 1] = t;
			u = b.charAt(i);
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
			b = tangible.StringFunctions.changeCharacter(b, i + 1, u);
			}
		}
	}
	System.out.print(b.charAt(4));
	System.out.print(" ");
	System.out.print(10 * a[4]);
	System.out.print("\n");
	System.out.print(b.charAt(3));
	System.out.print(" ");
	System.out.print(10 * a[3]);
	System.out.print("\n");
	System.out.print(b.charAt(2));
	System.out.print(" ");
	System.out.print(10 * a[2]);
	System.out.print("\n");
	System.out.print(b.charAt(1));
	System.out.print(" ");
	System.out.print(10 * a[1]);
	return 0;

	}

}

