package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int num = 0;
		int n = 0;
		int t1 = 0;
		int t2 = 0;
		int shu = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (shu = 6;shu <= n;shu = shu + 2)
		{
			for (num = 3;num <= shu / 2;num = num + 2)
			{
				t1 = 0;
				for (i = 2;i <= Math.sqrt(num);i++)
				{
					if (num % i == 0)
					{
						t1 = 1;
						break;
					}
					else
					{
						continue;
					}
				}
				if (t1 == 1)
				{
					continue;
				}
				else
				{
					t2 = 0;
					for (i = 2;i <= Math.sqrt(shu - num);i++)
					{
						if ((shu - num) % i == 0)
						{
							t2 = 1;
							break;
						}
						else
						{
							continue;
						}
					}
				}
				if (t2 == 1)
				{
					continue;
				}
				else
				{
					System.out.print(shu);
					System.out.print("=");
					System.out.print(num);
					System.out.print("+");
					System.out.print(shu - num);
					System.out.print("\n");
				}
				break;
			}
		}
		return 0;
	}

}

