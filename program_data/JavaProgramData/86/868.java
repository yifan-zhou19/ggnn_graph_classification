package <missing>;

public class GlobalMembers
{
	// ?? ?? 1000062708
	public static int Main()
	{
		int a;
		int n;
		int m;
		int i;
		int t;
		int j;
		int sum;
		int flag;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			flag = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1;j <= m;j++)
			{
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (flag == 0)
				{

					t = a + 3 * j;
					if (t >= 63)
					{
						sum = 63 - 3 * j;
						flag = 1;
					}
					else if (t >= 60 && t < 63)
					{
						sum = a;
						flag = 1;
					}
					else
					{

						sum = 60 - 3 * j;
					}


				}
			}
			if (m == 0)
			{
				sum = 60;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}




}

