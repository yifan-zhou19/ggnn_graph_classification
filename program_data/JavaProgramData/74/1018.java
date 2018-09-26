package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k = 1;
		int m;
		int n;
		int x;
		int y;
		int z;
		int s = 0;
		int[] a = new int[10000];
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
		if (m <= 2)
		{
			a[0] = 2;
			s++;
		}
		if (m % 2 == 0)
		{
			m++;
		}
		for (i = m;i <= n;)
		{
			for (j = 3;j <= Math.sqrt(i);j++)
			{

				if (i % j == 0)
				{
					break;
				}
			}
			if (i % j == 0)
			{
				i = i + 2;
				continue;
			}
			x = i;
			y = 0;
			while (x > 0)
			{
				y *= 10;
				y += x % 10;
				x /= 10;
			}
			if (y == i)
			{
				a[s] = i;
				s++;
			}
			i = i + 2;
		}
		if (s == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i < s;i++)
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}

}

