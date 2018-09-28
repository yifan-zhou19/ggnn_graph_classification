package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] ren = new int[5];
		int i;
		char[] name = {'0', 'z', 'q', 's', 'l'};
		for (ren[1] = 1;ren[1] <= 5;ren[1]++)
		{
			for (ren[2] = 1;ren[2] <= 5;ren[2]++)
			{
				for (ren[3] = 1;ren[3] <= 5;ren[3]++)
				{
					ren[4] = ren[1] + ren[2] - ren[3];
					if (ren[4] > 0 && ren[4] <= 5 && (ren[1] + ren[4])>(ren[2] + ren[3]) && (ren[1] + ren[3]) < ren[2])
					{
						for (i = 5;i >= 1;i--)
						{
							for (ren[0] = 1;ren[0] <= 4;ren[0]++)
							{
								if (ren[ren[0]] == i)
								{
									System.out.print(name[ren[0]]);
									System.out.print(' ');
									System.out.print(i);
									System.out.print('0');
									System.out.print("\n");
									break;
								}
							}
						}
						break;
					}
				}
			}
		}
		return 0;
	}
}
