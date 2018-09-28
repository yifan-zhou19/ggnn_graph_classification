package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void reserve(int num);
		int[] x = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			reserve(x[i]);
		}

		return 0;
	}

	public static void reserve(int a)
	{
		int j;
		int[] p = new int[1000];
		int q;
		int m;
		if (a == 0)
		{
			System.out.print("0");
		}
		else
		{
			if (a < 0)
			{
			System.out.print("-");
			a = -a;
			}
		for (j = 0;;j++)
		{
			p[j] = a % 10;
			a = a / 10;
			if (a == 0)
			{
				break;
			}
		}
		q = 0;
		m = j + 1;
		for (j = 0;j < m;j++)
		{
			if (p[j] == 0 && q == 0)
			{
				continue;
			}
			System.out.printf("%d",p[j]);
			q = 1;
		}
		}
		System.out.print("\n");
	}
}

