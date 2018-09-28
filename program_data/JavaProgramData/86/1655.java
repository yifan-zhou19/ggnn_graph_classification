package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b = 0;
		int i = 0;
		int[] m = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				for (b = 0;b < a;b++)
				{

					m[b] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}

				for (b = 0;b < a;b++)
				{
					if ((m[b] + (b + 1) * 3) >= 60)
					{
						System.out.print(m[b]);
					break;
					}
					if (((m[b] + (b + 1) * 3) < 60) && ((m[b + 1] + (b + 2) * 3)>60))

					{
						if ((m[b + 1] + (b + 1) * 3) <= 60)
						{
						System.out.print(m[b + 1]);
						System.out.print("\n");
						break;
						}
					else
					{
						System.out.print((60 - (b + 1) * 3));
						System.out.print("\n");
					break;
					};
					}
				}
				if ((m[a - 1] + a * 3) < 60)
				{
					System.out.print((60 - a * 3));
					System.out.print("\n");
				}

			}
		}
		return 0;
	}
}

