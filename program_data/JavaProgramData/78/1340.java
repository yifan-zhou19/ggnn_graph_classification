package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] w = new int[4];
		char[] name = {'z', 'q', 's', 'l'};
		int i;
		int j;
		for (w[z] = 10; w[z] <= 50; w[z] += 10)
		{

			for (w[q] = 10; w[q] <= 50; w[q] += 10)
			{
				if (w[q] == w[z])
				{
					continue;
				}
				for (w[s] = 10; w[s] <= 50; w[s] += 10)
				{
					if (w[s] == w[z] || w[s] == w[q])
					{
						continue;
					}
					for (w[l] = 10; w[l] <= 50; w[l] += 10)
					{
						if (w[l] == w[z] || w[l] == w[q] || w[l] == w[s])
						{
							continue;
						}
						if (((w[z] + w[q]) == (w[s] + w[l])) && ((w[z] + w[l]) > (w[s] + w[q])) && ((w[z] + w[s]) < w[q]))
						{
							for (i = 50; i >= 10; i = i - 10)
							{
								for (j = 0; j < 4; j++)
								{
									if (w[j] == i)
									{
										System.out.print(name[j]);
										System.out.print(" ");
										System.out.print(w[j]);
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
