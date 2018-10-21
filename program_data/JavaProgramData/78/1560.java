package <missing>;

public class GlobalMembers
{
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
				for (s = 1;s <= 5;s++) //??????????
				{
					l = (z + q) - s; //????????????????
					if ((l >= 1) && (l <= 5) && (z + l> s + q) && (z + s < q)) //?????????10-50????????????????
					{
						int[] a = new int[4];
						int i;
						int j;
						int k;
						int temp;
						String c = new String(new char[4]);
						char ch;
						a[0] = z;
						a[1] = q;
						a[2] = s;
						a[3] = l;
						c = tangible.StringFunctions.changeCharacter(c, 0, 'z');
						c = tangible.StringFunctions.changeCharacter(c, 1, 'q');
						c = tangible.StringFunctions.changeCharacter(c, 2, 's');
						c = tangible.StringFunctions.changeCharacter(c, 3, 'l'); //?????????
						for (i = 0;i < 4;i++)
						{
							k = i;
							for (j = i + 1;j < 4;j++)
							{
								if (a[j] > a[k])
								{
									k = j;
								}
							}
							if (k != i)
							{
								temp = a[k];
								a[k] = a[i];
								a[i] = temp;
								ch = c.charAt(k);
								c = tangible.StringFunctions.changeCharacter(c, k, c.charAt(i));
								c = tangible.StringFunctions.changeCharacter(c, i, ch);
							} //?????????
						} //??????
						for (i = 0;i < 4;i++)
						{
							System.out.print(c.charAt(i));
							System.out.print(' ');
							System.out.print(a[i]);
							System.out.print(0);
							System.out.print("\n");
						}
					}
				}
			}
		}

		return 0;
	}
}

