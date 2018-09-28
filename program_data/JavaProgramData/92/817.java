package <missing>;

public class GlobalMembers
{
	public static int mycompare(Object elem1, Object elem2)
	{
		return *(int)elem2 - (int)elem1;
	}

	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int n;
		int i;
		int total;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			total = 0;
			if (n == 0)
			{
				break;
			}
			for (i = 0; i < n; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					b[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0; i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			qsort(a, n, (Integer.SIZE / Byte.SIZE), mycompare);
			qsort(b, n, (Integer.SIZE / Byte.SIZE), mycompare);
			int p1 = 0;
			int p2 = n - 1;
			int p3 = 0;
			int p4 = n - 1;
			while (p1 <= p2)
			{
				if (a[p1] < b[p3])
				{
					p1++;
					p3++;
					total += 200;
				}
				else if (a[p2] < b[p4])
				{
					p2--;
					p4--;
					total += 200;
				}
				else
				{
					if (a[p1] > b[p4])
					{
						total -= 200;
					}
					p1++;
					p4--;
				}
			}
			System.out.print(total);
			System.out.print("\n");
		}
		return 0;
	}
}

