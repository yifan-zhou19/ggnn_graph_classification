package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z; //????
		int q;
		int s;
		int l;
		int f = new int(int,int,int,int); //???????????
		for (z = 1;z <= 5;z++) //??
		{
			for (q = 1;q <= 5;q++)
			{
				if (q == z)
				{
					continue; //??????
				}
				else
				{
					for (s = 1;s <= 5;s++)
					{
						if (s == z || s == q)
						{
							continue;
						}
						else
						{
							for (l = 1;l <= 5;l++)
							{
								if (l == z || l == q || l == s)
								{
									continue;
								}
								else
								{
									if (z + q == l + s && z + l > s + q && z + s < q) //????
									{
										f(z, q, s, l); //????
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
	public static int f(int z,int q,int s,int l) //????
	{
		int[] a = {z, q, s, l}; //????
		int i;
		int j;
		int temp1;
		final String b = "zqsl";
		char temp2;
		for (i = 0;i < 3;i++) //???????
		{
			for (j = i + 1;j < 4;j++)
			{
				if (a[i] < a[j])
				{
					temp1 = a[i];
					a[i] = a[j];
					a[j] = temp1;
					temp2 = b.charAt(i); //???????????
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
					b = tangible.StringFunctions.changeCharacter(b, j, temp2);
				}
			}
		}
		for (i = 0;i < 4;i++) //??
		{
			System.out.print(b.charAt(i));
			System.out.print(" ");
			System.out.print(10 * a[i]);
			System.out.print("\n");
		}
		return 0; //???
	}

}

