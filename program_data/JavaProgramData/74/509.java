package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int flag;
		int e;
		int m;
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int s;
		int k;
		int count = 0;
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
		for (k = m;k <= n;k++)
		{
			i = k;
			flag = 0;
			e = i;
			for (j = 0;i != 0;i = i / 10)
			{
				j = 10 * j;
				j += i % 10;
			}
			if (e == j)
			{
				for (s = 2;s <= e / 2;s++)
				{
					if (e % s == 0)
					{
						flag = 1;
					}
				}
				if (flag == 0)
				{
					a[count] = k;
					count++;
				}
			}
		}
			if (count == 0)
			{
				System.out.print("no");
			}
			if (count != 0)
			{
				System.out.printf("%d",a[0]);
				for (i = 1;i < count;i++)
				{
					System.out.printf(",%d",a[i]);
				}
			}
	}
}

