package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int[] m = new int[100];
		int t;
		int k;
		int[] flag = {0, 0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6;i <= n;i += 2)
		{
			for (j = 3;j <= i / 2;j += 2)
			{
				flag[0] = 0;
				for (t = 3;t <= Math.sqrt(j);t += 2)
				{
					if (j % t == 0)
					{
						flag[0] = 1;
						break;
					}
				}
				if (flag[0] == 1)
				{
					continue;
				}
				flag[1] = 0;
				for (k = 3;k <= Math.sqrt(i - j);k += 2)
				{
					if ((i - j) % k == 0)
					{
						flag[1] = 1;
						break;
					}
				}
				if (flag[1] == 1)
				{
					continue;
				}
				else
				{
					System.out.print(i);
					System.out.print('=');
					System.out.print(j);
					System.out.print('+');
					System.out.print(i - j);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}



}

