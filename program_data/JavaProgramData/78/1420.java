package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 0, 0, 0};

		for (a[0] = 1;a[0] <= 5;a[0]++)
		{
			for (a[1] = 1;a[1] <= 5;a[1]++)
			{
				for (a[2] = 1;a[2] <= 5;a[2]++)
				{
					for (a[3] = 1;a[3] <= 5;a[3]++)
					{
						if ((a[0] + a[1] == a[2] + a[3]) && (a[0] + a[3] > a[1] + a[2]) && (a[0] + a[2] < a[1]))
						{
							String b = new String(new char[4]);
							b = tangible.StringFunctions.changeCharacter(b, 0, 'z');
							b = tangible.StringFunctions.changeCharacter(b, 1, 'q');
							b = tangible.StringFunctions.changeCharacter(b, 2, 's');
							b = tangible.StringFunctions.changeCharacter(b, 3, 'l');
							int i;
							int j;
							int t;
							char v;
							for (j = 0;j < 3;j++)
							{
								for (i = 0;i < 3 - j;i++)
								{
									if (a[i] < a[i + 1])
									{
										t = a[i];
										a[i] = a[i + 1];
										a[i + 1] = t;
									v = b.charAt(i);
									b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
									b = tangible.StringFunctions.changeCharacter(b, i + 1, v);
									}
								}
							}
							for (i = 0;i <= 3;i++)
							{
								System.out.print(b.charAt(i));
								System.out.print(" ");
								System.out.print(a[i] * 10);
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

