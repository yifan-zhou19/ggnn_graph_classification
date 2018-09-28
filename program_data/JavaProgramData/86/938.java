package <missing>;

public class GlobalMembers
{
	public static int num(int m, int[] a)
	{
		int i;
		int time = 0;
		int count = 0;
		for (i = 0; ;i++)
		{
			if (m == 0)
			{
				return 60;
			}
			else
			{
				time = time + a[i];
				if (time < 60)
				{
					time = time + 3;
					count++;
					if (time < 60)
					{
						if (count < m)
						{
							time = time - a[i];
						}
						else
						{
							return a[i] + 60 - time;
						}

					}
					else
					{
						return a[i];
					}

				}
				else
				{
					return (a[i] - (time - 60));
				}
			}
		}

	}
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int[] a = new int[15];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0; j < m; j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			System.out.print(num(m, a));
			System.out.print("\n");

		}

		return 0;

	}


}

