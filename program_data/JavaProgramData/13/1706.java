package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int x;
		int m = 0;
		int k = 0;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] shuzu = new int[n];
		for (i = 0;i < n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			shuzu[i] = x;
		}
		for (m = 0;m < n;m++)
		{
			if (m == 0)
			{
				System.out.print(shuzu[m]);
			}
			else
			{
				for (k = 0;k < m;k++)
				{
					if (shuzu[m] != shuzu[k])
					{
						t = 1;
					}
					else
					{
						t = 0;
						break;
					}
				}
				if (t == 1)
				{
					System.out.print(" ");
					System.out.print(shuzu[m]);
				}

			}

		}


		return 0;
	}


}

