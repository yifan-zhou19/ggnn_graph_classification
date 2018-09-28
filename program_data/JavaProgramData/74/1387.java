package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int q = 0;
		int b;
		int c;
		int d;
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
			b = i;
			c = 0;
			while (b > 0)
			{
				d = b % 10;
				c = c * 10 + d;
				b = b / 10;
			}
			if (c == i)
			{
				for (j = 2;j < i;j++)
				{
					if (i % j == 0)
					{
						break;
					}
				}
				if (j == i)
				{
					a[q] = i;
					q++;
				}
			}
		}
		if (a[0] == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",a[0]);
				for (i = 1;i < q;i++)
				{
					System.out.printf(",%d",a[i]);
				}
		}
		return 0;
	}


}

