package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return *(int)a - (int)b;

	}
	public static int chuli(int[] p, int i)
	{

		int count = 0;

		for (int q = 0;q < i;q++)
		{
			if (2 * (p[q]) > p[i - 1])
			{
				return count;
			}

			for (int j = q;j < i;j++)
			{

				if (p[j] == 2 * (p[q]))
				{
					count++;
					break;
				}
				if (p[j] > 2 * (p[q]))
				{
					break;
				}
			}
		}

		return count;
	}
	public static int Main()
	{
		//freopen("in.txt","r",stdin);
		int[] a = new int[20];
		int num;
		while ((a[0] != 0 && (a[0] != -1 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			int i = 1;
			while ((a[i] != 0 && a[i] = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				i++;
			}


			qsort(a,i,(Integer.SIZE / Byte.SIZE),cmp);

			num = chuli(a, i);
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}
}

