package <missing>;

public class GlobalMembers
{
	public static int compare(int s, int[] a, int n)
	{
		int i;
		int temp = 0;
		for (i = 0; i < n; i++)
		{
			if (s == a[i])
			{
				return 1;
				temp = 1;
				break;
			}
			else
			{
				continue;
			}
		}
		if (temp = 0)
		{
			return 0;
		}
	}

	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int i;
		int j;
		int w = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (compare(a[i], a, i) == 1)
			{
				a[i] = -1;
			}
			else
			{
				continue;
			}
		}
		for (i = 0; i < n; i++)
		{
			if (a[i] == -1)
			{
				continue;
			}
			else
			{
				if (w == 0)
				{
					System.out.printf("%d", a[i]);
				}
				else
				{
					System.out.printf(" %d", a[i]);
				}
				w++;
			}
		}
		System.out.print("\n");
		return 0;
	}
}

