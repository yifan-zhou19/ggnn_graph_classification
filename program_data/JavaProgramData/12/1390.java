package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[15];
		double num;
		double cnt;
		int i;
		for (int n = 0 ; n <= 99999 ; n++)
		{
			cnt = 0;
			for (i = 0 ; i <= 15 ; i++)
			{
				num = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				if (num == 0)
				{
					break;
				}
				else
				{
					a[i] = num;
				}
			}
			if (a[0] == -1)
			{
				break;
			}
			else
			{
				for (int j = 0 ; j <= i - 1 ; j++)
				{
					for (int k = 0 ; k <= i - 1 ; k++)
					{
						if (a[j] == 2 * a[k])
						{
							cnt++;
						}
					}
				}
			}
			System.out.print(cnt);
			System.out.print("\n");

		}
		return 0;
	}
}

