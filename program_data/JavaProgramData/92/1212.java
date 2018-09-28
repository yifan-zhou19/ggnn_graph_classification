package <missing>;

public class GlobalMembers
{
	public static int[] qi = new int[1001];
	public static int[] tian = new int[1001];

	public static int cmp(Object e1, Object e2)
	{
		return *(int)e2 - (int)e1;
	}

	public static int Main()
	{
		int n;
		int count;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			count = 0;
			int i;
			int j;
			for (i = 0;i < n;i++)
			{
				tian[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				qi[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			qsort(tian,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(qi,n,(Integer.SIZE / Byte.SIZE),cmp);

			int l = 0;
			int m = 0;
			for (i = n - 1, j = n - 1;i >= l != 0 && j >= m;)
			{
				if (tian[i] < qi[j])
				{
					count--;
					i--;
					m++;
				}
				else if (tian[i] > qi[j])
				{
					count++;
					i--;
					j--;
				}
				else
				{
					if (tian[l] > qi[m])
					{
						count++;
						l++;
						m++;
					}
					else
					{
						if (qi[m] != tian[i])
						{
							count--;
						}
						m++;
						i--;
					}
				}
			}
			System.out.print(count * 200);
			System.out.print("\n");
		}
		return 0;
	}
}

