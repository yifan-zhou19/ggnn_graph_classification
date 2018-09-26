package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[5];
		String b = new String(new char[5]);
		b = tangible.StringFunctions.changeCharacter(b, 1, 'z');
		b = tangible.StringFunctions.changeCharacter(b, 2, 'q');
		b = tangible.StringFunctions.changeCharacter(b, 3, 's');
		b = tangible.StringFunctions.changeCharacter(b, 4, 'l');
		for (a[1] = 1 ; a[1] <= 5 ; a[1]++)
		{
			for (a[2] = 1 ; a[2] <= 5 ; a[2]++)
			{
				for (a[3] = 1 ; a[3] <= 5 ; a[3]++)
				{
					for (a[4] = 1 ; a[4] <= 5 ; a[4]++)
					{
						if ((a[1] + a[2]) == (a[3] + a[4]) && (a[1] + a[4]) > (a[3] + a[2]) && (a[1] + a[3]) < a[2] && a[1] != a[2] && a[1] != a[3] && a[1] != a[4] && a[2] != a[3] && a[2] != a[4] && a[3] != a[4])
						{
							for (int i = 5 ; i > 0 ; i--)
							{
								for (int j = 1 ; j <= 4 ; j++)
								{
									if (a[j] == i)
									{
										System.out.print(b.charAt(j));
										System.out.print(" ");
										System.out.print(a[j] * 10);
										System.out.print("\n");
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

