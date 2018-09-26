package <missing>;

public class GlobalMembers
{
	// It's an ugly program
	// solving a **** problem
	public static int Main()
	{
		int[] w = new int[4];
		char[] name = {'z', 'q', 's', 'l'};
		for (w[0] = 1; w[0] <= 5; w[0]++)
		{
			for (w[1] = 1; w[1] <= 5; w[1]++)
			{
				if (w[1] != w[0])
				{
				for (w[2] = 1; w[2] <= 5; w[2]++)
				{
					if ((w[2] != w[1]) && w[2] != w[0])
					{
					for (w[3] = 1; w[3] <= 5; w[3]++)
					{
						if ((w[3] != w[2]) && (w[3] != w[1]) && (w[3] != w[0]))
						{
						if ((w[0] + w[1] == w[2] + w[3]) && (w[0] + w[3] > w[1] + w[2]) && (w[0] + w[2] < w[1]))
						{
							for (int k = 5; k > 0; k--)
							{
								for (int i = 0; i < 4; i++)
								{
									if (w[i] == k)
									{
									System.out.print(name[i]);
									System.out.print(' ');
									System.out.print(w[i] * 10);
									System.out.print("\n");
									}
								}
							}
							return 0;
						}
						}
					}
					}
				}
				}
			}
		}
	}
}
