package <missing>;

public class GlobalMembers
{
	//???


	public static int Main()
	{
		int[] a = new int[4];
		int[] max = {0, 0, 0, 0};
		char[] A = {'z', 'q', 's', 'l'};
		String Max = new String(new char[4]);
		for (a[0] = 10 ; a[0] <= 50 ; a[0] = a[0] + 10)
		{
			for (a[2] = 10 ; a[2] <= 50 ; a[2] = a[2] + 10)
			{
				for (a[3] = 10 ; a[3] <= 50 ; a[3] = a[3] + 10)
				{
					a[1] = a[2] + a[3] - a[0];
					if (a[0] + a[3] > a[1] + a[2] && a[0] + a[2] < a[1])
					{
						for (int i1 = 0 ; i1 <= 3 ; i1++)
						{
							if (a[i1] > max[0])
							{
								max[0] = a[i1];
								Max = tangible.StringFunctions.changeCharacter(Max, 0, A[i1]);
							}
						}
						for (int i2 = 0 ; i2 <= 3 ; i2++)
						{
							if (a[i2] > max[1] && a[i2] < max[0])
							{
								max[1] = a[i2];
								Max = tangible.StringFunctions.changeCharacter(Max, 1, A[i2]);
							}
						}
						for (int i3 = 0 ; i3 <= 3 ; i3++)
						{
							if (a[i3] > max[2] && a[i3] < max[1])
							{
								max[2] = a[i3];
								Max = tangible.StringFunctions.changeCharacter(Max, 2, A[i3]);
							}
						}
						for (int i4 = 0 ; i4 <= 3 ; i4++)
						{
							if (a[i4] > max[3] && a[i4] < max[2])
							{
								max[3] = a[i4];
								Max = tangible.StringFunctions.changeCharacter(Max, 3, A[i4]);
							}
						}
						for (int i5 = 0 ; i5 <= 3 ; i5++)
						{
							System.out.print(Max.charAt(i5));
							System.out.print(" ");
							System.out.print(max[i5]);
							System.out.print("\n");
						}
					}
				}
			}
		}

		return 0;
	}

}

