package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4];
		int ta;
		int i;
		int j;
		char[] name = {'z', 'q', 's', 'l'};
		char tn;
		for (a[0] = 1; a[0] <= 5; a[0]++)
		{
			for (a[1] = 1; a[1] <= 5; a[1]++)
			{
				for (a[2] = 1; a[2] <= 5; a[2]++)
				{
					for (a[3] = 1; a[3] <= 5; a[3]++)
					{
						if (a[0] != a[1] && a[0] != a[2] && a[0] != a[3] && a[1] != a[2] && a[1] != a[3] && a[2] != a[3] && ((a[0] + a[1]) == (a[2] + a[3])) && ((a[0] + a[3]) > (a[1] + a[2])) && ((a[0] + a[2]) < a[1]))
						{
							for (i = 0; i < 3; i++)
							{
								for (j = 0; j < 3 - i; j++)
								{
									if (a[j] < a[j + 1])
									{
										ta = a[j];
										a[j] = a[j + 1];
										a[j + 1] = ta;
										tn = name[j];
										name[j] = name[j + 1];
										name[j + 1] = tn;
									}
								}
							}
								for (i = 0; i < 4; i++)
								{
									System.out.print(name[i]);
									System.out.print(" ");
									System.out.print(a[i]);
									System.out.print("0");
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
