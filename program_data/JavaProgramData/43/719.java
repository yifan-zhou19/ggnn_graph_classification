package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int different;
		int mod;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3; i <= m / 2; i += 2)
		{
			for (int j = 2; j <= Math.sqrt(i); j++)
			{
				mod = i % j;
				if (mod != 0)
				{
					continue;
				}
				else
				{
					mod = 0;
					break;
				}
			}
				if (mod != 0 || i == 3)
				{
					different = m - i;
					for (int k = 2; k <= Math.sqrt(different); k++)
					{
						mod = different % k;
						if (mod != 0)
						{
							continue;
						}
						else
						{
							mod = 0;
							break;
						}
					}
					if (mod != 0 || different == 3)
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(different);
						System.out.print("\n");
					}
				}
				else
				{
					continue;
				}
		}
		return 0;
	}

}

