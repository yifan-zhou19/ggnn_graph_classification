package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int l;
		int a;
		int sum;
		int x;
		int y;
		int[] array = new int[100];
		int z;
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
		for (i = m,y = 0;i <= n;i++)
		{
			for (j = 2,k = 0;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
				if (j == i)
				{
					k = 1;
				}
				a = i;
			for (z = 0,sum = 0,l = 0;a >= 1;z++)
			{
				x = a % 10;
				a = a / 10;
				sum = sum * 10 + x;
			}
			if (sum == i)
			{
				l = 1;
			}
			if (l == 1 && k == 1)
			{
				array[y] = i;
				y++;
			}
		}
		if (y == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < y - 1;i++)
			{
			System.out.printf("%d,",array[i]);
			}
		System.out.printf("%d",array[i]);
		}
	}
}

