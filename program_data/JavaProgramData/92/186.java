package <missing>;

public class GlobalMembers
{
	//Hungary Algorithm

	public static int[] a = new int[1010];
	public static int[] b = new int[1010];
	public static int n;
	public static int money;

	public static void sort(tangible.RefObject<Integer> array, int n)
	{
		int i = 0;
		int j = 0;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		for (i = 0;i < n - 1;i++)
		{
			for (p = array.argValue;p < array.argValue + n - 1 - i;p++)
			{
				if (*p < *(p + 1))
				{
					t = p;
					*p = (p + 1);
					*(p + 1) = t;
				}
			}
		}
	}

	public static int input()
	{

		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			return 0;
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		sort(tempRef_a, n);
		a = tempRef_a.argValue;
	tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
		sort(tempRef_b, n);
		b = tempRef_b.argValue;
		money = 0;
		return 1;
	}

	public static void Main()
	{
		while (input() != 0)
		{
			int i = 0;
			int j = 0;
			int backi = n - 1;
			int backj = n - 1;
			while (j < n && i <= backi)
			{
				if (b[j] < a[i])
				{
					money += 200;
					i++;
					j++;
				}
				else if (b[j] == a[i])
				{
					int x;
					int y;
					for (x = backi,y = backj;x >= i;x--,y--)
					{
						if (a[x] > b[y])
						{
							money += 200;
							backi--;
							backj--;
						}
						else
						{
							if (a[x] < b[j])
							{
								money -= 200;
							}
							x--;
							backi = x;
							backj = y;
							break;
						}
					}
					j++;
				}
				else
				{
					j++;
					money -= 200;
					backi--;
				}
			}
			System.out.printf("%d\n",money);
		}
	}


}

