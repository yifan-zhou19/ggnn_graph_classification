package <missing>;

public class GlobalMembers
{
	public static int number(int[] a, int m)
	{
		int i;
		int j;
		int s = 0;
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= m;j++)
			{
				if (a[i] == 2 * a[j])
				{
					s++;
				}
			}
		}
		return (s);
	}

	public static int Main()
	{
		int[] a = new int[17];
		int[] b = new int[100];
		int i;
		int j = 1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[1] = Integer.parseInt(tempVar);
		}
		while (a[1] != -1)
		{
			for (i = 2;i <= 16;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				if (a[i] == 0)
				{
					break;
				}
			}
			i--;
			b[j] = number(a, i);
			System.out.printf("%d\n",b[j]);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[1] = Integer.parseInt(tempVar3);
			}
			j++;
		}
	}
}

