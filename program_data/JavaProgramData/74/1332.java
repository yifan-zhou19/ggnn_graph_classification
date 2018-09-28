package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int ii;
		int t = 1;
		for (ii = 2;ii <= (int)Math.sqrt(x);ii++)
		{
			if (x % ii == 0)
			{
				t = 0;
			}
		}
		if (t == 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int huiwen(int y)
	{
		int k;
		int t;
		t = y;
		k = 0;
		while (t != 0)
		{
			k = k * 10 + t % 10;
			t = t / 10;
		}
		if (k == y)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[100];
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (sushu(i) == 1 && huiwen(i) == 1)
			{
				j++;
				a[j] = i;
			}
		}
		if (j == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",a[1]);
			for (i = 2;i <= j;i++)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		return 0;
	}

}

