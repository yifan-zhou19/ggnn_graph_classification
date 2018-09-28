package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		int m = 0;
		int flag;
		String cc = new String(new char[6]);
		for (a[1] = 1;a[1] <= 5;a[1]++)
		{
			for (a[2] = 1;a[2] <= 5;a[2]++)
			{
				for (a[3] = 1;a[3] <= 5;a[3]++)
				{
					for (a[4] = 1;a[4] <= 5;a[4]++)
					{
						a[5] = 15 - a[1] - a[2] - a[3] - a[4];
						if (a[1] * a[2] * a[3] * a[4] * a[5] == 120)
						{
							if (a[5] != 2 && a[5] != 3)
							{
								cc = tangible.StringFunctions.changeCharacter(cc, 1, (a[5] == 1));
								cc = tangible.StringFunctions.changeCharacter(cc, 2, (a[2] == 2));
								cc = tangible.StringFunctions.changeCharacter(cc, 3, (a[1] == 5));
								cc = tangible.StringFunctions.changeCharacter(cc, 4, (a[3] != 1));
								cc = tangible.StringFunctions.changeCharacter(cc, 5, (a[4] == 1));
								if (cc.charAt(1) + cc.charAt(2) + cc.charAt(3) + cc.charAt(4) + cc.charAt(5) == 2)
								{
									for (i = 1;i <= 5;i++)
									{
										flag = 1;
										if (a[i] == 1 || a[i] == 2)
										{
											if (cc.charAt(i) == 0)
											{
												flag = 0;
												break;
											}
										}
									}
									if (flag != 0)
									{
										for (i = 1;i <= 4;i++)
										{
											System.out.print(a[i]);
											System.out.print(' ');
										}
										System.out.print(a[5]);
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

