package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] tian = new int[1010];
		int[] qi = new int[1010];
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (i = 0; i < n; i++)
			{
				tian[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0; i < n; i++)
			{
				qi[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(tian, n, (Integer.SIZE / Byte.SIZE), cmp);
			qsort(qi, n, (Integer.SIZE / Byte.SIZE), cmp);
			int tmax = n - 1;
			int tmin = 0;
			int qmax = n - 1;
			int qmin = 0;
			int count = 0;
			int money = 0;
			while (count != n)
			{
				if (tian[tmax] > qi[qmax])
				{
					tmax--;
					qmax--;
					count++;
					money += 200;
				}
				else if (tian[tmin] > qi[qmin])
				{
					tmin++;
					qmin++;
					count++;
					money += 200;
				}
				else
				{
					if (tian[tmin] < qi[qmax])
					{
						money -= 200;
					}
					tmin++;
					qmax--;
					count++;
				}
			}
			System.out.print(money);
			System.out.print("\n");
		}
	}
}

