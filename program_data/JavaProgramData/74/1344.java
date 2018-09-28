package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int w = 0;
		int[] a = new int[50];
		int j = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int huiwen = int i;
		int susu = int i;
		for (i = m;i <= n;i++)
		{
			if (i == huiwen(i))
			{
				w = 1;
			}
			w = w * susu(i);
			if (w == 1)
			{
				a[j] = i;
				j++;
			}
		}
		if (j == 1)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 1;i < j - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[i]);
		}
		return 0;

	}
	public static int huiwen(int i)
	{
		int n = 0;
		while (i != 0)
		{
			n = i % 10 + 10 * n;
			i = i / 10;
		}
		return n;
	}
	public static int susu(int i)
	{
		int j;
		int w = 1;
		for (j = 2;j <= i / 2;j++)
		{
			if (i % j == 0)
			{
				w = 0;
			}
		}
		return w;
	}
}

