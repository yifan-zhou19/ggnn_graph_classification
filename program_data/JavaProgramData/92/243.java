package <missing>;

public class GlobalMembers
{
	public static int mycompare(Object elem1, Object elem2)
	{
		return *((int)elem2) - (int)elem1;
	}
	public static int Main()
	{
		int n;
		while ((n, n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			int[] a = new int[1000];
			int[] b = new int[1000];
			for (int i = 0; i < n; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0; i < n; i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(a, n, (Integer.SIZE / Byte.SIZE), mycompare);
			qsort(b, n, (Integer.SIZE / Byte.SIZE), mycompare);
			int index1_head = 0;
			int index1_tail = n - 1;
			int index2_head = 0;
			int index2_tail = n - 1;
			int money = 0;
			while (index1_head <= index1_tail)
			{
				if (a[index1_head] > b[index2_head])
				{
					index1_head++;
					index2_head++;
					money += 200;
				}
				else if (a[index1_tail] > b[index2_tail])
				{
					index1_tail--;
					index2_tail--;
					money += 200;
				}
				else
				{
					if (b[index2_head] > a[index1_tail])
					{
						money -= 200;
					}
					index1_tail--;
					index2_head++;
				}
			}
			System.out.print(money);
			System.out.print("\n");
		}
	return 0;
	}
}

