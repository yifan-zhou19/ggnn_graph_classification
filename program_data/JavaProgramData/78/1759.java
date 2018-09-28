package <missing>;

public class GlobalMembers
{
	//****************************************
	//*?????? **
	//*??????  1100012927       **
	//*???2011.10.14                          **
	//****************************************

	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] a = new int[4];
		int temp;
		int i;
		int j;
		final String b = "zqsl";
		char temp1;
		for (z = 1; z < 6; z++)
		{
			for (q = 1; q < 6; q++)
			{
				for (s = 1; s < 6; s++)
				{
					for (l = 1; l < 6; l++)
					{
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							a[0] = z;
							a[1] = q;
							a[2] = s;
							a[3] = l;
							for (j = 0; j < 3; j++)
							{
								for (i = 0; i < 3 - j; i++)
								{
									if (a[i] < a[i + 1])
									{
										temp = a[i];
										a[i] = a[i + 1];
										a[i + 1] = temp;
										temp1 = b.charAt(i);
										b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
										b = tangible.StringFunctions.changeCharacter(b, i + 1, temp1);
									}
								}
							}
							for (i = 0;i < 4; i++)
							{
								a[i] = 10 * a[i];
								System.out.print(b.charAt(i));
								System.out.print(" ");
								System.out.print(a[i]);
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

