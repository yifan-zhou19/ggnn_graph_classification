package <missing>;

public class GlobalMembers
{
	public static int[] elm = new int[100];
	public static int counts = 0;
	public static int num = 0;
	public static void Try(int b,int s)
	{
		int j;
		for (j = 2;j <= num;j++)
		{
			if (j >= elm[s - 1])
			{
				if (b % j == 0)
				{
					elm[s] = j;
					if (b / j == 1)
					{
						counts++;
					}
					else if (b / j < j)
					{
						continue;
					}
					else
					{
						Try(b / j, s + 1);
					}
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			counts = 0;
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			Try(num, 1);
			System.out.print(counts);
			System.out.print("\n");
		}
		return 0;
	}

}

