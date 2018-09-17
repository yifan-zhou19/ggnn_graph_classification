package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int[] a = new int[3]; //??????a??????,b???????????,d????a???????,e????b???????
		int[] b = new int[3];
		int[] d = new int[3];
		int[] e = new int[3];
	String c = new String(new char[3]);
	c = tangible.StringFunctions.changeCharacter(c, 0, 'A');
	c = tangible.StringFunctions.changeCharacter(c, 1, 'B');
	c = tangible.StringFunctions.changeCharacter(c, 2, 'C'); //?? c???? A B C ??
	for (a[0] = 0;a[0] < 3;a[0]++) //???????
	{
		for (a[1] = 0;a[1] < 3;a[1]++) //????
		{
			for (a[2] = 0;a[2] < 3;a[2]++) //????
			{
				for (int p = 0;p < 3;p++)
				{
					b[p] = 0;
				}
				if (a[1] > a[0]) //??B?A???
				{
					b[0]++;
				}
				if (a[0] == a[2]) //??A C?????
				{
					b[0]++;
				}
				if (a[0] > a[1]) //??A???B?
				{
					b[1]++;
				}
				if (a[0] > a[2]) //??A???C?
				{
					b[1]++;
				}
				if (a[2] > a[1]) //??C?B???
				{
					b[2]++;
				}
				if (a[1] > a[0]) //??B?A???
				{
					b[2]++;
				}
				for (int i = 0;i < 3;i++)
				{
					d[i] = 0;
				e[i] = 0;
				}
				for (int i = 0;i < 3;i++)
				{
					for (int j = 0;j < 3;j++)
					{
						if (a[i] > a[j])
						{
							d[i]++;
						}
						if (b[i] > b[j])
						{
							e[i]++;
						}
					}
				}
					for (int j = 0;j < 3;j++)
					{
						if (d[0] + e[0] == 2 && d[1] + e[1] == 2 && d[2] + e[2] == 2 && d[j] == 0)
						{
							System.out.print(c.charAt(j));
						}
					}
					for (int j = 0;j < 3;j++)
					{
						if (d[0] + e[0] == 2 && d[1] + e[1] == 2 && d[2] + e[2] == 2 && d[j] == 1)
						{
							System.out.print(c.charAt(j));
						}
					}
					for (int j = 0;j < 3;j++)
					{
						if (d[0] + e[0] == 2 && d[1] + e[1] == 2 && d[2] + e[2] == 2 && d[j] == 2)
						{
							System.out.print(c.charAt(j));
						}
					}
			}
		}
	}
			return 0;
	}

}

