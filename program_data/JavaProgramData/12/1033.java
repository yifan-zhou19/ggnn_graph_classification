package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int w;
		for (w = 1;;w++)
		{
		int[] a = new int[16];
		int b = 0;
		int i;
		int j;
		int q;
		for (i = 1;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[1] == -1)
			{
				break;
			}
			if (a[i] == 0)
			{
				break;
			}
			b++;
		}
		if (a[1] == -1)
		{
			break;
		}
		int m = 0;
		for (j = 1;j < b;j++)
		{
			for (q = j + 1;q <= b;q++)
			{
				if (a[j] == 2 * a[q])
				{
					m++;
				}
				else if (a[q] == 2 * a[j])
				{
					m++;
				}
			}
		}
		System.out.printf("%d\n",m);
		}
	}
}

