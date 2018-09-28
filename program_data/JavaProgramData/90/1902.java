package <missing>;

public class GlobalMembers
{
	public static int bai(int m, int n)
	{
		int x = 0;
		if (n == 1)
		{
			x = 1;
		}
		else
		{
			if (m < n)
			{
				x = bai(m, n - 1);
			}
			else
			{
				x = bai(m, n - 1) + bai(m - n, n);
			}
		}
		return x;
	}
	public static int Main()
	{
		int[] m = new int[100];
		int[] n = new int[100];
		int[] b = new int[100];
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < a;i++)
		{
			b[i] = bai(m[i], n[i]);
		}
		for (i = 0;i < a - 1;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		System.out.printf("%d",b[a - 1]);
		return 0;
	}

}

