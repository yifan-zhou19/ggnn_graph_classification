package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max = new int(int x,int y);
		int[] a = new int[100];
		int m = 0;
		int x = 0;
		int j;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[1] = Integer.parseInt(tempVar);
		}
		while (System.in.read() == ',')
		{
			i++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		if (i != 1)
		{
			for (j = 1;j <= i;j++)
			{
				m = max(m, a[j]);
			}
			for (j = 1;j <= i;j++)
			{
				if (a[j] == m)
				{
					a[j] = 0;
				}
			}
			for (j = 1;j <= i;j++)
			{
				x = max(x, a[j]);
			}
			if (x != 0)
			{
				System.out.printf("%d\n",x);
			}
			else
			{
				System.out.print("No\n");
			}
		}
		else
		{
			System.out.print("No\n");
		}
	}
	public static int max(int x,int y)
	{
		int z;
		if (x > y)
		{
			z = x;
		}
		else
		{
			z = y;
		}
		return z;
	}
}

