package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int s;
		int i;
		int j;
		int k;
		int flag = 1;
		int flag1 = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (s = 6;s <= n;s = s + 2)
		{

				flag = 1;
				flag1 = 1;


				for (a = 3;a <= s / 2;a = a + 2)
				{
					for (i = 3;i <= Math.sqrt(a);i = i + 2)
					{
						flag1 = 1;
						if (a % i == 0 || a % 2 == 0)
						{
							flag1 = 0;
							break;
						}
					}
					if (flag1 == 1)
					{
							for (i = 3;i <= Math.sqrt(s - a) + 1;i = i + 2)
							{
								flag = 1;
								if ((s - a) % i == 0 || (s - a) % 2 == 0)
								{
									flag = 0;
									break;
								}
								else
								{
									continue;
								}
							}
					}

					if (flag == 1)
					{
						System.out.print(s);
						System.out.print('=');
						System.out.print(a);
						System.out.print('+');
						System.out.print(s - a);
						System.out.print("\n");
						break;
					}
				}

		}

		return 0;
	}


}

