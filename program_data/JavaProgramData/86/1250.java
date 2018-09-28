package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[] k = new int[100];
		int count = 0;
		int tt;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			count = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m;j++)
			{
				k[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (m == 0)
			{
				tt = 60;
			}
			else if (k[j - 1] + 3 * j <= 60)
			{
			tt = 60 - j * 3;
			}
			else if (k[0] >= 60)
			{
				tt = 60;
			}
			else
			{
				for (j = 0;j < m;j++)
				{
					if (k[j] + 3 * (j + 1) >= 60 && k[j] + 3 * j <= 60)
					{
						tt = k[j];
						break;
					}
					else if (k[j] + 3 * (j + 1) < 60 && k[j + 1] + 3 * (j + 1)>60)
					{
						tt = 60 - 3 * (j + 1);
						break;
					}
				}
			}
			System.out.print(tt);
			System.out.print("\n");
		}
		return 0;
	}






}

